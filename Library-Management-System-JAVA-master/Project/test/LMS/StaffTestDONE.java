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
public class StaffTestDONE {
    
    public StaffTestDONE() {
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
     * Test of printInfo method, of class Staff.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
        Staff instance = new Staff(2,"Bob","addresstest",869999999,600.53);
        instance.printInfo();
    }

    /**
     * Test of getSalary method, of class Staff.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Staff instance = new Staff(2,"Bob","addresstest",869999999,600.53);
        double expResult = 600.53;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.00);
    }
    
}
