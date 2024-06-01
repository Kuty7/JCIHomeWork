package SecondTasks;

import java.util.Scanner;

public class FourteenthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1;
        String str2;

        System.out.print("1. Kelimeyi girin : ");
        str1 = s.nextLine();

        System.out.print("2. Kelimeyi girin : ");
        str2 = s.nextLine();

        System.out.println();

        if (str1.equals(str2))
            System.out.println("Girilen kelimeler aynıdır!");
        else
            System.out.println("Girilen kelimeler farklıdır!");
    }
}
