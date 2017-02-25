package ua.home.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import ua.home.configuration.BeanConfigurator;
import ua.home.configuration.Generators;
import ua.home.dao.entities.Books;
import ua.home.dao.entities.BooksOperations;
import ua.home.dao.entities.OperatonType;
import ua.home.dao.entities.Persons;
import ua.home.exceprion.ApplicationException;

import java.util.Date;
import java.util.List;

/**
 * Created by xnx_ on 23.02.2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfigurator.class, loader = AnnotationConfigContextLoader.class)
public class RealServiceTest {


    @Autowired
    private Generators generators;

    @Autowired
    private Service service;


    /*@Before
    public void generateData(){
        service.create(generators.generateStreets());
    }*/


    @Test(expected = ApplicationException.class)
    @Transactional
    public void testAvoidDublicateOutputBookInThePeopleWhoDoNotReutrnPreviousBook(){
        Persons p = getPersons();
        Books b = getBooks();
        OperatonType operatonType = getOperationType();
        BooksOperations op = generateBookOperaton(p, b,operatonType);
        service.createBookOperation(op);
        service.createBookOperation(op);
    }

    private OperatonType getOperationType() {
        return service.select(OperatonType.class,"name","output").get(0);
    }

    private BooksOperations generateBookOperaton(Persons p, Books b, OperatonType operatonType) {
        BooksOperations bo = new BooksOperations();
        bo.setBooks(b);
        bo.setPersons(p);
        bo.setOperatonType(operatonType);
        bo.setDate(new Date());
        return bo;
    }

    private Books getBooks() {
        return service.select(Books.class,"name","JSON").get(0);
    }

    public Persons getPersons() {
        List<Persons> p = service.select(Persons.class,"fio","Vasul");
        return p.get(0);
    }


}
