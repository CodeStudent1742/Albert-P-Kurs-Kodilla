package com.kodillla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent();
        Continent america = new Continent();
        Continent africa = new Continent();
        Continent asia = new Continent();
        //Country creation in Europe
        Country country1 = new Country("Germany", 80000000000000.1);
        Country country2 = new Country("France", 70000000000000);
        Country country3 = new Country("GreatBritan", 70000000000000);
        Country country4 = new Country("Italy",60000000000000);
        Country country5 = new Country("Others",460000000000000);
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);
        europe.addCountry(country4);
        europe.addCountry(country5);
        //Country creation in America
        Country country6 = new Country("USA", 330000000000000);
        Country country7 = new Country("Meksyk", 130000000000000);
        Country country8 = new Country("OthersAmerica", 540000000000000);
        america.addCountry(country6);
        america.addCountry(country7);
        america.addCountry(country8);
        //Country creation in Africa
        Country country9 = new Country("Nigeria", 220000000000000);
        Country country10 = new Country("Etiopia", 110000000000000);
        Country country11 = new Country("OthersAfrica", 870000000000000);
        africa.addCountry(country9);
        africa.addCountry(country10);
        africa.addCountry(country11);
        //Country creation in Asia
        Country country12 = new Country("China", 1400000000000000);
        Country country13 = new Country("India", 1400000000000000);
        Country country14 = new Country("OthersAsia", 1700000000000000);
        asia.addCountry(country12);
        asia.addCountry(country13);
        asia.addCountry(country14);
        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal(7440000000000000);
        assertEquals(expectedPeopleQuantity,totalPeopleQuantity,0.001);
    }

}
