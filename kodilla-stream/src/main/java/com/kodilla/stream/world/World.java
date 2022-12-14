package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> world = new HashSet<>();

    public void addContinent(Continent continent){
        world.add(continent);
    }

   public BigDecimal getPeopleQuantity(){
        return (BigDecimal) world.stream()
                .flatMap(continent ->continent.getContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
   }


}
