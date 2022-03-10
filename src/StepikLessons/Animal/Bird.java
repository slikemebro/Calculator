package StepikLessons.Animal;

public class Bird extends Animal{

    {
        super.setName("Undefined");
        super.setType("Bird");
    }

    public Bird(){
        setFly(true);
        population += 1;
    }

    String area;
    boolean winterFly;

    public void chirikChirik(){
        System.out.println("Chirik-Chirik");
    }

    @Override
    public void display() {
        System.out.println("I am a Bird");
        super.display();
        System.out.printf("Зона обитания: %s, Улетает зимовать: " +
                "%s.\n", this.area, (this.winterFly ? "Да" : "Нет"));
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }
}
