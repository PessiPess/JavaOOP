package Lesson1_2.HomeTask.LectureOne.Rectangle;
/**
* @author bpanchenko
* */

public class Rectangle {
    private final double height;
    private final double width;

    /**
     * @param height,width width and height of rectangle
     * */
    public Rectangle(double height, double width) {
        if (height<0||width<0)
            throw new IllegalArgumentException("Height and Width must be positive, but actually is "+height+", "+width);
        this.height = height;
        this.width = width;
    }

    /**
     * @param rectangle rectangle, which will be copied into new object
     */
    public Rectangle(Rectangle rectangle){
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    /**
    * @return perimeter of rectangle*/
    public double perimeter(){
        return 2*(height+width);
    }

    /**
    * @return area of rectangle*/
    public double area(){
        return height*width;
    }

    /**
     *
     * @return string, which displays rectangle's fields
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
    /**
     * @return height of rectangle*/
    public double getHeight() {
        return height;
    }

    /**
     * @return width of rectangle*/
    public double getWidth() {
        return width;
    }

}
