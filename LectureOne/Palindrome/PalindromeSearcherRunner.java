package Lesson1_2.HomeTask.LectureOne.Palindrome;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author bpanchenko
 * */
public class PalindromeSearcherRunner {

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

    public static ArrayList<Integer> readList(int n){
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter "+n+" numbers");

        int counter = 0;
       do {
           int i = readInt();
            arrayList.add(i);
            counter++;
        } while (counter<n);

        return arrayList;
    }


    public static void main(String[] args) {
        System.out.println("Enter count of numbers");
        int n = readInt();
        PalindromeSearcher searcher = new PalindromeSearcher(readList(n));

        System.out.println("Palindrome is : "+searcher.getPalindrome());
    }
}
