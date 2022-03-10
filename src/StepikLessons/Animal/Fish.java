package StepikLessons.Animal;

public class Fish extends Animal{

    {
        super.setName("Undefined");
        super.setType("Fish");
    }

    public Fish() {
        setSwim(true);
        population += 1;
    }

    String squama;
    boolean upStreamSwim;

    public void bulBul(){
        System.out.println("Bul-Bul");
    }

    @Override
    public void display() {
        System.out.println("I am a Fish");
        super.display();
        System.out.printf("My size is %s, i %s up stream swim", squama, upStreamSwim == true? "can" : "can not");
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
}
