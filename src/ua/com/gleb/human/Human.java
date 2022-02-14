package ua.com.gleb.human;


import java.util.Objects;



public class Human implements Interface{
    String firstName;
    String secondName;
    int age;
    Country country;
    String dateOfBirthday;
    ColorOfHair colorOfHair;
    long id;
    int children;
    String dateOfDeath;
    double weight;
    private long money;
    private long salary;
    Sex sex;

    public Human(String firstName, String secondName, int age, Country country, String dateOfBirthday, ColorOfHair colorOfHair, long id, int children, double weight, long money, Sex sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.country = country;
        this.dateOfBirthday = dateOfBirthday;
        this.colorOfHair = colorOfHair;
        this.id = id;
        this.children = children;
        this.weight = weight;
        this.money = money;
        this.sex = sex;
    }

    public void death(String date){
        this.dateOfDeath = date;
    }

    public void changeFirstName(String newName){
        this.firstName = newName;
    }

    public void  changeSecondName(String newName){
        this.secondName = newName;
    }

    public void birthday(){
        age += 1;
    }

    public void changeHairColor(ColorOfHair color){
        colorOfHair = color;
    }

    public void checkId(){
        Children.childrenCheckId(this.id / 100_000_000, this.firstName + " you have a wrong Id, it should be 7 numbers", this.id % 100_000_000, this.firstName + " you have a wrong Id, it should be 7 numbers ");
    }

    public void takeShower() {
        System.out.println(this.firstName + " take a shower.");
    }

    public void goToGym(int hours, TypeOfTrain typeOfTrain){

        switch (typeOfTrain){
            case SOFT:
                double a = (this.weight / 150) * hours;
                System.out.println("This soft train you lost " +
                        a + " kilograms");
                this.weight -= ((this.weight / 150) * hours);
                break;

            case HARD:
                double b = (weight / 100) * hours;
                System.out.println("This hard train you lost " +
                        b + " kilograms");
                weight -= ((weight / 100) * hours);
                break;

            case LIGHT:
                double c = (this.weight / 200) * hours;
                System.out.println("This light train you lost " +
                        c + " kilograms");
                this.weight -= c;
                break;
            default:
                System.out.println("Try again something is wrong");
               break;
        }

    }

    public void shopping(long money){
        this.money -= money;
    }

    public void changeSex(Sex changingSex){
        this.sex = changingSex;
    }

    // GETTER; SETTER; TO STRING; EQUALS --->


    public double getSalary() {
        return (salary / 100f);
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public double getMoney() {
        return money / 100f;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", colorOfHair=" + colorOfHair +
                ", id=" + id +
                ", children=" + children +
                ", dateOfDeath='" + dateOfDeath + '\'' +
                ", weight=" + weight +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return id == human.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
