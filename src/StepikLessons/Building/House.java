package StepikLessons.Building;

public class House extends Building{

    int floors;
    int peoples;

    {
        super.setName("Undefined");
        super.setStreet("Undefined");
    }

    public House(String name, String street, String dateOfBuild, String nameOfArchitect, boolean isCultureHistory, int floors, int peoples) {
        super(name, street, dateOfBuild, nameOfArchitect, isCultureHistory);
        this.floors = floors;
        this.peoples = peoples;
    }

    public House(){

    }



}
