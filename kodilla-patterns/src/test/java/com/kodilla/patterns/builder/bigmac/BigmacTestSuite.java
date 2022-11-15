package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Ingredients.SALAD)
                .burgers(1)
                .bun(Bun.PLAIN)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredients.ONION)
                .ingredient(Ingredients.MUSHROOMS)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(Sauce.STANDARD, bigmac.getSauce());
        assertEquals(1, bigmac.getBurgers());
        assertEquals(Bun.PLAIN,bigmac.getBun());
    }
}

