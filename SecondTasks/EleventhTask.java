package SecondTasks;

import java.util.Scanner;

public class EleventhTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String sentence;
        String lookfor;

        System.out.print("Bir cumle girin : ");
        sentence = s.nextLine();

        System.out.print("Baslangic kelimesi girin : ");
        lookfor = s.nextLine();

        System.out.println();

        if (sentence.startsWith(lookfor))
            System.out.println("Cumle aranan kelime ile basliyor!");
        else
            System.out.println("Cumle aranan kelime ile baslamiyor!");
    }
}
