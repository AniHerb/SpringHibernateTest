package ua.home.service;

import ua.home.dao.entities.BooksOperations;

import java.util.List;

/**
 * Created by xnx_ on 11.02.2017.
 */
public interface Service {

    <T> void create(T t);

    <T> void update(T t);

    <T> void delete(T t);

    <T,V> List<T> select(Class<T> t, String name,V value);

    void exceptionTest ();

    void createBookOperation(BooksOperations operations);
}
