package ua.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import ua.home.dao.DAO;

import java.util.List;

/**
 * Created by xnx_ on 07.02.2017.
 */
public class ServicesImplDel implements Service {

    @Autowired
    private DAO dao;

  /*  @Transactional
    public void createCites(Cities cities) {
        dao.createCity(cities);
    }
    @Transactional
    public List<Cities> getCities(String str) {
        return dao.getCities(str);
    }
    @Transactional
    public void updateCities(Cities cities) {
        dao.updateCities(cities);
    }
    @Transactional
    public void deleteCities(Cities cities) {
        dao.deleteCities(cities);
    }
    @Transactional
    public void createCountries(Countries countries) {
        dao.createCountries(countries);
    }
    @Transactional
    public List<Countries> getCountries(String str) {
        return dao.getCountries(str);
    }

    @Transactional
    public void updateCountries(Countries countries) {
        dao.updateCountries(countries);
    }
    @Transactional
    public void deleteCountries(Countries countries) {
        dao.deleteCountries(countries);
    }
    @Transactional
    public void createStreets(Streets streets) {
        dao.createStreets(streets);
    }
    @Transactional
    public List<Streets> getStreets(String str) {
        return dao.getStreets(str);
    }
    @Transactional
    public void updateStreets(Streets streets) {
        dao.updateStreets(streets);
    }
    @Transactional
    public void deleteStreets(Streets streets) {
        dao.deleteStreets(streets);
    }
    @Transactional
    public void createAddresses(Addresses addresses) {
        dao.createAddresses(addresses);
    }
    @Transactional
    public List<Addresses> getAddresses(String str) {
        return dao.getAddresses(str);
    }
    @Transactional
    public void updateAddresses(Addresses addresses) {
        dao.updateAddresses(addresses);
    }
    @Transactional
    public void deleteAddresses(Addresses addresses) {
        dao.deleteAddresses(addresses);
    }
    @Transactional
    public void createPersons(Persons persons) {
        dao.createPersons(persons);
    }
    @Transactional
    public List<Persons> getPersons(String str) {
        return dao.getPersons(str);
    }
    @Transactional
    public void updatePersons(Persons persons) {
        dao.updatePersons(persons);
    }
    @Transactional
    public void deletePersons(Persons persons) {
        dao.deletePersons(persons);
    }
    @Transactional
    public void createBooks(Books books) {
        dao.createBooks(books);
    }
    @Transactional
    public List<Books> getBooks(String str) {
        return dao.getBooks(str);
    }
    @Transactional
    public void updateBooks(Books books) {
        dao.updateBooks(books);
    }
    @Transactional
    public void deleteBooks(Books books) {

        dao.deleteBooks(books);
    }
    @Transactional
    public void createOperatonType(OperatonType operatonType) {
        dao.createOperatonType(operatonType);
    }
    @Transactional
    public List<OperatonType> getOperatonType(String str) {
        return dao.getOperatonType(str);
    }
    @Transactional
    public void updateOperatonType(OperatonType operatonType) {
        dao.updateOperatonType(operatonType);
    }
    @Transactional
    public void deleteOperatonType(OperatonType operatonType) {
        dao.deleteOperatonType(operatonType);
    }
    @Transactional
    public void createBooksOperations(BooksOperations booksOperations) {
        dao.createBooksOperations(booksOperations);
    }
    @Transactional
    public List<BooksOperations> getBooksOperations(String str) {
        return dao.getBooksOperations(str);
    }
    @Transactional
    public void updateBooksOperations(BooksOperations booksOperations) {
        dao.updateBooksOperations(booksOperations);
    }
    @Transactional
    public void deleteBooksOperations(BooksOperations booksOperations) {
        dao.deleteBooksOperations(booksOperations);
    }
    @Transactional
    public List<BooksOperations> getOperationsBooksByBook(Books books) {
        return dao.getOperationsBooksByBook(books);
    }
*/
    public <T> void create(T t) {

    }

    public <T> void update(T t) {

    }

    public <T> void delete(T t) {

    }

    public <T> List<T> select(Class<T> t, String name, String value) {
        return null;
    }

    public <T> List<T> select(String name) {
        return null;
    }
}
