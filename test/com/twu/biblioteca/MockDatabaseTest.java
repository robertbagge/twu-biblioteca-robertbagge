package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Robert on 29/07/15.
 */
public class MockDatabaseTest {

    @Test
    public void testMockDatabaseSize(){
        assertEquals(20, new MockDatabase().books.size());
    }

    @Test
    public void testMockDatabaseAvailableBooksSize(){
        MockDatabase mb = new MockDatabase();
        int availableSize = 0;
        int unavailableSize = 0;
        for(int i = 0; i < mb.books.size(); i++){
            if(mb.books.get(i).getAvailability() == true){
                availableSize++;
                unavailableSize++;
            }
        }
        assertEquals("available size wrong", 10, availableSize);
        assertEquals("unavailable size wrong", 10, unavailableSize);
    }

    @Test
    public void testBooksOnAvailability(){
        MockDatabase mb = new MockDatabase();
        assertEquals(10, mb.getBooksOnAvailability(true).size());
        assertEquals(10, mb.getBooksOnAvailability(false).size());
    }

    @Test
    public void testAvailableBooksGotNoUnavailable(){
        MockDatabase mb = new MockDatabase();
        ArrayList<Book> availableBooks = mb.getBooksOnAvailability(true);
        for(Book book: availableBooks){
            if(!book.getAvailability()){
                fail();
            }
        }
    }

}