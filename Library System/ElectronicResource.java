
/**
 * A class for ElectronicResource.
 *
 * @author Deepak
 * @version 30.11.2023
 */
public class ElectronicResource extends Library 
{
    // instance fields of the class
    private boolean downloadable;
    private String ebook;
    private String journal;
    
    /**
     * Constructor for objects of class ElectronicResource
     */
    public ElectronicResource(String eb, String jrnl)
    {
        ebook = eb;
        journal = jrnl;
    }

    /**
     * A method to get the ebook.
     */
    public String getEbook()
    {
        return ebook;
    }
    
    /**
     * A method to set the ebook.
     */
    public void setEbook(String eb)
    {
        ebook = eb;
    }
    
    /**
     * A method to get the journal.
     */
    public String getJournal()
    {
        return journal;
    }
    
    /**
     * A method to set the journal.
     */
    public void setJournal(String jrnl)
    {
        journal = jrnl;
    }
    
    /**
     * A method to check if the resource is downloadable or not.
     */
    public boolean isDownloadable() 
    {
        return downloadable;
    }
    
    /**
     * A method to set the value(true or false) if the resource is downloadable or not.
     */
    public void setDownloadable(boolean download) 
    {
        downloadable = download;
    }
    
    /**
     * A method to print the details of resources.
     */
    public void printDetails()
    {
        System.out.println("Category: Ebook");
        System.out.println("Ebook Title: " + ebook);
        System.out.println("Download Allowed: " + downloadable);
        System.out.println("Category: Journal");
        System.out.println("Journal Name: " + journal);
        System.out.println("Download Allowed: " + downloadable);
    }
}
