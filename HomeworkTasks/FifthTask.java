package HomeworkTasks;

public class FifthTask {
    private int a = 10;
    private int b = 20;

    public void result(){
        /*Başlangıçta b'nin değer ataması 20 olarak a'nın ise değeri 10 olarak belirlenmiştir.
        Başlangıçta b değişkenine değer atama sebebim, değişkenlerin işlem öncesi durumlarını göstterebilmek.
        Atama işlemlerinde eşitliğin sağ tarafındaki değer eşitliğin sol tarafına atanır bu yüzden b değişkenine değer atama aşağıdaki gibi yapılır.*/

        System.out.println("a degiskeninin ilk degeri : " + a);
        System.out.println("b degiskeninin ilk degeri : " + b);

        System.out.println("#Islem#");
        b = a;

        System.out.println("a degiskeninin son degeri : " + a);
        System.out.println("b degiskeninin son degeri : " + b);
    }
}
