package Lesson1_2.HomeTask.LectureTwo.Books;

import java.util.ArrayList;

/**
 * @author bpanchenko
 * */
public class Books {
    private final ArrayList<Book> books;


    public Books(){
        books = new ArrayList<>();
    }

    /**
     *
     * @param book book, which we add to books
     */
    public void addBook(Book book){
        books.add(book);
    }

    /**
     *
     * @param author author, by which books sort
     * @return books, which have the same author - "author"
     */
    public Books sortByAuthor(String author){
        Books listOfBooks = new Books();
        for (Book book:books){
            if (book.getAuthor().equals(author))
                listOfBooks.addBook(book);
        }

        return listOfBooks;
    }

    /**
     *
     * @param publishing publishing, by which books sort
     * @return books, which have the same publishing - "publishing"
     */
    public Books sortByPublishing(String publishing){
        Books listOfBooks = new Books();
        for (Book book:books){
            if (book.getPublishing().equals(publishing))
                listOfBooks.addBook(book);
        }

        return listOfBooks;
    }

    /**
     *
     * @param year year, by which books sort
     * @return books, which printed after chosen year
     */
    public Books sortByYearOfPublishing(int year){
        Books listOfBooks = new Books();
        for (Book book:books){
            if (book.getYearOfPublishing()>=year)
                listOfBooks.addBook(book);
        }

        return listOfBooks;
    }


    public void printBooks(){
        System.out.println("Books :");
        for (Book book:books){
            System.out.println(book);
        }
    }
}
