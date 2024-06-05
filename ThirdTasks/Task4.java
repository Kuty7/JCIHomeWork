package ThirdTasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int num;
        boolean isPrime = true;

        System.out.print("Bir sayi girin : ");
        num = scanner.nextInt();

        System.out.println();
        if (num >= 2){
            for (int i = 2;i <= num / 2;i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }else{
            isPrime = false;
        }

        if (isPrime)
            System.out.println("Sayi asal sayidir!");
        else
            System.out.println("Sayi asal sayi değildir!");
    }
}
