/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author naujo
 */
public class ClerkTestDONE {
    
    public ClerkTestDONE() {
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

    /**
     * Test of printInfo method, of class Clerk.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
        Clerk instance = new Clerk(2,"Bob","addresstest",869999999,600.53,2);
        instance.printInfo();
    }
    
}
