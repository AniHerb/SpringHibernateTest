package ua.home.configuration;

import ua.home.dao.entities.*;

/**
 * Created by xnx_ on 23.02.2017.
 */
public class Generators {
    public  Countries generateCoutries(){
        Countries c = new Countries();
        c.setName("Test_Country");
        return c;
    }

    public  Cities generateCities(){
        Cities c = new Cities();
        c.setName("Test_Cities");
        c.setCountry(generateCoutries());
        return c;
    }

    public Streets generateStreets(){
        Streets s = new Streets();
        s.setName("TestStreet");
        s.setCity(generateCities());
        return s;
    }

    public Addresses generateAddresses(){
        Addresses addresses = new Addresses();
        addresses.setFlatNumber("61");
        addresses.setHouseNumber("2");
        addresses.setStreets(generateStreets());
        return addresses;
    }

    public Persons generatePersons (){
        Persons persons = new Persons();
        persons.setFio("Nazar");
        persons.setIdentification("123456789");
        persons.setAddresses(generateAddresses());
        return persons;
    }


}
