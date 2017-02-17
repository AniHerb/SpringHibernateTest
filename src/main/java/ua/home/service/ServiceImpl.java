package ua.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.home.dao.DAO;
import ua.home.dao.entities.BooksOperations;
import ua.home.dao.entities.OperatonType;
import ua.home.dao.entities.Persons;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xnx_ on 11.02.2017.
 */
public class ServiceImpl implements Service {
    @Autowired
    private DAO dao;
    @Transactional
    public <T> void create(T t) {
        dao.create(t);
    }
    @Transactional
    public <T> void update(T t) {
        dao.update(t);
    }
    @Transactional
    public <T> void delete(T t) {
        dao.delete(t);
    }
    @Transactional
    public <T,V> List<T> select(Class<T> tClass,String name,V value) {
        Map<String,V> map = new HashMap<String, V>();
        map.put(name,value);
        return dao.select(tClass,map);
    }

    public void exceptionTest() {
        throw new RuntimeException("Special exception");
    }

    @Transactional
    public void createBookOperation(BooksOperations operations) {
        validateBookOperation(operations);
        dao.create(operations);
    }

    private void validateBookOperation(BooksOperations operations) {
        if (operations == null) throw new IllegalStateException("Operation cannot be null");
        BooksOperations lastBooksOperations = getLastOperation(operations.getPersons());
        boolean isCanGiveBook = checkLastLastBookOperation(lastBooksOperations);
        if (!isCanGiveBook) throw new RuntimeException("Cannot give book to person "+operations.getPersons().getFio()+" cause he did not return another book")
    }

    private boolean checkLastLastBookOperation(BooksOperations lastBooksOperations) {
        if (lastBooksOperations.getOperatonType().getName().equals("inpute")) return false;
        else
            return true;
    }

    private BooksOperations getLastOperation(Persons persons) {
        Map<String,Persons> parameters = new HashMap<String, Persons>();
        parameters.put("persons",persons);
        List<BooksOperations> list =  dao.selectOrder(BooksOperations.class,parameters,
                false,"date");
        BooksOperations lastBooksOperations = list.get(0);
        return lastBooksOperations;

    }



}
