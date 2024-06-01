package HomeworkTasks;

/*
9- Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
Ali, bir ürünün fiyatını 123.456 TL olarak görüyor. Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
Veli ise, kendi birikimlerini tam sayı olarak hesapladıktan sonra byte cinsine dönüştürmek istiyor.
Son olarak, Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.
*/

public class NinthTask {
    private double priceOfGood = 123.456;
    private int vallet = 54;
    private double secondGood = 213.434;

    public void result(){
        int totalPrice = (int)priceOfGood + (int)secondGood;
        byte totalVallet = (byte)vallet;

        System.out.println("Urunlerin Fiyatları\n1. Urun : " + priceOfGood + "TL\n2. Urun : " + secondGood + " TL\nCuzdandaki para : " + vallet + " TL");
        System.out.println("\nTamsayi cinsinde toplam urun fiyati : " + totalPrice + " TL");
        System.out.println("Cuzdandaki para miktari : " + totalVallet + " TL");

    }

}
