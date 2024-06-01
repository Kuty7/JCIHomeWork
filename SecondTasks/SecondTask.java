package SecondTasks;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);

        System.out.print("Bir kelime giriniz : ");
        str = s.nextLine();

        System.out.println("\nGirilen kelimenin uzunlugu : " + str.length());
    }
}
