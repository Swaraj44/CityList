package com.example.citylist;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "AB");
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "SK");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    public void testAddException() {
        CityList cityList = new CityList();
        City city = mockCity();
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    public void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test

    public void test_delete() {
        CityList cityList = new CityList();

        City citya = new City("Charlottetown", "Prince Edward Island");
        City cityb = new City("jessore", "Khulna");

        cityList.add(citya);
        cityList.add(cityb);

        cityList.delete(citya);

        assertTrue(!cityList.getCities().contains(citya));
        assertEquals(1, cityList.getCities().stream().count());

    }





    @Test

    public void test_delete_exception() {
        CityList cityList = new CityList();

        City citya = new City("Charlottetown", "Prince Edward Island");
        City cityb = new City("jessore", "Khulna");

        cityList.add(citya);
        cityList.add(cityb);

        cityList.delete(citya);

        assertThrows(IllegalArgumentException.class,()->{
            cityList.delete(cityb);
        });

    }


    @Test

    public void test_count() {
        CityList cityList = new CityList();

        City citya = new City("Charlottetown", "Prince Edward Island");
        City cityb = new City("jessore", "Khulna");

        cityList.add(citya);
        cityList.add(cityb);

        assertEquals(1,cityList.count());
    }

    @Test
    public void test_getcities() {
        CityList cityList = new CityList();

        City citya = new City("Charlottetown", "Prince Edward Island");
        City cityb = new City("jessore", "Dhaka");

        cityList.add(citya);
        //assertEquals(0,citya.compareTo(cityList.getCitiesFun(0).get(0)));
        cityList.add(cityb);

        assertEquals(0,citya.compareTo(cityList.getCitiesFun(1).get(1)));
        assertEquals(0,cityb.compareTo(cityList.getCitiesFun(1).get(0)));

    }



}
