package SecondTasks;

import java.util.Scanner;

public class TwelfthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int month;

        System.out.print("Bir ay numarasi girin : ");
        month = s.nextInt();

        System.out.println();

        if (month <= 12 && month >= 0){
            if (month <= 8 && month >= 6)
                System.out.println("Yaz mevsimindesiniz!");
            else
                System.out.println("Yaz mevsiminde değilsiniz!");
        }
        else
            System.out.println("Girilen sayı bir aya karsilik gelmemektedir.");
    }
}
