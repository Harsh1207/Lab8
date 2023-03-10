package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private ArrayList<City> citylist = new ArrayList<>();


    @Test
    public void testAddCity() {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");

        list.addCity(city);
        assertEquals(1, list.getCount());
    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Regina", "Saskatchewan");
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testDelete() {
        CustomList list = new CustomList(null, citylist);
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }
    @Test
    public void testCount(){

//        CustomList list = new CustomList(null, citylist);
//        assertEquals(0,list.countCities());


    }


}
