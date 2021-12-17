package JustJava;

import java.text.DecimalFormat;

public class FindPassword {
    public static void main(String args[]){
        int[] password = new int[10000];

        int number = 0;

        for (int i = 0; i < password.length; i++){
            password[i] = 0;
        }

        for (int i = 0; i < 10000; i++) {
            makeNumber(password, number);
            number++;
        }

        for (int j = 0; j < password.length; j++){
            if (password[j] < 1000){
                DecimalFormat decimalFormat = new DecimalFormat("0000");
                System.out.println(decimalFormat.format(password[j]));
            }else {
                System.out.println(password[j]);
            }
        }
    }

    private static void makeNumber(int[] password, int number) {
        int firstNumber = (int) (Math.random() * 10);
        int secondNumber = (int) (Math.random() * 10);
        int thirdNumber = (int) (Math.random() * 10);
        int fourthNumber = (int) (Math.random() * 10);
        int newPassword = Integer.valueOf(String.valueOf(firstNumber) + String.valueOf(secondNumber) +
                String.valueOf(thirdNumber) + String.valueOf(fourthNumber));
        for (int i = 0; i < password.length; i++){
            if (newPassword == password[i]){
                makeNumber(password, number);
            }
        }
        password[number] = newPassword;
    }
}
