package Lesson1_2.HomeTask.LectureOne.Month;

import java.util.Scanner;

/**
 * @author bpanchenko
 * */
public class MonthRunner {

    public static int readInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }

    public static int readMonth(){

        String message = "Enter number of month";
        System.out.println(message);
        int month =readInt();
        while (month<1||month>12){
            System.out.println("Number of month must be in {1, 12], but actually is " +month);
            System.out.println(message);
            month = readInt();
        }
        return month;
    }

    public static void main(String[] args) {
        MonthNumber monthNumber = new MonthNumber(readMonth());
        System.out.println(monthNumber);

    }
}
