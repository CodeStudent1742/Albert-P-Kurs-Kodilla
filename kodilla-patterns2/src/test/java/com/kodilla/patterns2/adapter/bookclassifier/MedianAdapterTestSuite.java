package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Author1","Title1",1991,"Signature1");
        Book book2 = new Book("Author2","Title2",1992,"Signature2");
        Book book3 = new Book("Author3","Title3",1993,"Signature3");
        Book book4 = new Book("Author4","Title4",1994,"Signature4");
        Book book5 = new Book("Author5","Title5",1995,"Signature5");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(publicationYearMedian, 1993);

    }
}
