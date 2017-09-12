package Lesson1_2.HomeTask.LectureOne.Month;
/**
 * @author bpanchenko
 * */
public class MonthNumber {
    private final int number;

    /**
     * @param num number, of month
     */
    public MonthNumber(int num) {
        if (!isMonth(num))
            throw new IllegalArgumentException("Number of month must be in {1, 12], but actually is "+num);
        this.number = num;
    }

    /**
     * @return return true, if number is correct, otherwise return false
     */
    private boolean isMonth(int num) {
        return (num >= 1 && num <= 12);
    }


    /**
     * @return name of the month
     */
    @Override
    public String toString() {
        switch (number){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new RuntimeException("Number of month must be in {1, 12], but actually is "+number);
        }

    }
}
