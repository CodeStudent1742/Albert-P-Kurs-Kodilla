package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final Set<Country> continent = new HashSet<>();
//    private final String continentName;

//    public Continent(String continentName) {
//        this.continentName = continentName;
//    }

    public void addCountry(Country country) {
        continent.add(country);
    }

    public Set<Country> getContinent() {
        return continent;
    }

//    public String getContinentName() {
//        return continentName;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Continent continent = (Continent) o;
//        return Objects.equals(continentName, continent.continentName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(continentName);
//    }
}
