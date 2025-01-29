import java.util.Scanner;  // Importing the Scanner class to take user input

public class Area {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter the values for length and breadth
        System.out.println("enter values of a and b:");

        // Reading the length and breadth values from the user
        float length = sc.nextFloat();   
        float breadth = sc.nextFloat();  

        // Closing the scanner object 
        sc.close();

        System.out.println("area of rectangle: " + length * breadth);  // Output the area
    }
}
