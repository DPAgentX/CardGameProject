package cardapp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/*
*CardAppTest.java
*test class for card app
*author: Deepkumar Patel, Harsh Pravinbhai Goti, Bikranta Singha
*created: 10th July, 2021
*modified: 12th August, 2021
*/

public class CardAppTest {
    
    public CardAppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCheckCards() {
        System.out.println("checkCards");
        int expResult = 52;
        int result = CardApp.checkCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
