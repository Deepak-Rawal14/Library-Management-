
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class LibraryMemberTest.
 *
 * @author  Deepak
 * @version 30.11.2023
 */
public class LibraryMemberTest 
{
    /**
    * Testing the method getMemberId.
    */
    @Test 
    public void getMemberId() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        assertEquals("memberid", libraryM1.getMemberId()); 
    }

    /**
    * Testing the method setMemberId.
    */
    @Test 
    public void setMemberId() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        libraryM1.setMemberId("memid"); 
        assertEquals("memid", libraryM1.getMemberId()); 
    }

    /**
    * Testing the method getMemberName.
    */
    @Test 
    public void getMemberName() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        assertEquals("Deepak", libraryM1.getMemberName()); 
    }

    /**
    * Testing the method setMemberName.
    */
    @Test 
    public void setMemberName() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        libraryM1.setMemberName("DR"); 
        assertEquals("DR", libraryM1.getMemberName()); 
    }
    
    /**
    * Testing the method getMemberContact.
    */
    @Test 
    public void getMemberContact() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        assertEquals("membercontact", libraryM1.getMemberContact()); 
    }

    /**
    * Testing the method setMemberContact.
    */
    @Test 
    public void setMemberContact() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        libraryM1.setMemberContact("memcontact"); 
        assertEquals("memcontact", libraryM1.getMemberContact()); 
    }
    
    /**
    * Testing the method getBooksBorrowed.
    */
    @Test 
    public void getBooksBorrowed() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        assertEquals(new ArrayList(), libraryM1.getBooksborrowed()); 
    }
    
    /**
    * Testing the method addBookBorrowed.
    */
    @Test public void addBooksBorrowed() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        libraryM1.addBooksBorrowed(physical1); 
        assertEquals(1, libraryM1.getNumberOfBooksBorrowed()); 
    }
    
    /**
    * Testing the method printDetails.
    */
    @Test public void printDetails() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        libraryM1.printDetails();    
    }
    
    /**
    * Testing the method getNumberOfBooksBorrowed.
    */
    @Test public void getNumberOfBooksBorrowed() 
    { 
        LibraryMember libraryM1 = new LibraryMember("memberid", "Deepak", "membercontact"); 
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        libraryM1.addBooksBorrowed(physical1); 
        assertEquals(1, libraryM1.getNumberOfBooksBorrowed()); 
    }

}
