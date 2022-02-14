package ua.com.gleb.human;

public class Children extends Human{

    public Children(String firstName, String secondName, int age, Country country, String dateOfBirthday, ColorOfHair colorOfHair, long id, int children, double weight, long money, Sex sex) {
        super(firstName, secondName, age, country, dateOfBirthday, colorOfHair, id, children, weight, money, sex);
    }

    @Override
    public void death(String date) {
        super.death(date);
    }

    @Override
    public void goToGym(int hours, TypeOfTrain typeOfTrain) {
        super.goToGym(hours, typeOfTrain);
    }

    @Override
    public void changeFirstName(String newName){
        this.firstName = newName;
    }

    @Override
    public void  changeSecondName(String newName){
        this.secondName = newName;
    }

    @Override
    public void birthday(){
        age += 1;
    }

    @Override
    public void changeHairColor(ColorOfHair color){
        colorOfHair = color;
    }

    @Override
    public void takeShower() {
        System.out.println(this.firstName + " take a shower.");
    }


    public void checkId(){
        childrenCheckId(this.id / 100_000_000, this.firstName + " you have a wrong Id, it should be 7 numbers", this.id % 100_000_000, this.firstName + " you have a wrong Id, it should be 7 numbers ");
    }

    static void childrenCheckId(long l, String s, long l2, String s2) {
        long check = (l);
        if (check > 1){
            System.out.println(s);
        }
        check = l2;
        if (check < 999_999){
            System.out.println(s2);
        }
    }

    @Override
    public void shopping(long money) {
        super.shopping(money);
    }

    // GETTER SETTER TO STRING EQUALS --->


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(long salary) {
        super.setSalary(salary);
    }

    @Override
    public double getMoney() {
        return super.getMoney();
    }

    @Override
    public String toString() {
        return "Children{" +
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
                '}';
    }
}
