/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.util.ArrayList;
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
public class BookTest {
    
    public BookTest() {
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
     * Test of addHoldRequest method, of class Book.
     */
    @Test
    public void testAddHoldRequest() {
        System.out.println("addHoldRequest");
        HoldRequest hr = null;
        Book instance = new Book(545,"Chemistry", "Science", "Science Dude", true) ;
        instance.addHoldRequest(hr);
    }

    /**
     * Test of removeHoldRequest method, of class Book.
     */
    @Test
    public void testRemoveHoldRequest() {
        System.out.println("removeHoldRequest");
        Book instance = new Book(3,"name1", "science1", "author1", true); 
        instance.removeHoldRequest();
    }

//    /**
//     * Test of printHoldRequests method, of class Book.
//     */
//    @Test
//    public void testPrintHoldRequests() {
//        System.out.println("printHoldRequests");
//        Book instance = null;
//        instance.printHoldRequests();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of printInfo method, of class Book.
//     */
//    @Test
//    public void testPrintInfo() {
//        System.out.println("printInfo");
//        Book instance = null;
//        instance.printInfo();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of changeBookInfo method, of class Book.
//     */
//    @Test
//    public void testChangeBookInfo() throws Exception {
//        System.out.println("changeBookInfo");
//        Book instance = null;
//        instance.changeBookInfo();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTitle method, of class Book.
//     */
//    @Test
//    public void testGetTitle() {
//        System.out.println("getTitle");
//        Book instance = null;
//        String expResult = "";
//        String result = instance.getTitle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSubject method, of class Book.
//     */
//    @Test
//    public void testGetSubject() {
//        System.out.println("getSubject");
//        Book instance = null;
//        String expResult = "";
//        String result = instance.getSubject();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAuthor method, of class Book.
//     */
//    @Test
//    public void testGetAuthor() {
//        System.out.println("getAuthor");
//        Book instance = null;
//        String expResult = "";
//        String result = instance.getAuthor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIssuedStatus method, of class Book.
//     */
//    @Test
//    public void testGetIssuedStatus() {
//        System.out.println("getIssuedStatus");
//        Book instance = null;
//        boolean expResult = false;
//        boolean result = instance.getIssuedStatus();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIssuedStatus method, of class Book.
//     */
//    @Test
//    public void testSetIssuedStatus() {
//        System.out.println("setIssuedStatus");
//        boolean s = false;
//        Book instance = null;
//        instance.setIssuedStatus(s);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getID method, of class Book.
//     */
//    @Test
//    public void testGetID() {
//        System.out.println("getID");
//        Book instance = null;
//        int expResult = 0;
//        int result = instance.getID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getHoldRequests method, of class Book.
//     */
//    @Test
//    public void testGetHoldRequests() {
//        System.out.println("getHoldRequests");
//        Book instance = null;
//        ArrayList<HoldRequest> expResult = null;
//        ArrayList<HoldRequest> result = instance.getHoldRequests();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setIDCount method, of class Book.
//     */
//    @Test
//    public void testSetIDCount() {
//        System.out.println("setIDCount");
//        int n = 0;
//        Book.setIDCount(n);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of placeBookOnHold method, of class Book.
//     */
//    @Test
//    public void testPlaceBookOnHold() {
//        System.out.println("placeBookOnHold");
//        Borrower bor = null;
//        Book instance = null;
//        instance.placeBookOnHold(bor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of makeHoldRequest method, of class Book.
//     */
//    @Test
//    public void testMakeHoldRequest() {
//        System.out.println("makeHoldRequest");
//        Borrower borrower = null;
//        Book instance = null;
//        instance.makeHoldRequest(borrower);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of serviceHoldRequest method, of class Book.
//     */
//    @Test
//    public void testServiceHoldRequest() {
//        System.out.println("serviceHoldRequest");
//        HoldRequest hr = null;
//        Book instance = null;
//        instance.serviceHoldRequest(hr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of issueBook method, of class Book.
//     */
//    @Test
//    public void testIssueBook() {
//        System.out.println("issueBook");
//        Borrower borrower = null;
//        Staff staff = null;
//        Book instance = null;
//        instance.issueBook(borrower, staff);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of returnBook method, of class Book.
//     */
//    @Test
//    public void testReturnBook() {
//        System.out.println("returnBook");
//        Borrower borrower = null;
//        Loan l = null;
//        Staff staff = null;
//        Book instance = null;
//        instance.returnBook(borrower, l, staff);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
