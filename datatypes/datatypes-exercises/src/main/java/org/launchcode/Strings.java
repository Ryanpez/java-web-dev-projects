package org.launchcode;
import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String wonderland = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into the book her sister was reading, but it had no" +
                " pictures or conversations in it, and what is the use of a book,’ thought Alice" +
                " ‘without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();
        System.out.println(wonderland.contains(search));
        int index = wonderland.indexOf(search);
        int length = search.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedWonderland = wonderland.replace(search, "");
        System.out.println(modifiedWonderland);

    }
}
