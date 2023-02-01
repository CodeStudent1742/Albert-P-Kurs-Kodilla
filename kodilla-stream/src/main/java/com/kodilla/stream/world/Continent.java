package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Continent {
    private final Set<Country> continent = new HashSet<>();

    public void addCountry(Country country) {
        continent.add(country);
    }

    public Set<Country> getContinent() {
        return continent;
    }


}
