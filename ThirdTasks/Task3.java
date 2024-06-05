package ThirdTasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int fibonacci = 1;
        int temp = 1;

        System.out.print("Bir sayi girin : ");
        num = scanner.nextInt();

        if (num > 2){
            for (int i = 0;i < num - 2; i++){
                fibonacci = fibonacci + temp;
                temp = fibonacci - temp;
            }

            fibonacci = 1;
            temp = 1;

            System.out.print("\nGirilen sayiya kadar fibonacci sayilari ; \n1 ");
            while (num > fibonacci){
                fibonacci = fibonacci + temp;
                temp = fibonacci - temp;

                System.out.print(temp + " ");
            }
        }
        System.out.println("\n" + num + ". Siradaki fibonacci sayisi : " + fibonacci);
    }
}
