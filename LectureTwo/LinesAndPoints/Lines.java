package Lesson1_2.HomeTask.LectureTwo.LinesAndPoints;

import java.util.ArrayList;

/**
 * @author bpanchenko
 * */
public class Lines {
    private final ArrayList<Line> lines;

    public Lines(){
        lines = new ArrayList<>();
    }

    /**
     *
     * @param line line, which we add to lines
     */
    public void addLine(Line line){
        lines.add(line);
    }


    /**
     *
     * @return summary length of lines
     */
    public double sumLength(){
        double sum = 0;
        for (Line line:lines){
            sum+=line.getLength();
        }

        return sum;
    }

    /**
     *
     * @return longest line of lines
     */
    public Line longestLine(){

        Line max = lines.get(0);
        double maxLength = max.getLength();
        for (int i = 1; i < lines.size(); i++) {

            if (lines.get(i).getLength()>maxLength){
                max = lines.get(i);
                maxLength = lines.get(i).getLength();
            }

        }

        return max;
    }
}
