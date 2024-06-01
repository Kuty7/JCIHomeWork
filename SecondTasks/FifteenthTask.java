package SecondTasks;

import java.util.Scanner;

public class FifteenthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int year;

        System.out.print("Bir yil girin : ");
        year = s.nextInt();

        System.out.println();

        if (year % 4 == 0)
            System.out.println("Bu yil artik bir yildir.");
        else
            System.out.println("Bu yil bir artik yil degildir.");
    }
}
