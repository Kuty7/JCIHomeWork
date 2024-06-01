package SecondTasks;

public class SixteenthTask {
    public static void main(String[] args) {
        String str = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";

        System.out.println("Orjinal metin : " + str);

        str = str.replace(".", "!").replace("kötü", "iyi");

        System.out.println("Değişen metin : " + str);
    }
}
