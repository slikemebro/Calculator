package ua.com.gleb.human;

public class Children extends Human{
    public Children(String firstName, String secondName, int age, Country country, String dateOfBirthday, ColorOfHair colorOfHair, long id, int children) {
        super(firstName, secondName, age, country, dateOfBirthday, colorOfHair, id, children);
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


    public void takeSower(){
        System.out.println(this.firstName + " take a shower.");
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
                '}';
    }
}
