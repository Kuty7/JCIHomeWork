package ThirdTasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int result = 0;

        System.out.print("Bir sayi girin : ");
        num = scanner.nextInt();

        System.out.println();

        while (num > 0){
            result = result + (num % 10);
            num /= 10;
        }

        System.out.println("Sayinin basamaklari toplami : " + result);
    }
}
