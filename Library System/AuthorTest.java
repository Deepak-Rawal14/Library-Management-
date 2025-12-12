

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AuthorTest.
 *
 * @author  Deepak
 * @version 30.11.2023
 */
public class AuthorTest
{
    /**
    * Testing the method getAuthorFirstName.
    */
    @Test
    public void getAuthorFirstName()
    {
        Author author1 = new Author();
        assertEquals("", author1.getAuthorFirstName());
    }

    /**
    * Testing the method setAuthorFirstName.
    */
    @Test
    public void setAuthorFirstName()
    {
        Author author1 = new Author();
        author1.setAuthorFirstName("Deepak");
    }

    /**
    * Testing the method getAuthorSurname.
    */
    @Test
    public void getAuthorSurname()
    {
        Author author1 = new Author();
        assertEquals("", author1.getAuthorSurname());
    }

    /**
    * Testing the method setAuthorSurname.
    */
    @Test
    public void setAuthorSurname()
    {
        Author author1 = new Author();
        author1.setAuthorSurname("Rawal");
    }

    /**
    * Testing the method getAuthorAddress.
    */
    @Test
    public void getAuthorAddress()
    {
        Author author1 = new Author();
        assertEquals("", author1.getAuthorAddress());
    }

    /**
    * Testing the method setAuthorAddress.
    */
    @Test
    public void setAuthorAddress()
    {
        Author author1 = new Author();
        author1.setAuthorAddress("Address1");
    }

    /**
    * Testing the method showDetails.
    */
    @Test
    public void showDetails()
    {
        Author author1 = new Author();
        author1.showDetails();
    }
}







