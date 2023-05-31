package com.codefirst.babelfish.scheduler;

import com.codefirst.babelfish.model.*;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class BillScheduler {



    @Scheduled(cron = "0 0 0 1 * *") // Her ayın ilk günü saat 00:00'da çalışacak
    public void createBill() {
        List<ProcessPayment> expiredPayments = getExpiredProcessPayment();
        
        for (ProcessPayment payment : expiredPayments) {
            Employee employee = payment.getEmployee();
            Project project = employee.getEmployeeProjects().getProject();
            Customer customer = project.getCustomer();
            
            double amount = payment.getEstimatedAmount();
            String paymentTerm = customer.getPaymentTerm();
            Bill bill = Bill.builder()
                    .amount(amount)
                    .date(LocalDate.now())
                    .employee(employee)
                    .project(project)
                    .paymentTerm(paymentTerm)
                    .billNumber(generateBillNumber())
                    .build();

            //Save repo
        }
    }
    
    private List<ProcessPayment> getExpiredProcessPayment() {


        return new ArrayList<>();
    }
    
    private String generateBillNumber() {
        // varsayılan olarak boş bir fatura numarası dönüyoruz ancak genel bir oluşturma mekanizması varsa burada oluşturabiliriz
        return "";
    }
}
