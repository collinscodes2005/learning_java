import java.util.Scanner;
//import java.lang;

public class exponential{
    //function to find exponential pf a value
    static double exponent(double x, double n){

        double result;
        result = Math.pow(x,n);
        return result;


    }
    public static void main(String[] args){

        double a;  
        double b;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        a = object.nextInt();
        System.out.println("Enter the second value : ");
        b = object.nextInt();
        System.out.println("The answer is : " +  (exponent(a,b)));
        
    }
}