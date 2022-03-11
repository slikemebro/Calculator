package StepikLessons;
import java.io.*;
import java.util.Scanner;

public class StepikLessons {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileReader reader = new FileReader("input.txt")) {

            scanner = new Scanner(reader);


            double value1 = Double.parseDouble(scanner.next());
            String operation = scanner.next();
            double value2 = Double.parseDouble(scanner.next());

            switch (operation) {
                case "+":
                    System.out.println(value1 + value2);
                    break;
                case "-":
                    System.out.println(value1 - value2);
                    break;
                case "*":
                    System.out.println(value1 * value2);
                    break;
                case "/":
                    if (value2 == 0) {
                        throw new ArithmeticException();
                    }
                    System.out.println(value1 / value2);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }

        } catch (IOException e) {
            System.out.println("Error! Wrong file");
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
        } catch (UnsupportedOperationException e) {
            System.out.println("Operation Error!");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero");
        } finally {

            scanner.close();

        }
    }
}
