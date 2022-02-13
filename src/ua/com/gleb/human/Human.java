package ua.com.gleb.human;


import java.util.Objects;

public abstract class Human implements Interface{
    protected String firstName;
    protected String secondName;
    protected int age;
    protected Country country;
    String dateOfBirthday;
    ColorOfHair colorOfHair;
    long id;
    int children;
    String dateOfDeath;

    public Human(String firstName, String secondName, int age, Country country, String dateOfBirthday, ColorOfHair colorOfHair, long id, int children) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.country = country;
        this.dateOfBirthday = dateOfBirthday;
        this.colorOfHair = colorOfHair;
        this.id = id;
        this.children = children;

        checkId(id, firstName);
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

    public void checkId(long id, String firstName){
        long check = (id / 100_000_000);
        if (check > 1){
            System.out.println(firstName + " you have a wrong Id, it should be 7 numbers");
        }
        check = id % 100_000_000;
        if (check < 999_999){
            System.out.println(firstName + " you have a wrong Id, it should be 7 numbers ");
        }
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
