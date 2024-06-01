package SecondTasks;

import java.util.Scanner;

public class ForthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("1. Kenar uzunlugu giriniz : ");
        a = s.nextInt();

        System.out.print("2. Kenar uzunlugu giriniz : ");
        b = s.nextInt();

        System.out.print("3. Kenar uzunlugu giriniz : ");
        c = s.nextInt();

        if (a == b && b == c)
            System.out.println("\nBu ucgen eskenar ucgendir!");
        else
            System.out.println("\nBu ucgen eskenar ucgen degildir!");

    }
}
