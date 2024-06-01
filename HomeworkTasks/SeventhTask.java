package HomeworkTasks;

/*
7- Java'da aritmetik operatörleri bir sayının 50 fazlasını aynı değere atayıp hesaplayan bir program yazın.

Not: Java'da 'int' bir değişken tanımlayalım. Sayı `6` olsun. Bu değerin 50 fazlasını değişkene geri atayan java kodunu yazınız.
İpucu: +=
*/

public class SeventhTask {
    private int num = 7;

    public void result(){
        System.out.println("Arttirma oncesi deger : " + num);
        num += 50;
        System.out.println("Arttirma sonrasi deger : " + num);
    }
}
