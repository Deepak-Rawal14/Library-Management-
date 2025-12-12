
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElectronicResourceTest.
 *
 * @author  Deepak
 * @version 30.11.2023
 */
public class ElectronicResourceTest
{
    /**
    * Testing the method getEbook.
    */
    @Test
    public void getEbook()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        assertEquals("Ebook", electron1.getEbook());
    }
    
    /**
    * Testing the method setEbook.
    */
    @Test
    public void setEbook()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        electron1.setEbook("OOP");
    }
    
    /**
    * Testing the method getJournal.
    */
    @Test
    public void getJournal()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        assertEquals("Journal", electron1.getJournal());
    }
    
    /**
    * Testing the method setJournal.
    */
    @Test
    public void setJournal()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        electron1.setJournal("OOP");
    }
    
    /**
    * Testing the method isDownloadable.
    */
    @Test
    public void isDownloadable()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        assertEquals(false, electron1.isDownloadable());
    }

    /**
    * Testing the method setDownloadable.
    */
    @Test
    public void setDownloadable()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        electron1.setDownloadable(true);
    }
    
    /**
    * Testing the method printDetails.
    */
    @Test
    public void printDetails()
    {
        ElectronicResource electron1 = new ElectronicResource("Ebook", "Journal");
        electron1.printDetails();
    }
}




