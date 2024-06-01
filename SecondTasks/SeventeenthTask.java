package SecondTasks;

import java.util.Scanner;

public class SeventeenthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("Bir sayi girin : ");
        num = s.nextInt();

        System.out.println("\nSayinin karesi : " + (num * num));
        System.out.println("Sayinin kubu : " + (num * num * num));
    }
}
