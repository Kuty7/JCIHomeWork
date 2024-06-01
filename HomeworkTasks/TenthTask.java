package HomeworkTasks;

/*
10- Ali ve Veli, bir akşam yemeği için dışarı çıkmayı planlıyorlar. Ali'nin yemeğe çıkabilmesi için iki şart var:
hava güzel olmalı ve Ali'nin yeterli parası olmalı.
Havanın güzel olup olmadığını boolean havaGuzel değişkeni ile,
Ali'nin yeterli parası olup olmadığını ise boolean yeterliPara değişkeni ile temsil ediyoruz.

Java'da bu iki şartın sağlanıp sağlanmadığını kontrol eden ve sonucu ekrana yazdıran bir program yazınız.
*/

public class TenthTask {
    private boolean havaGuzel = true;
    private boolean yeterliPara  = false;

    public void result(){
        if (havaGuzel && yeterliPara)
            System.out.println("Yemege cikilabilir!");
        else
            System.out.println("Yemege cikilamaz!");
    }
}
