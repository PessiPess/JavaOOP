package Lesson1_2.HomeTask.LectureTwo.Books;
/**
 * @author bpanchenko
 * */
public class Book {

    private static int identifier = 0;

    private final int id;
    private final String name;
    private final String author;
    private final String publishing;
    private final int yearOfPublishing;
    private final int countOfPages;
    private final int price;
    private final String binding;

    /**
     *
     * @param name name of book
     * @param author author of book
     * @param publishing publishing company, which printed book
     * @param yearOfPublishing year of publishing
     * @param countOfPages count of book's pages
     * @param price book price
     * @param binding type of binding
     */
    public Book(String name, String author, String publishing, int yearOfPublishing, int countOfPages, int price, String binding) {
        this.id = identifier;
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.yearOfPublishing = yearOfPublishing;
        this.countOfPages = countOfPages;
        this.price = price;
        this.binding = binding;
        identifier++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publishing='" + publishing + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", countOfPages=" + countOfPages +
                ", price=" + price +
                ", binding='" + binding + '\'' +
                '}';
    }


    public static int getIdentifier() {
        return identifier;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public int getPrice() {
        return price;
    }

    public String getBinding() {
        return binding;
    }
}
