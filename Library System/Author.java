
/**
 * A class that Stores the details of the Author.
 *
 * @author Deepak
 * @version 1.0
 */
public class Author extends Library
{
    // instance fields of the class Author
    private String authorFirstName;
    private String authorSurname;
    private String authorAddress;

    /**
     * Constructor for class Author objects.
     */
    public Author()
    {
        // initialising instance fields
        authorFirstName = "";
        authorSurname = "";
        authorAddress = "";
    }

    /**
     * A getter method for authorFirstName
     */
    public String getAuthorFirstName()
    {
        return authorFirstName;
    }
    
    /**
     * A setter method for authorFirstName
     */
    public void setAuthorFirstName(String fn)
    {
        authorFirstName = fn;
    }
    
    /**
     * A getter method for authorSurname
     */
    public String getAuthorSurname()
    {
        return authorSurname;
    }
    
    /**
     * A setter method for authorSurname
     */
    public void setAuthorSurname(String sn)
    {
        authorSurname = sn;
    }
    
    /**
     * A getter method for authorAddress
     */
    public String getAuthorAddress()
    {
        return authorAddress;
    }
    
    /**
     * A setter method for authorAddress
     */
    public void setAuthorAddress(String address)
    {
        authorAddress = address;
    }
    
    /**
     * A method to show the ddetails of the author
     */
    public void showDetails()
    {
        System.out.println("\nAuthor: " + authorFirstName + " " + authorSurname + "\nAuthor Address: " + authorAddress);
    }
}
