package Lesson1_2.HomeTask.LectureTwo.LinesAndPoints;
/**
 * @author bpanchenko
 * */
public class Point {
    private final double x;
    private final double y;

    /**
     *
     * @param x coordinate on axis Ox
     * @param y coordinate on axis Oy
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
