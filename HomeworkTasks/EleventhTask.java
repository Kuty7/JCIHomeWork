package HomeworkTasks;

/*
11- Aşağıdaki Java programında, mantıksal ve ilişkisel operatörleri kullanarak belirli koşulları kontrol ediniz ve sonuçları ekrana yazdırınız.
Programda `if`, `else`, `for`, `while` gibi kontrol yapıları kullanmadan ifadelerin doğruluğunu ve mantıksal işlemleri gerçekleştiriniz.

Görevler:
1. Üç adet tam sayı belirleyiniz: `a = 5`, `b = 8`, `c = 12`.
2. Aşağıdaki ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız:
    - `a`, `b` ve `c`'nin toplamı 25'e eşit mi?
    - `a` ve `b`'nin toplamı `c`'den büyük mü?
    - `a`'nın karesi `b`'den küçük mü?
    - `b`, `a` ve `c` arasında ortanca değer mi?
    - `c`, `a` ve `b`'nin toplamından küçük mü?

3. Mantıksal ve ilişkisel operatörleri kullanarak ifadelerin doğruluğunu kontrol ediniz ve sonuçları ekrana yazdırınız.

İstenen Çıktı:

a, b ve c'nin toplamı 25'e eşit mi? true
a ve b'nin toplamı c'den büyük mü? true
a'nın karesi b'den küçük mü? true
*/

public class EleventhTask {
    private int a = 5;
    private int b = 8;
    private int c = 12;

    public void result(){

        System.out.println("a, b ve c'nin toplami 25'e esit mi?      : " + (a + b + c == 25));

        System.out.println("a ve b'nin toplami c'den buyuk mu?       : " + (a + b > c));

        System.out.println("a'nin karesi b'den kucuk mu?             :" + (a * a < b));

        System.out.println("b, a ve c arasinda ortanca deger kactir? :" + ((b > a &&  b < c) || (b < a && b > c)));

        System.out.println("c, a ve b'nin toplamindan kucuk mu?      :" + (c < (a + b)));

    }
}
