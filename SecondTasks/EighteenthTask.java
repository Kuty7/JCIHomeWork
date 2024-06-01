package SecondTasks;

import java.util.Scanner;

public class EighteenthTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String planet;

        System.out.println("İÇ GEZEGENLER  --> Merkür, Venüs, Dünya ve Mars.\n" +
                           "DIŞ GEZEGENLER --> Jüpiter, Satürn, Uranüs ve Neptün\n");

        System.out.print("Bir gezegen adi girin : ");
        planet = s.nextLine();

        switch (planet){
            case "Merkür":
                System.out.println("Gezegen bir iç gezegendir.");
                break;
            case "Venüs":
                System.out.println("Gezegen bir iç gezegendir.");
                break;
            case "Dünya":
                System.out.println("Gezegen bir iç gezegendir.");
                break;
            case "Mars":
                System.out.println("Gezegen bir iç gezegendir.");
                break;
            case "Jüpiter":
                System.out.println("Gezegen bir dış gezegendir.");
                break;
            case "Satürn":
                System.out.println("Gezegen bir dış gezegendir.");
                break;
            case "Uranüs":
                System.out.println("Gezegen bir dış gezegendir.");
                break;
            case "Neptün":
                System.out.println("Gezegen bir dış gezegendir.");
                break;
            default:
                System.out.println("Hatalı gezegen ismi girdisi!");
        }
    }
}
