package ThirdTasks;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int addition;
        int result = 0;

        System.out.print("1. sayiyi girin : ");
        num1 = scanner.nextInt();

        System.out.print("2. sayiyi girin : ");
        num2 = scanner.nextInt();

        System.out.println();

        result = num1 + num2;

        do{
            System.out.println("Anlik sonuc : " + result);
            System.out.print("Yeni toplanacak sayiyi girin : ");
            addition = scanner.nextInt();
            result += addition;
        }while (addition != 0);

        System.out.println("Sonuc : " + result);
    }
}
