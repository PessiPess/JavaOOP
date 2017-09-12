package Lesson1_2.HomeTask.LectureOne.Palindrome;

import java.util.ArrayList;

/**
 * @author bpanchenko
 * */
public class PalindromeSearcher {
    private final ArrayList<Integer> list;


    /**
     *
     * @param list list of integers
     */
    public PalindromeSearcher(ArrayList<Integer> list) {
        this.list = list;
    }

    public PalindromeSearcher(){
        list = new ArrayList<>();
    }

    /**
     *
     * @param n integer, which are inserting in list
     */
    public void addInt(int n){
        list.add(n);
    }

    /**
     *
     * @return object with list of palindromes
     */
    private PalindromeSearcher getPalindromeList(){
        PalindromeSearcher searcher = new PalindromeSearcher();


        for (int i:list){
            if (Integer.toString(i).equals( new StringBuffer(Integer.toString(i)).reverse().toString())&&i>10)
                searcher.addInt(i);
        }

        return searcher;
    }

    /**
     *
     * @return firs palindrome, or second, if it exist. If palindromes not found throws Runtime Exception
     */
    public int getPalindrome(){
        PalindromeSearcher searcher = getPalindromeList();

        if (searcher.list.size()==0)
            throw new RuntimeException("Palindrome not found");


        if (searcher.list.size()>=2)
            return searcher.list.get(1);
        else
            return searcher.list.get(0);
    }
}
