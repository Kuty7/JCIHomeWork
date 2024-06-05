package ThirdTasks;

public class Task13 {
    public static void main(String[] args) {

        System.out.println("0 ve 1000 arasindaki palindromik sayilar ; ");

        for (int i = 0; i < 1000; i++){
            String num = String.valueOf(i);
            String controller = "";
            for (int j = 0; j < num.length(); j++){
                controller = controller + num.charAt(num.length() - j - 1);
            }
            if (num.equals(controller))
                System.out.println(num);
        }
    }
}
