package ua.home.run;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.home.configuration.BeanConfigurator;
import ua.home.dao.entities.Cities;
import ua.home.service.Service;

/**
 * Created by xnx_ on 07.02.2017.
 */
public class Main {

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger userLogger = LogManager.getLogger(Service.class);

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(BeanConfigurator.class);

        System.out.println("We started!!!!");
//

        Service service = ctx.getBean(Service.class);
        rootLogger.info(service);
        Cities cities = service.select(Cities.class,"name","Rome").get(0);
        userLogger.info(cities);
//        System.out.println(cities);

        //userLogger.info(service.select());


//        OperatonType operatonType = new OperatonType();
//        operatonType.setName("inpute");
//        service.createOperatonType(operatonType);
//
//        operatonType = new OperatonType();
//        operatonType.setName("output");
//        service.createOperatonType(operatonType);


//        Books books = new Books();
//        books.setName("JSON");
//        books.setAutuhors("now name");
//        books.setIOSN("3565346345");
//
//        Calendar c = Calendar.getInstance();
//        c.setTime(new Date());
//        c.add(Calendar.YEAR,2017);
//        c.add(Calendar.MONTH,10);
//        c.add(Calendar.DAY_OF_MONTH,5);
//
//        Date date = c.getTime();
//
//        books.setDate(date);
//        service.createBooks(books);

//        BooksOperations booksOperations = new BooksOperations();
//        booksOperations.setDate(date);
//        Books books = service.getBooks("JSON").get(0);
//        booksOperations.setBooks(books);
//        booksOperations.setPersons(service.getPersons("Nazar").get(0));
//        booksOperations.setOperatonType(service.getOperatonType("inpute").get(0));
//
//        service.createBooksOperations(booksOperations);
//
        /*Books books = service.getBooks("JSON").get(0);
        List<BooksOperations> list = service.getOperationsBooksByBook(books);
        System.out.println(list);*/

//        Countries countries = service.getCountries("Italy").get(0);
//        service.deleteCountries(countries);
//

//        Countries countries = new Countries();
//        countries.setName("Italy");
//        service.createCountries(countries);



//
//        Service service =  ctx.getBean(Service.class);
//        Countries c = new Countries();
//        c.setId(4l);
//        c.setName("lviv");


//        Countries countries = service.getCountries("Italy").get(0);
//        Cities cities = new Cities();
//        cities.setId(46L);
//        cities.setName("Rome");
//        cities.setCountry(countries);
//        service.createCites(cities);

//        Cities cities = service.getCities("Rome").get(0);
//        Streets streets = new Streets();
//        streets.setId(55L);
//        streets.setName("sqvP");
//        streets.setCity(cities);
//        service.createStreets(streets);


    }

}
