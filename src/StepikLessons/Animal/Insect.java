package StepikLessons.Animal;

public class Insect extends Animal{

    {
        super.setName("Undefined");
        super.setType("Insect");
    }

    public Insect(){
        setWalk(true);
        population += 1;
    }

    int wingCount;
    boolean likeJesus;

    public void ggggg(){
        System.out.println("GGGGG");
    }

    @Override
    public void display() {
        System.out.println("I am an Insect");
        super.display();
        System.out.printf("I have %s wings, I %s walk on the water", wingCount, likeJesus == true? "can" : "can not");
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
}
