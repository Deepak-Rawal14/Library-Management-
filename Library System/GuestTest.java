

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GuestTest.
 *
 * @author  Deepak
 * @version 30.11.2023
 */
public class GuestTest
{
    /**
    * Testing the method getGuestName.
    */
    @Test
    public void getGuestName()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        assertEquals("Deepak", guest1.getGuestName());
    }

    /**
    * Testing the method setGuestName.
    */
    @Test
    public void setGuestName()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        guest1.setGuestName("Rawal");
    }

    /**
    * Testing the method getGuestId.
    */
    @Test
    public void getGuestId()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        assertEquals("G1", guest1.getGuestId());
    }

    /**
    * Testing the method setGuestId.
    */
    @Test
    public void setGuestId()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        guest1.setGuestId("GG1");
    }

    /**
    * Testing the method getDurationOfAccess.
    */
    @Test
    public void getDurationOfAccess()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        assertEquals(3, guest1.getDurationOfAccess());
    }

    /**
    * Testing the method setDurationOfAccess.
    */
    @Test
    public void setDurationOfAccess()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        guest1.setDurationOfAccess(2);
    }

    /**
    * Testing the method borrowBook.
    */
    @Test
    public void borrowBook()
    {
        Guest guest1 = new Guest("Deepak", "G1", 3);
        guest1.borrowBook();
    }
}







