package ThirdTasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reversedStr = "";

        System.out.print("Bir metin girin : ");
        String str = scanner.nextLine();

        System.out.println();

        for (int i = str.length() - 1; i >= 0; i--){
            reversedStr += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reversedStr))
            System.out.println("metnin tersi ve düzü eşittir.");
        else
            System.out.println("metnin tersi ve düzü eşit değildir.");
    }
}
