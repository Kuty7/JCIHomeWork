package SecondTasks;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1;
        String str2;

        System.out.print("1. cumleyi girin : ");
        str1 = s.nextLine();

        System.out.print("2. cumleyi girin : ");
        str2 = s.nextLine();

        System.out.println();

        if (str1.length() > str2.length())
            System.out.println("1. cumle daha uzundur!");
        else if (str1.length() == str2.length())
            System.out.println("Cumlelerin uzunlukları esittir!");
        else
            System.out.println("2. cumle daha uzundur!");
    }
}
