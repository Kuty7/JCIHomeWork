package SecondTasks;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("Bir sayi giriniz : ");
        num = s.nextInt();

        System.out.println();

        if (num == 0)
            System.out.println("Sayi sifirdir!");
        else if (num < 0)
            System.out.println("Sayi negatiftir!");
        else
            System.out.println("Sayi pozitiftir!");
    }
}
