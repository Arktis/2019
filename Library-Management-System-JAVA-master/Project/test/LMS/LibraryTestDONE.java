/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
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
public class LibraryTestDONE {
    
    public LibraryTestDONE() {
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
     * Test of setReturnDeadline method, of class Library.
     */
//    @Test
//    public void testSetReturnDeadline() {
//        System.out.println("setReturnDeadline");
//        int deadline = 2;
//        int expResult = 2;
//        Library instance = Library.getInstance();
//        instance.setReturnDeadline(deadline);
//        assertEquals(expResult, instance.book_return_deadline);
//    }

    /**
     * Test of setFine method, of class Library.
     */
//    @Test
//    public void testSetFine() {
//        System.out.println("setFine");
//        double perDayFine = 0.5;
//        double expResult = 0.50;
//        Library instance = Library.getInstance();
//        instance.setFine(perDayFine);
//        assertEquals(expResult, instance.per_day_fine, 0.00);
//    }

    /**
     * Test of setRequestExpiry method, of class Library.
     */
//    @Test
//    public void testSetRequestExpiry() {
//        System.out.println("setRequestExpiry");
//        int hrExpiry = 2;
//        int expResult = 2;
//        Library instance = Library.getInstance();
//        instance.setRequestExpiry(hrExpiry);
//        assertEquals(expResult, instance.hold_request_expiry);
//
//    }
//
    /**
     * Test of setName method, of class Library.
     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String n = "Library Name";
//        Library instance = Library.getInstance();
//        instance.setName(n);
//        assertEquals(n, instance.getLibraryName());
//    }

    /**
     * Test of getHoldRequestExpiry method, of class Library.
     */
//    @Test
//    public void testGetHoldRequestExpiry() {
//        System.out.println("getHoldRequestExpiry");
//        Library instance = Library.getInstance();
//        int expResult = 2;
//        instance.hold_request_expiry = 2;
//        int result = instance.getHoldRequestExpiry();
//        assertEquals(expResult, result);
//    }
//
    /**
     * Test of getPersons method, of class Library.
     */
//    @Test
//    public void testGetPersons() {
//        System.out.println("getPersons");
//        Library i = Library.getInstance();
//        //Person p = new Person(2,"Bob","addresstest",869999999);
//        Clerk person1 = new Clerk(2,"Bob","addresstest",869999999,600.53,5);
//        Clerk person2 = new Clerk(3,"Bob2","addresstest2",869999992,500.2, 2);
//        Librarian person3 = new Librarian(3,"Bob2","addresstest2",869999992,500.2, 2);
//        ArrayList<Person> personList = new ArrayList<Person>();
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//        i.addClerk(person1);
//        i.addClerk(person2);
//        i.addLibrarian(person3);
//        ArrayList<Person> expResult = personList;
//        ArrayList<Person> result = i.getPersons();
//        assertEquals(expResult, result);
//    }
    
    /**
     * Test of getLibraryName method, of class Library.
     */
//    @Test
//    public void testGetLibraryName() {
//        System.out.println("getLibraryName");
//        Library instance = Library.getInstance();
//        String expResult = "Name";
//        instance.setName(expResult);
//        String result = instance.getLibraryName();
//        assertEquals(expResult, result);
//    }
//
    /**
     * Test of getBooks method, of class Library.
     */
//    @Test
//    public void testGetBooks() {
//        System.out.println("getBooks");
//        Library instance = Library.getInstance();
//        Book book1 = new Book(3,"name1", "science1", "author1", true); 
//        Book book2 = new Book(5,"name2", "science2", "author2", false); 
//        ArrayList<Book> expResult = new ArrayList<Book>();
//        expResult.add(book2);
//        expResult.add(book1);
//        instance.addBookinLibrary(book2);
//        instance.addBookinLibrary(book1);
//        ArrayList<Book> result = instance.getBooks();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of addLibrarian method, of class Library.
     */
//    @Test
//    public void testAddLibrarian() {
//        System.out.println("addLibrarian");
//        Librarian lib = new Librarian(3,"Bob2","addresstest2",869999992,500.2, 2);
//        Library inst = Library.getInstance();
//        boolean expResult = true;
//        boolean result = inst.addLibrarian(lib);
//        assertEquals(expResult, result);
//    }
//
    /**
     * Test of addClerk method, of class Library.
     */
//    @Test
//    public void testAddClerk() {
//        System.out.println("addClerk");
//        Clerk c = new Clerk(5,"Bob4","addres5",86999,600,7);
//        Library inst = Library.getInstance();
//        inst.addClerk(c);
//    }

    /**
     * Test of addBorrower method, of class Library.
     */
//    @Test
//    public void testAddBorrower() {
//        System.out.println("addBorrower");
//        Borrower b = new Borrower(2,"ll", "aaa", 5);
//        Library instance = Library.getInstance();
//        instance.addBorrower(b);
//    }

    /**
     * Test of addLoan method, of class Library.
     */
//    @Test
//    public void testAddLoan() {
//        System.out.println("addLoan");
//        Borrower b = new Borrower(2,"ll", "aaa", 5);
//        Book bk = new Book(3,"k", "l", "k", true);
//        Clerk c = new Clerk(2,"Bob","addresstest",869999999,600.53,5);
//        Clerk c2 = new Clerk(2,"Bob2","addresstest2",869999599,605,7);
//        Date date1 = new Date();
//        date1.setMonth(11);
//        date1.setYear(2019);    
//        Date date2 = new Date();
//        date1.setMonth(12);
//        date1.setYear(2019); 
//        Loan l = new Loan(b, bk , c, c2, date1, date2, true);
//        Library instance = Library.getInstance();
//        instance.addLoan(l);
//    }

    /**
     * Test of findBorrower method, of class Library.
     */
    //Duomnys įvedami ranka, nežinau kaip testuoti
//    @Test
//    public void testFindBorrower() {
//        System.out.println("findBorrower");
//        Library instance = Library.getInstance();
//        Borrower expResult = new Borrower(8,"aaa", "bbb", 11);
//        instance.addBorrower(expResult);
//        //InputStream sysInBackup = System.in; // backup System.in to restore it later
//        ByteArrayInputStream in = new ByteArrayInputStream("8".getBytes());
//        System.setIn(in);
//        Borrower result = instance.findBorrower();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of findClerk method, of class Library.
     */
//    @Test
//    public void testFindClerk() {
//        System.out.println("findClerk");
//        Library instance = Library.getInstance();
//        Clerk expResult = new Clerk(2,"Bob","addresstest",869999999,600.53,5);
//        instance.addClerk(expResult);
//        ByteArrayInputStream in = new ByteArrayInputStream("2".getBytes());
//        System.setIn(in);
//        Clerk result = instance.findClerk();
//        assertEquals(expResult, result);
//    }

    /**
     /* Test of addBookinLibrary method, of class Library.
     */
//    @Test
//    public void testAddBookinLibrary() {
//        System.out.println("addBookinLibrary");
//        Book b = new Book(3,"name1", "science1", "author1", false);
//        Library instance = Library.getInstance();
//        instance.addBookinLibrary(b);
//    }

    /**
     * Test of removeBookfromLibrary method, of class Library.
     */
//    @Test
//    public void testRemoveBookfromLibrary() {
//        System.out.println("removeBookfromLibrary");
//        Book b = new Book(3,"name1", "science1", "author1", false);
//        Library instance = Library.getInstance();
//        instance.removeBookfromLibrary(b);
//    }

    /**
     * Test of searchForBooks method, of class Library.
     */
//    @Test //Kazkas neveikia su nuskaitymu
//    public void testSearchForBooks() throws Exception {
//        System.out.println("searchForBooks");
//        Library instance = Library.getInstance();
//        ArrayList<Book> expResult = new ArrayList<Book>();
//        expResult.add(new Book(3,"name1", "science1", "author1", false));
//        //InputStream sysInBackup = System.in; // backup System.in to restore it later
//        String input = "1\n"+"name2\n";
//        System.setIn(new ByteArrayInputStream(input.getBytes()));
//        ArrayList<Book> result = instance.searchForBooks();
//        assertEquals(null, result);
//    }

    /**
     * Test of viewAllBooks method, of class Library.
     */
//    @Test
//    public void testViewAllBooks() {
//        System.out.println("viewAllBooks");
//        Library instance = Library.getInstance();
//        instance.addBookinLibrary(new Book(3,"name1", "science1", "author1", false));
//        instance.addBookinLibrary(new Book(3,"name2", "science2", "author2", false));
//        instance.viewAllBooks();
//    }

//    /**
     /* Test of computeFine2 method, of class Library.
     */
    //------------------------------------------------------------------------!!!!!!!!!!!!!!!!!!!
//    @Test
//    public void testComputeFine2() {
//        System.out.println("computeFine2");
//        Library instance = Library.getInstance();
//        Borrower b = new Borrower(2,"Name", "Surrname", 5);
//        Book bk = new Book(3,"Title", "Category", "Author", true);
//        Clerk c = new Clerk(2,"Bob","addresstest",869999999,600.53,5);
//        Clerk c2 = new Clerk(2,"Bob2","addresstest2",869999599,605,7);
//        Date date1 = new Date();
//        date1.setMonth(10);
//        date1.setYear(2015);    
//        Date date2 = new Date();
//        date2.setMonth(11);
//        date2.setYear(2018); 
//        instance.setReturnDeadline(4);
//        instance.setFine(0.5);
//        instance.per_day_fine = 5;
//        Loan l = new Loan(b, bk , c, c2, date1, date2, false);
//        instance.addLoan(l);
//        instance.book_return_deadline = 5;
//        double expResult = 0.0;
//        double result = instance.computeFine2(b);
//        assertEquals(expResult, result, 0.0);
//    }
//
//    /**
//     * Test of createPerson method, of class Library.
//     */
//    @Test // nezinau, kaip kelis inputus daryti
//    public void testCreatePerson() {
//        System.out.println("createPerson");
//        char x = 'c';
//        Library instance = Library.getInstance();
//        instance.createPerson(x);
//    }

    /**
     * Test of createBook method, of class Library.
     */
//    @Test
//    public void testCreateBook() {
//        System.out.println("createBook");
//        String title = "title";
//        String subject = "subj";
//        String author = "author";
//        Library instance = Library.getInstance();
//        instance.createBook(title, subject, author);
//    }

    /**
     * Test of login method, of class Library.
     */
//    @Test
//    public void testLogin() {
//        System.out.println("login");
//        Library instance = Library.getInstance();
//        Person expResult = null;
//        Person result = instance.login();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of viewHistory method, of class Library.
     */
//    @Test
//    public void testViewHistory() {
//        System.out.println("viewHistory");
//        Library instance = Library.getInstance();
//        Borrower b = new Borrower(2,"Name", "Surrname", 5);
//        Book bk = new Book(3,"Title", "Category", "Author", true);
//        Clerk c = new Clerk(2,"Bob","addresstest",869999999,600.53,5);
//        Clerk c2 = new Clerk(2,"Bob2","addresstest2",869999599,605,7);
//        Date date1 = new Date();
//        date1.setMonth(10);
//        date1.setYear(2015);    
//        Date date2 = new Date();
//        date2.setMonth(11);
//        date2.setYear(2018); 
//        Loan l = new Loan(b, bk , c, c2, date1, date2, true);
//        instance.addLoan(l);
//        instance.viewHistory();
//    }

    /**
     * Test of makeConnection method, of class Library.
     */
//    @Test
//    public void testMakeConnection() {
//        System.out.println("makeConnection");
//        Library instance = Library.getInstance();
//        Connection expResult = null;
//        Connection result = instance.makeConnection();
//        assertEquals(expResult, result);
//    }

    /**
     * Test of populateLibrary method, of class Library.
     */
//    @Test
//    public void testPopulateLibrary() throws Exception {
//        System.out.println("populateLibrary");
//        Connection con = null;
//        Library instance = Library.getInstance();
//        instance.populateLibrary(con);
//    }

    /**
     * Test of fillItBack method, of class Library.
     */
//    @Test
//    public void testFillItBack() throws Exception {
//        System.out.println("fillItBack");
//        Library instance = Library.getInstance();
//        Connection con = instance.makeConnection();
//        instance.fillItBack(con);
//    }
    
}
