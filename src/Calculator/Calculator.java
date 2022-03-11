package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Calculator extends JFrame{
    private JButton button1 = new JButton("1");
    private JButton button2 = new JButton("2");
    private JButton button3 = new JButton("3");
    private JButton button4 = new JButton("4");
    private JButton button5 = new JButton("5");
    private JButton button6 = new JButton("6");
    private JButton button7 = new JButton("7");
    private JButton button8 = new JButton("8");
    private JButton button9 = new JButton("9");
    private JButton button0 = new JButton("0");
    private JButton buttonMultiply = new JButton("*");
    private JButton buttonDivision = new JButton("/");
    private JButton buttonMinus = new JButton("-");
    private JButton buttonPlus = new JButton("+");
    private JButton buttonEquals = new JButton("=");
    private JButton test12 = new JButton("test");
    private JTextField input = new JTextField("");
    private JLabel output = new JLabel("");

    public Calculator(){
        super("Simple Example");
        this.setBounds(50, 50, 420, 540);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        this.add(input);
//        input.setBounds(0, 0, 300, 100);

        this.add(output);
        output.setBounds(0,0,300,100);
        output.setText("123");
        output.setText("321");

        this.add(button1);
        button1.setBounds(0, 100, 100, 100);
        this.add(button2);
        button2.setBounds(100, 100, 100, 100);
        this.add(button3);
        button3.setBounds(200, 100, 100,100);
        this.add(button4);
        button4.setBounds(0, 200, 100,100);
        this.add(button5);
        button5.setBounds(100,200,100,100);
        this.add(button6);
        button6.setBounds(200, 200, 100,100);
        this.add(button7);
        button7.setBounds(0, 300,100,100);
        this.add(button8);
        button8.setBounds(100, 300, 100,100);
        this.add(button9);
        button9.setBounds(200,300,100,100);
        this.add(button0);
        button0.setBounds(100,400,100,100);
        this.add(buttonDivision);
        buttonDivision.setBounds(300,0,100,100);
        this.add(buttonMultiply);
        buttonMultiply.setBounds(300,100,100,100);
        this.add(buttonMinus);
        buttonMinus.setBounds(300,200,100,100);
        this.add(buttonPlus);
        buttonPlus.setBounds(300,300,100,100);
        this.add(buttonEquals);
        buttonEquals.setBounds(300,400,100,100);

        this.add(test12);
        test12.setVisible(false);

        button1.addActionListener(new ListenerButton1());
        button2.addActionListener(new ListenerButton2());
        button3.addActionListener(new ListenerButton3());
        button4.addActionListener(new ListenerButton4());
        button5.addActionListener(new ListenerButton5());
        button6.addActionListener(new ListenerButton6());
        button7.addActionListener(new ListenerButton7());
        button8.addActionListener(new ListenerButton8());
        button9.addActionListener(new ListenerButton9());
        button0.addActionListener(new ListenerButton0());

        buttonPlus.addActionListener(new ListenerButtonPlus());
        buttonMinus.addActionListener(new ListenerButtonMinus());
        buttonMultiply.addActionListener(new ListenerButtonMultiply());
        buttonDivision.addActionListener(new ListenerButtonDivision());

        buttonEquals.addActionListener(new ListenerButtonEquals());
    }
    String number1 = "";
    String number2 = "";
    String doing = "";
    int a = 0;

    class ListenerButtonEquals implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double answer;
            String message = "";
            message += number1 + " " + doing + " " + number2 + " = ";
            double integerNumber1 = Double.parseDouble(number1);
            double integerNumber2 = Double.parseDouble(number2);
            if (integerNumber2 == 0){
                message = "You can division by zero";
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
                number1 = "";
                number2 = "";
                doing = "";
                a = 0;
            }else {
                switch (doing) {
                    case ("+"):
                        answer = integerNumber1 + integerNumber2;
                        message += answer;
                        break;
                    case ("-"):
                        answer = integerNumber1 - integerNumber2;
                        message += answer;
                        break;
                    case ("/"):
                        answer = integerNumber1 / integerNumber2;
                        message += answer;
                        break;
                    case ("*"):
                        answer = integerNumber1 * integerNumber2;
                        message += answer;
                        break;
                    default:
                }
                JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
                number1 = "";
                number2 = "";
                doing = "";
                a = 0;
            }
        }
    }

    class ListenerButtonMultiply implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            doing = "*";
            a++;
        }
    }

    class ListenerButtonPlus implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            doing = "+";
            a++;
        }
    }

    class ListenerButtonMinus implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            doing = "-";
            a++;
        }
    }

    class ListenerButtonDivision implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            doing = "/";
            a++;
        }
    }

    class ListenerButton1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "1";
            }else {
                number2 += "1";
            }
        }
    }

    class ListenerButton2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "2";
            }else {
                number2 += "2";
            }
        }
    }

    class ListenerButton3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "3";
            }else {
                number2 += "3";
            }
        }
    }

    class ListenerButton4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "4";
            }else {
                number2 += "4";
            }
        }
    }

    class ListenerButton5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "5";
            }else {
                number2 += "5";
            }
        }
    }

    class ListenerButton6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "6";
            }else {
                number2 += "6";
            }
        }
    }

    class ListenerButton7 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "7";
            }else {
                number2 += "7";
            }
        }
    }

    class ListenerButton8 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "8";
            }else {
                number2 += "8";
            }
        }
    }

    class ListenerButton9 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "9";
            }else {
                number2 += "9";
            }
        }
    }

    class ListenerButton0 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (a == 0){
                number1 += "0";
            }else {
                number2 += "0";
            }
        }
    }


//    class ButtonEventListener implements ActionListener{
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            String message = "";
//            message += "Button was pressed\n";
//            message += "Text is " + input.getText() + "\n";
//            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected\n";
//            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
//            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
//        }
//    }

}
