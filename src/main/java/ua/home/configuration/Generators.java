package ua.home.configuration;

import ua.home.dao.entities.Cities;
import ua.home.dao.entities.Countries;
import ua.home.dao.entities.Streets;

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


}
