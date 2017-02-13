package ua.home.service;

import java.util.List;

/**
 * Created by xnx_ on 11.02.2017.
 */
public interface Service {

    <T> void create(T t);

    <T> void update(T t);

    <T> void delete(T t);

    <T> List<T> select(Class<T> t, String name,String value);
}
