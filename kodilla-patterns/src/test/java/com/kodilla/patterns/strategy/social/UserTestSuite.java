package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john =  new Millenials("John");
        User karol = new YGeneration("Karol");
        User brian = new ZGeneration("Brian");

        //When
        String johnUse = john.sharePost();
        System.out.println("John use "+ johnUse);
        String karolUse = karol.sharePost();
        System.out.println("Karol use "+ karolUse);
        String brianUse = brian.sharePost();
        System.out.println("Brian use "+ brianUse);

        //Then
        assertEquals("Twitter", johnUse);
        assertEquals("Facebook", karolUse);
        assertEquals("Snapchat", brianUse);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User john =  new Millenials("John");

        //When
        String johnUse = john.sharePost();
        System.out.println("John use "+ johnUse);
        john.setSocialPublisher( new FacebookPublisher());
        johnUse = john.sharePost();
        System.out.println("John use "+ johnUse);

        //Then
        assertEquals("Facebook", johnUse);
    }
}
