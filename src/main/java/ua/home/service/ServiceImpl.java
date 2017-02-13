package ua.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ua.home.dao.DAO;

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
    public <T> List<T> select(Class<T> tClass,String name,String value) {
        Map<String,String> map = new HashMap<String, String>();
        map.put(name,value);
        return dao.select(tClass,map);
    }

}
