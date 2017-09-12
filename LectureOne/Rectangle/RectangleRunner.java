package Lesson1_2.HomeTask.LectureOne.Rectangle;

/**
 * @author bpanchenko
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle(2,3);
        Rectangle rectangleSecond = new Rectangle(4,10);

        System.out.println("Area of first rectangle ("+rectangleFirst+") is "+rectangleFirst.area());
        System.out.println("Area of second rectangle ("+rectangleSecond+") is "+rectangleSecond.area());

        System.out.println("Perimeter of first rectangle ("+rectangleFirst+") is "+rectangleFirst.perimeter());
        System.out.println("Perimeter of second rectangle ("+rectangleSecond+") is "+rectangleSecond.perimeter());

        //create empty rectangles
        Rectangles rectangles = new Rectangles();

        //insert rectangleFirst and rectangleSecond
        rectangles.add(rectangleFirst);
        rectangles.add(rectangleSecond);

        System.out.println("Total area of all rectangles is "+rectangles.totalArea());

    }
}
