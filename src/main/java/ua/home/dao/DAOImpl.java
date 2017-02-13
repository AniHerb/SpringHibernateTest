package ua.home.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

    public <T> List<T> select(Class<T> tClass,Map<String,String> params) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(tClass);
        for (Map.Entry<String,String> entry:params.entrySet())
        criteria.add(Restrictions.eq(entry.getKey(),entry.getValue()));
        List<T> list = criteria.list();
        return list;
    }

    public void dublicatecreate(Countries c) {
        persist(c);
    }

    private <T> void persist(T t){
        sessionFactory.getCurrentSession().persist(t);
    }

/*    public void createCity(Cities cities) {
        sessionFactory.getCurrentSession().persist(cities);
    }

    public List<Cities> getCities(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Cities.class);
        criteria.add(Restrictions.eq("name",str));
        List<Cities> list = criteria.list();
        return list;    }

    public void updateCities(Cities cities) {
        sessionFactory.getCurrentSession().persist(cities);
    }

    public void deleteCities(Cities cities) {
        sessionFactory.getCurrentSession().delete(cities);
    }

    public void createCountries(Countries countries) {
        sessionFactory.getCurrentSession().persist(countries);
    }

    public List<Countries> getCountries(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Countries.class);
        criteria.add(Restrictions.eq("name",str));
        List<Countries> list = criteria.list();
        return list;
    }

    public void updateCountries(Countries countries) {
        sessionFactory.getCurrentSession().persist(countries);
    }

    public void deleteCountries(Countries countries) {
        sessionFactory.getCurrentSession().delete(countries);
    }

    public void createStreets(Streets streets) {
        sessionFactory.getCurrentSession().persist(streets);
    }

    public List<Streets> getStreets(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Streets.class);
        criteria.add(Restrictions.eq("name",str));
        List<Streets> list = criteria.list();
        return list;
    }

    public void updateStreets(Streets streets) {
        sessionFactory.getCurrentSession().persist(streets);
    }

    public void deleteStreets(Streets streets) {
        sessionFactory.getCurrentSession().delete(streets);
    }

    public void createAddresses(Addresses addresses) {
        sessionFactory.getCurrentSession().persist(addresses);
    }

    public List<Addresses> getAddresses(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Addresses.class);
        criteria.add(Restrictions.eq("name",str));
        List<Addresses> list = criteria.list();
        return list;
    }

    public void updateAddresses(Addresses addresses) {

        sessionFactory.getCurrentSession().persist(addresses);
    }

    public void deleteAddresses(Addresses addresses) {
        sessionFactory.getCurrentSession().delete(addresses);
    }

    public void createPersons(Persons persons) {
        sessionFactory.getCurrentSession().persist(persons);
    }

    public List<Persons> getPersons(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Persons.class);
        criteria.add(Restrictions.eq("fio",str));
        List<Persons> list = criteria.list();
        return list;
    }

    public void updatePersons(Persons persons) {
        sessionFactory.getCurrentSession().persist(persons);
    }

    public void deletePersons(Persons persons) {
        sessionFactory.getCurrentSession().delete(persons);
    }

    public void createBooks(Books books) {
        sessionFactory.getCurrentSession().persist(books);
    }

    public List<Books> getBooks(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(Books.class);
        criteria.add(Restrictions.eq("name",str));
        List<Books> list = criteria.list();
        return list;
    }

    public void updateBooks(Books books) {
        sessionFactory.getCurrentSession().persist(books);
    }

    public void deleteBooks(Books books) {
        sessionFactory.getCurrentSession().delete(books);
    }

    public void createOperatonType(OperatonType operatonType) {
        sessionFactory.getCurrentSession().persist(operatonType);
    }

    public List<OperatonType> getOperatonType(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(OperatonType.class);
        criteria.add(Restrictions.eq("name",str));
        List<OperatonType> list = criteria.list();
        return list;
    }

    public void updateOperatonType(OperatonType operatonType) {
        sessionFactory.getCurrentSession().persist(operatonType);
    }

    public void deleteOperatonType(OperatonType operatonType) {
        sessionFactory.getCurrentSession().delete(operatonType);
    }

    public void createBooksOperations(BooksOperations booksOperations) {
        sessionFactory.getCurrentSession().persist(booksOperations);
    }

    public List<BooksOperations> getBooksOperations(String str) {
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(BooksOperations.class);
        criteria.add(Restrictions.eq("name",str));
        List<BooksOperations> list = criteria.list();
        return list;
    }

    public void updateBooksOperations(BooksOperations booksOperations) {
        sessionFactory.getCurrentSession().persist(booksOperations);
    }

    public void deleteBooksOperations(BooksOperations booksOperations) {
        sessionFactory.getCurrentSession().delete(booksOperations);
    }

    public List<BooksOperations> getOperationsBooksByBook(Books books) {
       Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(BooksOperations.class);
        criteria.add(Restrictions.eq("books.id",books.getId()));
//        criteria.add(Restrictions.eq("books_id",books.getId()));
        List<BooksOperations> list = criteria.list();
        return list;
    }*/
}
