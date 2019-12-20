/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.util.Date;
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
public class HoldRequestTestDONE {
    
    public HoldRequestTestDONE() {
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
     * Test of getBorrower method, of class HoldRequest.
     */
    @Test
    public void testGetBorrower() {
        System.out.println("getBorrower");
        Date d = new Date();
        d.setMonth(11);
        d.setYear(2019);
        Borrower b = new Borrower(2,"ll", "aaa", 5);
        HoldRequest instance = new HoldRequest(b, new Book(3,"k", "l", "k", false),d); 
        Borrower expResult = b;
        Borrower result = instance.getBorrower();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBook method, of class HoldRequest.
     */
    @Test
    public void testGetBook() {
        System.out.println("getBook");
        Borrower b = new Borrower(2,"ll", "aaa", 5);
        Book bk = new Book(3,"k", "l", "k", false);
        Date d = new Date();
        d.setMonth(11);
        d.setYear(2019);
        HoldRequest instance = new HoldRequest(b, bk ,d); 
        Book expResult = bk;
        Book result = instance.getBook();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRequestDate method, of class HoldRequest.
     */
    @Test
    public void testGetRequestDate() {
        System.out.println("getRequestDate");
        Borrower b = new Borrower(2,"ll", "aaa", 5);
        Book bk = new Book(3,"Title", "Subject", "Author", false);
        Date expResult = new Date();
        expResult.setMonth(11);
        expResult.setYear(2019);
        HoldRequest instance = new HoldRequest(b, bk , expResult); 
        Date result = instance.getRequestDate();
        assertEquals(expResult, result);
    }
 
    /**
     * Test of print method, of class HoldRequest.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Borrower b = new Borrower(2,"First Name", "Second Name", 5);
        Book bk = new Book(3,"Title", "Subject", "Author", false);
        Date d = new Date();
        d.setMonth(11);
        d.setYear(2019);
        HoldRequest instance = new HoldRequest(b, bk ,d); 
        instance.print();
   }
    
}
