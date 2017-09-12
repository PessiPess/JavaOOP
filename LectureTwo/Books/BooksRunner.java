package Lesson1_2.HomeTask.LectureTwo.Books;

/**
 * @author bpanchenko
 * */
public class BooksRunner {

    public static void main(String[] args) {
        Books books = new Books();

        books.addBook(new Book("BookOne","AuthorOne","ABABAGALAMAGA",2007,500,270,"Solid bonding"));
        books.addBook(new Book("BookTwo","AuthorOne","Sun Publishing",2008,400,100,"Solid bonding"));
        books.addBook(new Book("BookThree","AuthorTwo","ABABAGALAMAGA",2009,50,50,"Solid bonding"));
        books.addBook(new Book("BookFour","AuthorOne","Sun Publishing",2010,250,90,"Soft bonding"));
        books.addBook(new Book("BookFive","AuthorTwo","ABABAGALAMAGA",2003,100,80,"Solid bonding"));

        books.printBooks();
        System.out.println();
        System.out.println("Books, with author AuthorTwo");
        books.sortByAuthor("AuthorTwo").printBooks();

        System.out.println();
        System.out.println("Books, printed after 2008");
        books.sortByYearOfPublishing(2008).printBooks();

        System.out.println();
        System.out.println("Books, printed with publishing company - Sun Publishing");
        books.sortByPublishing("Sun Publishing").printBooks();

    }
}
