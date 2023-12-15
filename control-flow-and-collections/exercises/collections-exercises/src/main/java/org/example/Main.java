package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static ArrayList<String> fiveLetterPrint(ArrayList<String> arr) {
        ArrayList<String> printWords = new ArrayList<>();
        System.out.println("How many letters are in a word you want to look for? : ");
        int number = input.nextInt();

        for (String word : arr) {
            if (word.length() == number) {
                printWords.add(word);
            }
        }
        return printWords;
    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;

    }
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1); intList.add(2); intList.add(2); intList.add(5); intList.add(6);
        intList.add(6); intList.add(2); intList.add(1); intList.add(1); intList.add(3);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("fight");strList.add("twice");strList.add("trog");
        strList.add("tru");strList.add("if");strList.add("cobble");

        System.out.println(sumEven(intList));

        System.out.println(fiveLetterPrint(strList));

        int[] intArr = {1, 1, 2, 3, 5, 8};
        for (int i : intArr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        String str = "I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        //String[] strArr = str.split(" ");
        String[] strArr = str.split("\\.");
        System.out.println(Arrays.toString(strArr));
    }
}






