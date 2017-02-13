package ua.home.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import ua.home.configuration.BeanConfigurator;
import ua.home.dao.entities.Countries;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xnx_ on 11.02.2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfigurator.class, loader = AnnotationConfigContextLoader.class)
public class DAOTest {
    @Autowired
    private DAO dao;

    @org.junit.Test
    @Transactional
    public void testCreate() throws Exception {
        Countries c = new Countries();
        String name = ""+System.currentTimeMillis();
        c.setName(name);
        dao.create(c);

        Map<String,String> map = new HashMap<String, String>();
        map.put("name",name);
        List<Countries> list = dao.select(Countries.class,map);
        if (list.isEmpty()) throw new RuntimeException("Not created element "+c.getName());
        Countries c_get = list.get(0);
        Assert.assertEquals(name,c_get.getName());
        /*if (!c_get.getName().equals(name)){
            throw new RuntimeException("not equals object get from dao.select ");
        }*/

    }

    @org.junit.Test
    @Transactional
    public void testUpdate() throws Exception {
        Countries c = new Countries();
        String name = ""+System.currentTimeMillis();
        c.setName(name);
        dao.update(c);

        Map<String,String> map = new HashMap<String, String>();
        map.put("name",name);
        List<Countries> list = dao.select(Countries.class,map);

        Assert.assertEquals(list.isEmpty(),false);

        Countries c_get = list.get(0);
        Assert.assertEquals(name,c_get.getName());
    }

    @org.junit.Test
    @Transactional
    public void testDelete() throws Exception {
        String name = "Italy";
        Map<String,String> map = new HashMap<String, String>();
        map.put("name",name);
        List<Countries> list = dao.select(Countries.class,map);
        Countries c = list.get(0);
        dao.delete(c);


        Assert.assertEquals(list.isEmpty(),false);
        Countries c_get = list.get(0);

        Assert.assertEquals(name,c_get.getName());
    }

    @org.junit.Test
    @Transactional
    public void testSelect() throws Exception {
        String name = "Italy";
        Map<String,String> map = new HashMap<String, String>();
        map.put("name",name);
        List<Countries> list = dao.select(Countries.class,map);

        Assert.assertEquals(list.isEmpty(),false);
        Countries c_get = list.get(0);

        Assert.assertEquals(name,c_get.getName());
    }

    @Test
    @Transactional
    public  void testDublicateCreate(){
        Countries c = new Countries();
        String name = ""+System.currentTimeMillis();
        c.setName(name);
        dao.dublicatecreate(c);

        Map<String,String> map = new HashMap<String, String>();
        map.put("name",name);
        List<Countries> list = dao.select(Countries.class,map);
        if (list.isEmpty()) throw new RuntimeException("Not created element "+c.getName());
        Countries c_get = list.get(0);
        Assert.assertEquals(name,c_get.getName());
    }
}