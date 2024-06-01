package SecondTasks;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("1. Sayiyi Giriniz : ");
        num1 = s.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        num2 = s.nextInt();

        System.out.println("\nSayilarin Carpimlarinin Sonucu : " + (num1 * num2));
    }
}
