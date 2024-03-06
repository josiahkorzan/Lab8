package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     */
    @BeforeEach
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
        list.addCity(new City("Edmonton", "AB"));
    }

    @Test
    public void hasCityTest() {
        Assertions.assertTrue(list.hasCity(new City("Edmonton", "AB")));
        Assertions.assertFalse(list.hasCity(new City("Nonexistent", "AB")));
    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount();
        list.deleteCity(new City("Edmonton", "AB"));
        assertEquals(list.getCount(), listSize - 1);
        Assertions.assertFalse(list.hasCity(new City("Edmonton", "AB")));
    }

    @Test
    public void addCitiesTest() {
        assertEquals(1, list.getCount());
        list.addCity(new City("Another City", "AB"));
        assertEquals(2, list.getCount());
    }


}
