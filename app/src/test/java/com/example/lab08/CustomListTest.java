package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn'texist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City van = new City("Vancouver", "BC");
        list.addCity(calgary);
        list.addCity(van);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }
    @Test
    public void testCountCities(){
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City van = new City("Vancouver", "BC");
        list.addCity(van);
        list.addCity(calgary);
        assertEquals(2,list.countCities());
    }
}