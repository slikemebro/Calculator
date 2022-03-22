package IceMan;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws IOException {
        int width = 800, height = 800;//задаем размеры формы
        JFrame frame = new JFrame();//создаем форму
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//способ выхода из формы
        frame.setTitle("Земля вокруг Солнца");//заголовок формы
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();//определяем разрешение монитора
        frame.setBounds(dim.width / 2 - width / 2, dim.height / 2 - height / 2, width, height + 30);//выставляем размеры окна
        frame.getContentPane().setLayout(null);//выравнивание, чтобы координаты объектов в дальнейшем считались от верхнего левого угла
        frame.getContentPane().setBackground(new Color(102, 204, 255));//фон окна
        BufferedImage previewImage1 = ImageIO.read(new URL("https://img-fotki.yandex.ru/get/9316/16969765.166/0_7b463_f71f9f83_orig.png"));//скачиваем картинку солнца 1
        BufferedImage previewImage2 = ImageIO.read(new URL("https://gastronoma.net/upload/image/Shevchenko__ChP_63.png"));//скачиваем картинку земли 2
        int pic1Width = previewImage1.getWidth(), pic1Height = previewImage1.getHeight();//запоминаем размер 1 (понадобится, когда будем двигать JLabel)
        int pic2Width = previewImage2.getWidth(), pic2Height = previewImage2.getHeight();//запоминаем ее размер (понадобится, когда будем двигать JLabel)
        JLabel wIcon1 = new JLabel(new ImageIcon(previewImage1));//создаем объект с картинкой, который будем размещать и двигать
        JLabel wIcon2 = new JLabel(new ImageIcon(previewImage2));//создаем объект с картинкой, который будем размещать и двигать
        int start1X = width / 2 - pic1Width / 2, start1Y = height / 2 - pic1Height / 2;//вычисляем координаты для картинки по центру
        wIcon1.setBounds(start1X, start1Y, pic1Width, pic1Height);//устанавливаем начальное положение картинки 1
        int start2X = width / 2 - pic2Width / 2, start2Y = height / 20;//вычисляем координаты движущейся картинки
        wIcon2.setBounds(start2X, start2Y, pic2Width, pic2Height);//устанавливаем начальное положение картинки 2
        frame.add(wIcon1);//добавляем картинку на форму
        frame.add(wIcon2);//добавляем картинку на форму
        frame.setVisible(true);//делаем форму видимой
        int radius=Math.max(width, height)/2-Math.max(pic2Width, pic2Height);// находим оптимальный радиус окружности
        int deltaX=width/2-pic2Width/2, deltaY=height/2-pic2Height/2;//константы для смещения картинки, чтобы не рассчитывать их постоянно
        for (int t = 0; t < 360;) {
            try {//сперва работает таймер
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            wIcon2.setBounds((int) (radius*Math.cos(t*Math.PI/180))+deltaX, (int) (radius*Math.sin(t*Math.PI/180))+deltaY, pic2Width, pic2Height);//перемещаем картинку в нужную точку, которую вычисляем по формуле параметрических уравнений линий, приводя градусы t к радианам
            wIcon2.repaint();//перерисовываем картинку
            t=t==359?0:t+1;//этой формулой обеспечиваем постоянный цикл и обнуление t при 359
        }
    }
}