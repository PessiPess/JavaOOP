package Lesson1_2.HomeTask.LectureOne.Rectangle;

import java.util.ArrayList;

/**
 * @author bpanchenko
 * */
public class Rectangles {
    private final ArrayList<Rectangle> rectangles;


    public Rectangles() {
        this.rectangles = new ArrayList<>();
    }

    /**
     * @param rectangle rectangle, which we add
     */
    public void add(Rectangle rectangle){
        rectangles.add(new Rectangle(rectangle));
    }

    /**
     * @return total area of all rectangles, which are in object
     */
    public double totalArea(){
        double area = 0;
        for (Rectangle rectangle:rectangles){
            area+=rectangle.area();
        }
        return area;
    }
}
