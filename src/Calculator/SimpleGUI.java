import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {
        String  s = "123.12312";
//        String s = "буквы,символы,цифры и тд и тп";
        s = s.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        System.out.println(s);
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1); // Возвращаем подстроку s, которая начиная с нулевой позиции переданной строки (0) и заканчивается позицией символа (pos), который мы хотим удалить, соединенную с другой подстрокой s, которая начинается со следующей позиции после позиции символа (pos + 1), который мы удаляем, и заканчивается последней позицией переданной строки.
    }
}