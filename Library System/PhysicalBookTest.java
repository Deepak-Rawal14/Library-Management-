
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class PhysicalBookTest.
 *
 * @author  Deepak
 * @version 30.11.2023
 */
public class PhysicalBookTest
{
    /**
    * Testing the method getIsbn.
    */
    @Test
    public void getIsbn()
    {
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        assertEquals("ABC123", physical1.getIsbn());
    }

    /**
    * Testing the method setIsbn.
    */
    @Test
    public void setIsbn()
    {
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "AB123", "BookTitle");
        physical1.setIsbn("ABC123");
    }

    /**
    * Testing the method getBookTitle.
    */
    @Test
    public void getBookTitle()
    {
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        assertEquals("BookTitle", physical1.getBookTitle());
    }

    /**
    * Testing the method setBookTitle.
    */
    @Test
    public void setBookTitle()
    {
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "Btitle");
        physical1.setBookTitle("BookTitle");
    }

    /**
    * Testing the method getAuthor.
    */
    @Test
    public void getAuthor()
    {
        Author author1 = new Author();
        author1.showDetails();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        assertEquals("","","");
    }
        
    /**
    * Testing the method setAuthor.
    */
    @Test
    public void setAuthor()
    {
        Author author1 = new Author();
        author1.setAuthorFirstName("Deepak");
        author1.setAuthorSurname("Rawal");
        author1.setAuthorAddress("Author Address");
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        physical1.setAuthor(author1);
    }

    /**
    * Testing the method getLibMember.
    */
    @Test
    public void getLibMember()
    {
        LibraryMember libraryM1 = new LibraryMember("Libmember1", "Deepak", "member contact");
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        libraryM1.printDetails();
        assertEquals(null, physical1.getLibMember());
    }

    /**
    * Testing the method setLibMember.
    */
    @Test
    public void setLibMember()
    {
        Author author1 = new Author();
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        LibraryMember libraryM1 = new LibraryMember("libmember1", "Deepak", "memcontact");
        libraryM1.setMemberId("mem1");
        libraryM1.setMemberName("member");
        libraryM1.setMemberContact("memcontact");
        physical1.setLibMember(libraryM1);
    }

    /**
    * Testing the method addDamage.
    */
    @Test public void addDamage() 
    { 
        Author author1 = new Author(); 
        PhysicalBook physical1 = new PhysicalBook(author1, "ABC123", "BookTitle");
        physical1.addDamage("missing pages"); 
        physical1.addDamage("untidy");
        ArrayList damages = physical1.getDamages();
        assertEquals(2, damages.size()); 
        assertTrue(damages.contains("missing pages")); 
        assertTrue(damages.contains("untidy")); 
    }

}











