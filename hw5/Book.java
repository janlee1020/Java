public class Book {
  public static final int AVAILABLE = 1;
  public static final int UNAVAILABLE = 2;
  private String title;
  private String author;
  private String isbn;
  private int pages;
  private int year;
  private int status;
  private Date due;
  private Patron patron;
  
  public Book () {
    patron=null;
    due=null;
    status=1;
  }
  public String Book(String title, String author, String isbn, int year, int pages) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.year = year;
    this.pages = pages;
  }
  
  public void checkin() {
    patron=null;
    due=null;
    status=1;
  }
  public void checkout(Patron patron, Date due) {
    this.patron=patron;
    this.due = due;
    status=2;
      
  }
  
  public boolean equals(Object other) {
    if(this.isbn==other.isbn) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public String getIsbn() {
    return isbn;
  }
  
  public int getPages() {
    return pages;
  }
  
  public int getYear() {
    return year;
  }
  
  public int getStatus() {
    return status;
  }
  
  public Date getDue() {
    return due;
  }
  
  public Patron getPatron() {
    return patron;
    
  }
  public String toString() {
    return String.format("Title: " + name + "Author: " + author + "ISBN: " + isbn + "Year: " + year + "Pages: " + pages + ".");
    
  }
}