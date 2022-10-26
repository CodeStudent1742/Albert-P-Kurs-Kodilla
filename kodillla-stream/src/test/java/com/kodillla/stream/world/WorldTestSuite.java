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
        Country country1 = new Country("Germany", new BigDecimal("80000000"));
        Country country2 = new Country("France", new BigDecimal("70000000"));
        Country country3 = new Country("GreatBritan", new BigDecimal("70000000"));
        Country country4 = new Country("Italy",new BigDecimal("60000000"));
        Country country5 = new Country("Others",new BigDecimal("460000000"));
        europe.addCountry(country1);
        europe.addCountry(country2);
        europe.addCountry(country3);
        europe.addCountry(country4);
        europe.addCountry(country5);
        //Country creation in America
        Country country6 = new Country("USA", new BigDecimal("330000000"));
        Country country7 = new Country("Meksyk", new BigDecimal("130000000"));
        Country country8 = new Country("OthersAmerica", new BigDecimal("540000000"));
        america.addCountry(country6);
        america.addCountry(country7);
        america.addCountry(country8);
        //Country creation in Africa
        Country country9 = new Country("Nigeria", new BigDecimal("220000000"));
        Country country10 = new Country("Etiopia", new BigDecimal("110000000"));
        Country country11 = new Country("OthersAfrica", new BigDecimal("870000000"));
        africa.addCountry(country9);
        africa.addCountry(country10);
        africa.addCountry(country11);
        //Country creation in Asia
        Country country12 = new Country("China", new BigDecimal("1400000000"));
        Country country13 = new Country("India", new BigDecimal("1400000000"));
        Country country14 = new Country("OthersAsia", new BigDecimal("1700000000"));
        asia.addCountry(country12);
        asia.addCountry(country13);
        asia.addCountry(country14);
        //Continents add to world
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(asia);
        world.addContinent(america);
        //When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("7440000000");
        assertEquals(expectedPeopleQuantity,totalPeopleQuantity);
//        System.out.println("Total people quantity in the wolrld is: " + totalPeopleQuantity);
    }

}
