package ThirdTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num;
        int primeCounter = 0;
        int multiplier = 2;
        boolean isPrime = true;

        System.out.print("Bir sayi girin : ");
        num = scanner.nextInt();

        System.out.println();

        System.out.println(num + " sayisinin asal carpanlari ; ");

        while (num > 1) {
            int counter = 0;
            while (num % multiplier == 0) {
                num /= multiplier;
                counter++;
            }
            if (counter > 0) {
                System.out.println(multiplier);
                primeCounter ++;
            }
            multiplier++;
        }

        System.out.println(primeCounter + " tane asal carpan var.");
    }
}
