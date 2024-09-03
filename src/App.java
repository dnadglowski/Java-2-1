import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");

        // Read an integer input from the user
        int number = scanner.nextInt();
        double fahrenheit = (9.0/5)* number + 32;
        System.out.print(number + " Celsius is " + fahrenheit +" Fahrenheit"); 
    }

}
