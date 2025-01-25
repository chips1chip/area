import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values of a and b:");
        float length=sc.nextFloat();
        float breadth=sc.nextFloat();
        sc.close();
        System.out.println("area of rectangle:"+ length*breadth);
    }
}