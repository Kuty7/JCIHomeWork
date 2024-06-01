package HomeworkTasks;
/*
8- Java'da iki tamsayıyı toplamak, çıkarmak, çarpmak, bölmek ve bölümünden kalanını hesaplayan için bir program yazınız. Sayılar `15` ve `2` olsun:
 */
public class EightTask {

    private int num1 = 15;
    private int num2 = 2;

    //Eğer bölme sonucu tam değilse aşağıdaki fonksiyon kullanılmalı fakat taskı tam anlayamadığımdan int'de bırakmayı tercih ettim.
    /*
    public double division(double num1, double num2){
        return num1 / num2;
    }
    */
    public int division(int num1, int num2){
        return num1 / num2;
    }

    private int multiplication (int num1, int num2){
        return num1 * num2;
    }

    private int subtraction (int num1, int num2){
        return num1 - num2;
    }

    private int addition (int num1, int num2){
        return num1 + num2;
    }

    private int remainder(int num1, int num2){
        return num1 % num2;
    }

    public void result(){
        System.out.println("Toplama sonuc   : " + addition(num1, num2));
        System.out.println("Cikarma sonuc   : " + subtraction(num1, num2));
        System.out.println("Carpma sonuc    : " + multiplication(num1, num2));
        System.out.println("Bolme sonuc     : " + division(num1, num2));
        System.out.println("Bolumden kalan  : " + remainder(num1, num2));
    }
}
