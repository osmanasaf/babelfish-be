package com.codefirst.babelfish.service.base;

import com.codefirst.babelfish.dto.CustomerDto;
import com.codefirst.babelfish.model.Customer;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.Optional;

public abstract class BaseService<T, ID extends Serializable, R extends JpaRepository<T, ID>> {

    protected final R repository;

    public BaseService(R repository) {
        this.repository = repository;
    }

    public Optional<T> getById(ID id) {
        return repository.findById(id);
    }

    public Iterable<T> getAll() {
        return repository.findAll();
    }

    public T create(T entity) {
        return repository.save(entity);
    }

    public T update(ID id, T entity) {
        Optional<T> existingEntity = repository.findById(id);
        if (existingEntity.isPresent()) {
            T updatedEntity = repository.save(entity);
            return updatedEntity;
        } else {
            throw new EntityNotFoundException("Entity with ID " + id + " not found.");
        }
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
