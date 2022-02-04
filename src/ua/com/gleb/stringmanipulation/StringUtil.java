package ua.com.gleb.stringmanipulation;

public class StringUtil {
    public static void main(String[] args) {
        String source = "Hello world!";

        String[] words = source.split(" ");

        char[] letters1 = words[0].toCharArray();
        char[] letters2 = words[1].toCharArray();

        System.out.println(words[0]);

        for (int i = 0; i < letters1.length; i++){
            System.out.println(letters1[i]);
        }

        System.out.println(words[1]);

        for (int j = 0; j < letters2.length; j++){
            System.out.println(letters2[j]);
        }

    }
}
