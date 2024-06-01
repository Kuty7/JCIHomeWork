package SecondTasks;

import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String sentence;

        System.out.print("Bir Cumle giriniz : ");
        sentence = s.nextLine();

        if (sentence.length() < 50)
            System.out.println("\nKisa bir cumle!");
        else
            System.out.println("\nUzun bir cumle!");
    }
}
