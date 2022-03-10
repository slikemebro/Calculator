package StepikLessons.WritingMaterials;

import java.security.SecureRandom;

public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;

    {
        this.name = "Undefined";
        this.color = "White";
    }

    public WritingMaterials(){

    }


    public WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price){
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw){
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.name = "No Name";
        this.color = "No Color";
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public String display() {
        return "WritingMaterials{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", draw=" + draw +
                '}';
    }

    public void replaceRod(String newRod){
        this.color = newRod;
    }

    public void priceUp(int discount){
        this.price += discount;
    }
    public void priceDown(int discount){
        this.price -= discount;
    }

    public void draw(){
        if (draw == true) {
            System.out.println(name + " провёл линию. Её цвет - " + color);
        }else {
            System.out.println(name + " не может ничего нарисовать.");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}
