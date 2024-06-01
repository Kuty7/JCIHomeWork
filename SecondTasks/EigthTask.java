package SecondTasks;

import java.util.Scanner;

public class EigthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num;

        System.out.print("Bir tam sayi giriniz : ");
        num = s.nextInt();

        System.out.println();

        if (num % 3 == 0 && num % 5 ==0)
            System.out.println("Sayi hem 3'e hem de 5'e tam bolunebilir!");
        else if(num % 3 == 0 && num % 5 != 0)
            System.out.println("Sayi 3'e tam bolunebilir fakat 5'e tam bolunemez!");
        else if(num % 3 != 0 && num % 5 == 0)
            System.out.println("Sayi 5'e tam bolunebilir fakat 3'e tam bolunemez!");
        else
            System.out.println("Sayi ne 3'e ne de 5'e tam bölünemez!");
    }
}
