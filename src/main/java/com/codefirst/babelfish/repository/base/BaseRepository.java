package com.codefirst.babelfish.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {

    Optional<T> findById(ID id);

    List<T> findAll();

    void delete(T entity);

    void deleteById(ID id);
}
