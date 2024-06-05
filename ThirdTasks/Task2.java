package ThirdTasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int result = 1;

        System.out.print("Faktoriyeli hesaplanacak sayiyi girin : ");
        num = scanner.nextInt();

        for (int i = num; i > 0; i--){
            result = result * i;
        }

        System.out.println("\nSayinin faktoriyeli : " + result);
    }
}
