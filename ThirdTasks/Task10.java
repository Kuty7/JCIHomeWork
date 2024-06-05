package ThirdTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num;
        int result = 0;

        System.out.print("Bir sayi girin : ");
        num = scanner.nextInt();
        System.out.println();

        if (num > 0) {
            for (int i = num; i > 0; i /= 10) {
                result += (i % 10);
            }
        }else {
            System.out.println("Lütfen pozitif bir sayi girin!");
            return;
        }

        System.out.println(num + " Sayisinin basamaklari toplami : " + result);
    }
}
