import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //creating scanner
        Scanner scanner = new Scanner(System.in);
        //print statement
        System.out.print("Enter a degree in Celsius: ");

        // Read an integer input from the user
        int number = scanner.nextInt();
        //convert
        double fahrenheit = (9.0/5)* number + 32;
        //print statement 
        System.out.print(number + " Celsius is " + fahrenheit +" Fahrenheit"); 
    }

}
