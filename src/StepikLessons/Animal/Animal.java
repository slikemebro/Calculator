package StepikLessons.Animal;

public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    static int population = 0;

    {
        this.name = "Undefined";
        this.type = "Animal";
    }

    public Animal(){

    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        population += 1;
    }

    public void display(){
        System.out.println("Type: " + this.type + ", Name: " + this.name +
                ", Age: " + this.age + ", Weight: " + this.weight +
                ", \bCan fly: " + this.isFly + ", Can walk: " + this.isWalk +
                ", Can swim: " + this.isSwim);
    }

    static void newPopulation(int number){
        population += number;
    }

    public void rename(String newName){
        this.name = newName;
    }

    public void holiday(){
        this.age += 1;
        this.weight += 0.1;
    }

    public void holiday(double m){
        this.age += 1;
        this.weight += m;
    }

    public void holiday(double m, int n){
        this.age += 1;
        this.weight += ( m * n );
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFly=" + isFly +
                ", isWalk=" + isWalk +
                ", isSwim=" + isSwim +
                ", population=" + population +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }
}
