package StepikLessons.Building;

public abstract class Building {
    String name;
    String street;
    String dateOfBuild;
    String nameOfArchitect;
    boolean isCultureHistory;

    {
        this.name = "Undefined";
        this.street = "Undefined";

    }

    public Building(String name, String street, String dateOfBuild, String nameOfArchitect, boolean isCultureHistory) {
        this.name = name;
        this.street = street;
        this.dateOfBuild = dateOfBuild;
        this.nameOfArchitect = nameOfArchitect;
        this.isCultureHistory = isCultureHistory;
    }

    public Building(){

    }

    public Building(String dateOfBuild, String nameOfArchitect, boolean isCultureHistory) {
        this.dateOfBuild = dateOfBuild;
        this.nameOfArchitect = nameOfArchitect;
        this.isCultureHistory = isCultureHistory;
    }

    // ---->



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDateOfBuild() {
        return dateOfBuild;
    }

    public void setDateOfBuild(String  dateOfBuild) {
        this.dateOfBuild = dateOfBuild;
    }

    public String getNameOfArchitect() {
        return nameOfArchitect;
    }

    public void setNameOfArchitect(String nameOfArchitect) {
        this.nameOfArchitect = nameOfArchitect;
    }

    public boolean isCultureHistory() {
        return isCultureHistory;
    }

    public void setCultureHistory(boolean cultureHistory) {
        isCultureHistory = cultureHistory;
    }
}
