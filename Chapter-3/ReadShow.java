package chapter_3;

import java.util.Scanner;

public class Read {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String word = scanner.next();

        System.out.println("You entered the word: " + word);

    }
}
