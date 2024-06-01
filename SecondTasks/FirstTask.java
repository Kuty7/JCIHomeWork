package SecondTasks;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        num = s.nextInt();

        if (num < 0)
            System.out.println("\nGirilen sayi negatiftir.");
        else
            System.out.println("\nGirilen sayi pozitiftir.");
    }
}
