package ThirdTasks;

public class Task14 {
    public static void main(String[] args) {

        System.out.println("0 ile 1000 arasindaki armstrong sayilari ; ");

        for (int i = 0; i < 1000; i++){
            String numStr = String.valueOf(i);
            //int step;
            int temp = i;
            int sum = 0;
            int power = 0;

            for (int j = 0; j < numStr.length(); j++){
                //temp = i;

                power = temp % 10;

                for (int k = 0; k < numStr.length() - 1;k++){

                    power *= (temp % 10);

                }

                temp /= 10;
                sum += power;

            }

            if (sum == i){
                System.out.println(i);
            }
        }

    }
}
