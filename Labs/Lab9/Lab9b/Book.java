/**
    Book class
    Author:   Blase Cindric
    Modified: 01/05/2005 John Kirchmeyer
        Changed getPages, setPages to
        getNumPages, setNumPages.
*/
public class Book {

    private String title;
    private String author;
    private Integer numPages;

    public Book(String t, String a, Integer n) {
        title = t;
        author = a;
        numPages = n;
    } // end of constructor

    public Integer getNumPages() {
        return numPages;
    } // end of getNumPages

    public void setNumPages(Integer n) {
        numPages = n;
    } // end of setNumPages

    public String toString() {

        String result;
        result = title;
        result = result + ", by " + author;
        result = result + " has " + numPages + " pages.";
        return result;

    } // end of toString

} // end of class Book
