package ua.home.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.home.dao.entities.Countries;

import java.util.List;
import java.util.Map;

/**
 * Created by xnx_ on 07.02.2017.
 */@Repository
public class DAOImpl implements DAO {

    @Autowired
    private SessionFactory sessionFactory;

    public <T> void create(T t) {
        persist(t);
    }

    public <T> void update(T t) {
        persist(t);
    }

    public <T> void delete(T t) {
        sessionFactory.getCurrentSession().delete(t);
    }

    public <T,V> List<T> select(Class<T> tClass,Map<String,V> params) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(tClass);
        for (Map.Entry<String,V> entry:params.entrySet())
        criteria.add(Restrictions.eq(entry.getKey(),entry.getValue()));
        List<T> list = criteria.list();
        return list;
    }

    public void dublicatecreate(Countries c) {
        persist(c);
    }

    public <T, V> List<T> selectOrder(Class<T> tClass, Map<String, V> params, boolean isAcc, String orderColumn) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(tClass);
        for (Map.Entry<String,V> entry:params.entrySet())
            criteria.add(Restrictions.eq(entry.getKey(),entry.getValue()));
        if (isAcc)
            criteria.addOrder(Order.asc(orderColumn));
        else
            criteria.addOrder(Order.desc(orderColumn));
        List<T> list = criteria.list();
        return list;
    }

    public <T, V> T selectMax(String date, Map<String, V> params, Class tClass) {
        Session session = sessionFactory.getCurrentSession();

        Criteria criteria = session.createCriteria(tClass);
        for (Map.Entry<String,V> entry:params.entrySet())
            criteria.add(Restrictions.eq(entry.getKey(),entry.getValue()));
        criteria.addOrder(Order.desc(date));
        criteria.setMaxResults(1);
        return null;
    }

    private <T> void persist(T t){
        sessionFactory.getCurrentSession().persist(t);
    }
}
