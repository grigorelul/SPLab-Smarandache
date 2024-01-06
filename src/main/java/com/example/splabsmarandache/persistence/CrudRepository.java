package com.example.splabsmarandache.persistence;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudRepository <T, ID> {
    //Functiile din CrudRepository sunt preluate din JpaRepository

    <S extends T> S save(S entity);

    <S extends T> Iterable<S> saveAll(Iterable<S> entities);

    Optional<T> findById(ID id);

    boolean existsById(ID id);

    List<T> findAll();

    long count();

    void deleteById(ID id);

    void delete(T entity);

    void deleteAll(Iterable<? extends T> entities);

    void deleteAll();
}
