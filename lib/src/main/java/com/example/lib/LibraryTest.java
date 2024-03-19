package com.example.lib;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.lang.reflect.Member;

abstract class LibraryItem{
    protected String title;
    protected int itemID;
    protected boolean isCheckedOut;
    public LibraryItem(String title,int itemID)
    {
        this.title=title;
        this.itemID=itemID;
        this.isCheckedOut=false;
    }
    public void checkOut()
    {
        isCheckedOut=true;
    }
    public void checkIn()
    {
        isCheckedOut=false;
    }


    @Override
    public String toString()
    {
    return "libraryItem{" +"title='"+ title+'\''+",itemID="+itemID+",isCheckedOut="+isCheckedOut +'}';

    }
}
interface Borrowable
{
void borrowItem(Memb member);
void returnItem();
}
class Book extends LibraryItem implements Borrowable
{
private String author;
private int numPages;
public Book(String title,int itemID,String author,int numPages)
{
    super(title,itemID);
    this.author=author;
    this.numPages=numPages;
}
public void borrowItem(Memb member)
{
  member.borrowBook(this);
}
public void returnItem()
{

}
public  String getTitle()
{
    return title;
}
public String getAuthor()
{
    return author;
}
public int getNumPages()
{
    return numPages;
}
}
class Memb
{
   private String name;
   private int memberID;
   private List<Book> booksBorrowed;
   public Memb(String name,int memberID) {
       this.name = name;
       this.memberID = memberID;
       this.booksBorrowed = new ArrayList<>();
   }
   public void borrowBook(Book book)
   {
     booksBorrowed.add(book);
     book.checkOut();

   }
   public void returnBook(Book book)
   {
       booksBorrowed.remove(book);
       book.checkIn();
   }
   public String getName()
   {
       return name;

   }

   public int getMemberID()
   {
       return memberID;
   }
   public List<Book> getBooksBorrowed()
   {
       return booksBorrowed;
   }
}
public class LibraryTest {
    public static void main(String[] args)
    {
      Book book1=new Book("java programming",101,"benjo",300) ;
      Memb member1=new Memb("Alice",1001);
      member1.borrowBook(book1);
     System.out.println("books borrowed by" +member1.getName()+":");
     for(Book book :member1.getBooksBorrowed())
     {
      System.out.println(book.getTitle()+"by"+book.getAuthor());
      }

    }

}
