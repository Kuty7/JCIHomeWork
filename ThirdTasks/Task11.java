package ThirdTasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removedDuplicates = "";

        System.out.print("Bir metin girin : ");
        String str = scanner.nextLine();

        System.out.println();

        for (int i = 0; i < str.length(); i++){

            String ch = "" + str.charAt(i);

            if (!removedDuplicates.contains(ch))
                removedDuplicates += ch;
        }

        System.out.println("Removed duplicates : " + removedDuplicates);
    }
}
