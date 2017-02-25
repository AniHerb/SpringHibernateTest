package ua.home.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import ua.home.configuration.BeanConfigurator;
import ua.home.dao.entities.*;

import java.util.Date;
import java.util.List;

/**
 * Created by xnx_ on 15.02.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfigurator.class, loader = AnnotationConfigContextLoader.class)
public class ServiceTest {
    @Autowired
    private Service service;
    private Persons persons;

    @Test
    public void testCreate() throws Exception {

    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }


    @Test
    public void testSelect() throws Exception {

        service.select(Countries.class,"name","Italy");

    }

    @Test
    public void testExceptionTest() throws Exception {
        service.exceptionTest();
    }

    @Test

    public void createBookOperation ()throws Exception {

        Books books = service.select(Books.class,"name","JSON").get(0);

        Persons persons = service.select(Persons.class,"fio","Vasul").get(0);

        OperatonType operatonType = service.select(OperatonType.class,"name","output").get(0);

        BooksOperations booksOperations = new BooksOperations();
        booksOperations.setPersons(persons);
        booksOperations.setBooks(books);
        booksOperations.setOperatonType(operatonType);
        booksOperations.setCount(1);
        booksOperations.setDate(new Date());

        service.create(booksOperations);

    }

    @Test
    public void createBookOperationVasul (){

        Persons persons = new Persons();
        persons.setAddresses(service.select(Addresses.class,"id",1L).get(0));
        persons.setFio("Vasul");
        service.create(persons);
    }

    @Test
    public void createBookOperationVasul2 (){

        Persons persons = new Persons();
        persons.setAddresses(service.select(Addresses.class,"id",1L).get(0));
        persons.setFio("Vasul");
        persons.setIdentification("1");
        service.create(persons);
    }


    @Test
    public void giveBookToPerson() {
        Persons p = getPersons();
        Books b = getBooks();
        OperatonType operatonType = getOperationType();
        BooksOperations op = generateBookOperaton(p, b,operatonType);
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