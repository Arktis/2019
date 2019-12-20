/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.util.ArrayList;
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
public class BorrowerTest {
    
    public BorrowerTest() {
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
     * Test of printInfo method, of class Borrower.
     */
    @Test
    public void testPrintInfo() {
        System.out.println("printInfo");
         Library instance = Library.getInstance();
        Borrower b = new Borrower(2,"Name", "Surrname", 86045654);  
        b.printInfo();
    }


    /**
     * Test of printBorrowedBooks method, of class Borrower.
     */
    @Test
    public void testPrintBorrowedBooks() {
        System.out.println("printBorrowedBooks");
        Borrower instance = new Borrower(2,"ll", "aaa", 5);
        Book book = new Book(50,"T", "S", "A", false);
        Book book2 = new Book(45,"T", "S", "A", false);
        Clerk c = new Clerk(2,"Bob2","addresstest2",869999599,605,7);
        Date date1 = new Date();
        date1.setMonth(11);
        date1.setYear(2019);
        Date date2 = new Date();
        date2.setMonth(12);
        date2.setYear(2019);
        Loan l = new Loan(instance, book, c, c, date1, date2, true);
        Loan l2 = new Loan(instance, book2, c, c, date1, date2, true);
        instance.addBorrowedBook(l);
        instance.addBorrowedBook(l2);
        instance.printBorrowedBooks();
    }

//    /**
//     * Test of printOnHoldBooks method, of class Borrower.
//     */
//    @Test
//    public void testPrintOnHoldBooks() {
//        System.out.println("printOnHoldBooks");
//        Borrower instance = null;
//        instance.printOnHoldBooks();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of updateBorrowerInfo method, of class Borrower.
//     */
//    @Test
//    public void testUpdateBorrowerInfo() throws Exception {
//        System.out.println("updateBorrowerInfo");
//        Borrower instance = null;
//        instance.updateBorrowerInfo();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addBorrowedBook method, of class Borrower.
//     */
//    @Test
//    public void testAddBorrowedBook() {
//        System.out.println("addBorrowedBook");
//        Loan iBook = null;
//        Borrower instance = null;
//        instance.addBorrowedBook(iBook);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeBorrowedBook method, of class Borrower.
//     */
//    @Test
//    public void testRemoveBorrowedBook() {
//        System.out.println("removeBorrowedBook");
//        Loan iBook = null;
//        Borrower instance = null;
//        instance.removeBorrowedBook(iBook);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of addHoldRequest method, of class Borrower.
//     */
//    @Test
//    public void testAddHoldRequest() {
//        System.out.println("addHoldRequest");
//        HoldRequest hr = null;
//        Borrower instance = null;
//        instance.addHoldRequest(hr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of removeHoldRequest method, of class Borrower.
//     */
//    @Test
//    public void testRemoveHoldRequest() {
//        System.out.println("removeHoldRequest");
//        HoldRequest hr = null;
//        Borrower instance = null;
//        instance.removeHoldRequest(hr);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBorrowedBooks method, of class Borrower.
//     */
//    @Test
//    public void testGetBorrowedBooks() {
//        System.out.println("getBorrowedBooks");
//        Borrower instance = null;
//        ArrayList<Loan> expResult = null;
//        ArrayList<Loan> result = instance.getBorrowedBooks();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getOnHoldBooks method, of class Borrower.
//     */
//    @Test
//    public void testGetOnHoldBooks() {
//        System.out.println("getOnHoldBooks");
//        Borrower instance = null;
//        ArrayList<HoldRequest> expResult = null;
//        ArrayList<HoldRequest> result = instance.getOnHoldBooks();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
