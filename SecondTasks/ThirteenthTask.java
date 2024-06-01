package SecondTasks;

import java.util.Scanner;

public class ThirteenthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str;
        String character;

        System.out.print("Bir metin giriniz : ");
        str = s.nextLine();

        System.out.print("Bir karakter giriniz : ");
        character = s.nextLine();

        System.out.println();

        if (character.length() == 1){
            System.out.println("Karakter, '" + character + "' " + str.indexOf(character) + ". pozisyonda bulunuyor.");
        } else
            System.out.println("Sadece 1 karakter girilmeli!");
    }
}
