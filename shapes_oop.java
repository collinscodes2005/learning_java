//importing the scanner class
import java.util.Scanner;
public class shapes_oop {
    static double triangle(double a, double b){
        double area = a*b*0.5;
        return area;
    }
    static double circle(double r){
        double area = 3.14*r*r;
        return area;
    }
    static double rectangle(double l, double b){
        double area = l*b;
        return area;
    }

    public static void main(String[] args){
        System.out.println("What shape do you wante here ");
        System.out.println("1. triangle ");
        System.out.println("2. circle ");
        System.out.println("3. rectangle ");
        int choice;
        Scanner obj = new Scanner(System.in);
        choice = obj.nextInt();
        double a ;
        double b;

        switch (choice){
            case 1 :
                System.out.println("Enter the 2 parameters ");
                a = obj.nextDouble();
                b = obj.nextDouble();
                System.out.println(triangle(a,b));

                break;

            case 2 :
                System.out.println("Enter the radius ");
                a = obj.nextDouble();
                System.out.println(circle(a));

                break;
            case 3:
                System.out.println("Enter the 2 parameters ");
                a = obj.nextDouble();
                b = obj.nextDouble();
                System.out.println(rectangle(a,b));

                break;
            default:
                System.out.println("Get the fuck outt!!!");

        }


    }
}
