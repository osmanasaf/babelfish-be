package com.codefirst.babelfish.service.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Optional;

@Service
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

    public T update(T entity) {
        return repository.save(entity);
    }

    public void deleteById(ID id) {
        repository.deleteById(id);
    }
}
