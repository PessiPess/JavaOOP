package Lesson1_2.HomeTask.LectureTwo.LinesAndPoints;
/**
 * @author bpanchenko
 * */
public class Line {
    private final Point start;
    private final Point end;

    /**
     *
     * @param start start point of line
     * @param  end point of line
     */
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(){
        start =new Point();
        end = new Point(10,10);
    }

    /**
     *
     * @return length of line
     */
    public double getLength(){
        return Math.sqrt(Math.pow(start.getX()-end.getX(),2)+Math.pow(start.getY()-end.getY(),2));
    }


}
