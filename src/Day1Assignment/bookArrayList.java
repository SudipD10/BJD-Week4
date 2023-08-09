package Day1Assignment;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished){
        this.title =title;
        this.author= author;
        this.yearPublished = yearPublished;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
}

public class bookArrayList {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        //Adding Book object to the ArrayList
        books.add(new Book(" The Road ", " Cormac McCarthy ", 2006));
        books.add(new Book(" Cloud Atlas ", " David Mitchell ", 2004));
        books.add(new Book(" Wolf Hall ", " Hilary Mantel ", 2009));
        books.add(new Book(" The Sense of an Ending ", " Julian Barnes ", 2011));
        books.add(new Book(" The Sellout ", " Paul Beatty ", 2016));
        books.add(new Book(" The Goldfinch ", " Donna Tartt ", 2014));

        int yearToFilter = 2010;

        //Finding the Printing books after year 2010
        System.out.println(" Books published after " + yearToFilter + " : ");
        for (Book book : books){
            if (book.getYearPublished() > yearToFilter){
                System.out.println(" Tittle: " + book.getTitle() + " Author: " + book.getAuthor() + " Year: " + book.getYearPublished());

            }
        }


    }
}
