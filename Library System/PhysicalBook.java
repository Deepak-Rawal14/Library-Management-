import java.util.*;
/**
 * A class that stores the details of the physical book in the library.
 *
 * @author Deepak
 * @version 30.11.2023
 */
public class PhysicalBook extends Library
{
    //instance variables
    private String isbn;
    private String bookTitle;
    private Author author;
    private LibraryMember libMember;
    private ArrayList<String> damages;
     
    /**
     * Constructor for class PhysicalBook objects.
     */
    public PhysicalBook(Author auth, String isbnumber, String bTitle)
    {
        isbn = isbnumber;
        bookTitle = bTitle;
        author = auth;
        libMember = null;
        damages = new ArrayList<>();
        
    }

    /**
     * Method to get the ISBN of the book.
     */
    public String getIsbn()
    {
        return isbn;
    }
    
    /**
     * Setter method for the ISBN of the book.
     */
    public void setIsbn(String isbnumber)
    {
        isbn = isbnumber;
    }
    
    /**
     * Method to get the Title of the book.
     */
    public String getBookTitle()
    {
        return bookTitle;
    }
    
    /**
     * Method to set the Title of the book.
     */
    public void setBookTitle(String ttl)
    {
        bookTitle = ttl;
    }
    
    /**
     * Method to get the author object of the Author class.
     */
    public Author getAuthor()
    {
        return author;
    }
    
    /**
     * Method to set the author object of the Author class.
     */
    public void setAuthor(Author auth)
    {
        author = auth;
    }
    
    /**
     * Method to get the LibraryMember object of the LibraryMember class.
     */
    public LibraryMember getLibMember()
    {
        return libMember;
    }
    
    /**
     * Method to set the LibraryMember object of the LibraryMember class.
     */
    public void setLibMember(LibraryMember libMember)
    {
        libMember = libMember;
    }
    
    /**
     * Method to get the damages of the book from the ArrayList.
     */
    public ArrayList<String> getDamages()
    {
        return damages;
    }
    
    /**
     * Method to set the damages of the book in the ArrayList.
     */
    public void setDamages(ArrayList<String> damage)
    {
        damages = damage;
    }
    
    /**
     * Method to add the damages of the book in the ArrayList.
     */
    public void addDamage(String damage)
    {
        damages.add(damage);
    }
    
    /**
     * Method to check if a book is available.
     */
    public boolean isAvailable()
    {
        return libMember == null;
    }
    
    /**
     * Method to print the details of the books.
     */
    public void printDetails()
    {
        System.out.println("\nTitle: " +bookTitle);
        if (libMember != null)
        {
            System.out.println("Borrowed by: " +libMember.getMemberId());
        }
        else
        {
            System.out.println("Available");
        }
        
        if (author != null)
        {
            System.out.println("Author: " + author.getAuthorFirstName() + author.getAuthorSurname());
        }
        else
        {
            System.out.println("Cannot find Author");
        }
        
        if (!damages.isEmpty())
        {
            System.out.println("Damage to the book: " + damages);
        }   
    }
}
