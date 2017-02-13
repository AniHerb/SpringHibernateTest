package ua.home.service;

import ua.home.dao.entities.*;

import java.util.List;

/**
 * Created by xnx_ on 07.02.2017.
 */
public interface ServiceDel {
    void createCites(Cities cities);
    List<Cities> getCities (String str);
    void updateCities (Cities cities);
    void deleteCities (Cities cities);

    void createCountries(Countries countries);
    List<Countries> getCountries (String str);
    void updateCountries (Countries countries);
    void deleteCountries (Countries countries);

    void createStreets (Streets streets);
    List<Streets> getStreets (String str);
    void updateStreets (Streets streets);
    void deleteStreets (Streets streets);

    void createAddresses (Addresses addresses);
    List<Addresses> getAddresses (String str);
    void updateAddresses (Addresses addresses);
    void deleteAddresses (Addresses addresses);

    void createPersons (Persons persons);
    List<Persons> getPersons (String str);
    void updatePersons (Persons persons);
    void deletePersons (Persons persons);

    void createBooks (Books books);
    List<Books> getBooks (String str);
    void updateBooks (Books books);
    void deleteBooks (Books books);

    void createOperatonType (OperatonType operatonType);
    List<OperatonType> getOperatonType (String str);
    void updateOperatonType (OperatonType operatonType);
    void deleteOperatonType (OperatonType operatonType);

    void createBooksOperations (BooksOperations booksOperations);
    List<BooksOperations> getBooksOperations (String str);
    void updateBooksOperations (BooksOperations booksOperations);
    void deleteBooksOperations (BooksOperations booksOperations);

    List<BooksOperations> getOperationsBooksByBook (Books books);

}
