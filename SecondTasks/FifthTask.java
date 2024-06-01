package SecondTasks;

import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int note;

        System.out.println("90-100: A\n" +
                           "80-89: B\n" +
                           "70-79: C\n" +
                           "60-69: D\n" +
                           " 0-59: F\n");

        System.out.print("Bir not girin : ");
        note = s.nextInt();

        if (note < 0 || note > 100)
            System.out.println("Gecersiz bir not girildi");
        else {
            if (note < 60)
                System.out.println("Harf Notunuz : F");
            else if (note >= 60 && note < 70)
                System.out.println("Harf Notunuz : D");
            else if (note >= 70 && note < 80)
                System.out.println("Harf Notunuz : C");
            else if (note >= 80 && note < 90)
                System.out.println("Harf Notunuz : B");
            else
                System.out.println("Harf Notunuz : A");
        }
    }
}
