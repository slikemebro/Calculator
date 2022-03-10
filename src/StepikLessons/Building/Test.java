package StepikLessons.Building;

public class Test {
    public static void main(String[] args) {
        Library library = new Library( "10.01.2004", "Sasha", false,
                2000);
        System.out.println(library);
        library.setPassword("qwerty12345");
        library.takeBook(5);
        library.showPassword();
        System.out.println(library);



    }
}
