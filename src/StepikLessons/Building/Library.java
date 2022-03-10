package StepikLessons.Building;

public class Library extends Building{

    long numberOfBooks;
    String password;



    public Library(String name, String street, String dateOfBuild, String nameOfArchitect,
                   boolean isCultureHistory, long numberOfBooks) {
        super(name, street, dateOfBuild, nameOfArchitect, isCultureHistory);
        this.numberOfBooks = numberOfBooks;
    }

    public Library(String dateOfBuild, String nameOfArchitect, boolean isCultureHistory, long numberOfBooks) {
        super(dateOfBuild, nameOfArchitect, isCultureHistory);
        this.numberOfBooks = numberOfBooks;
    }

    public Library(){

    }

    public void takeBook(long books){
        this.numberOfBooks -= books;
    }

    public void comeBackBooks(long books){
        this.numberOfBooks += books;
    }

    public void showPassword(){
        System.out.println(password);
    }

    // --->

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", dateOfBuild=" + dateOfBuild +
                ", nameOfArchitect='" + nameOfArchitect + '\'' +
                ", isCultureHistory=" + isCultureHistory +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }

    public long getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(long numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
