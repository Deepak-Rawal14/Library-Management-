import java.util.*;
import javax.swing.*;
/**
 * A class for the guest of the library.
 * @author Deepak
 * @version 30.11.2023
 */
public class Guest extends Library 
{
    // Fields of the class
    private String guestName;
    private String guestId;
    private int durationOfAccess;

    /**
     * Constructor for class Guest objects.
     */
    public Guest(String gName, String gId, int duraccess)
    {
        guestName = gName;
        guestId = gId;
        if ( duraccess <= 3)
        {
            durationOfAccess = duraccess;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Access permitted for max 3 days");
        }
    }

    /**
     * A method to get the name of the guest.
     */
    public String getGuestName()
    {
        return guestName;
    }

    /**
     * A method to set the name of the guest.
     */
    public void setGuestName(String gName)
    {
        guestName = gName;
    }

    /**
     * A method to get the id of the guest.
     */
    public String getGuestId()
    {
        return guestId;
    }

    /**
     * A method to set the id of the guest.
     */
    public void setGuestId(String gId)
    {
        guestId = gId;
    }

    /**
     * A method to get the access duration of the guest.
     */
    public int getDurationOfAccess()
    {
        return durationOfAccess;
    }

    /**
     * A method to set the access duration of the guest.
     */
    public void setDurationOfAccess(int durAccess)
    {
        if (durationOfAccess <= 3)
        {
            durationOfAccess = durAccess;
            System.out.println("Access permitted");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Access permitted for max 3 days");
        }
    }

    /**
     * A method to borrow book by the guest.
     */
    public void borrowBook()
    {
        JOptionPane.showMessageDialog(null, "Only members can borrow book");
    }
}
