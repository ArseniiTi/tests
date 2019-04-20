/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ars19
 */
public class GameTest {
    
    public GameTest() {
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

//    /**
//     * Test of main method, of class Game.
//     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Game.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

     /**
     * User have more than 100 $
     */
    @Test
    public void testMoneyGood() {
        System.out.println("money - good");
        int money = 120;
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.money(money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * User have less than 100 $
     */
     @Test
    public void testMoneyBad() {
        System.out.println("money - bad");
        int money = 80;
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.money(money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     /**
     * User have exactly  100 $
     */
         @Test
    public void testMoneyBoundary() {
        System.out.println("money - boundary");
        int money = 100;
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.money(money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of isNumeric method, of class Game.
     */
    /**
     * User entered more then one letter
     */
    @Test
    public void testIsNumericGood() {
        System.out.println("isNumeric - Good");
        String userName = "Arsenii";
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.isNumeric(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * User entered not a string value in the name
     */
       @Test
    public void testIsNumericBad() {
        System.out.println("isNumeric - Bad");
        String userName = "5454";
        Game instance = new Game();
        boolean expResult = false;
        boolean result = instance.isNumeric(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    /**
     * User entered exactly one letter
     */
        @Test
    public void testIsNumericBoundary() {
        System.out.println("isNumeric - Boundary");
        String userName = "A";
        Game instance = new Game();
        boolean expResult = true;
        boolean result = instance.isNumeric(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
