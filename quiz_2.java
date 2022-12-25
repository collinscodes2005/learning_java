import java.util.Scanner;

public class quiz_2{

    //function to return the interest value of an investmebt 
     public static void interest(int p, int r, int t){
    
        
        for (int i = 1; i <=t; i++){
            int result_1 = (p*r*i)/100 + p;
            System.out.println("The value for year : "+ i + "is " + result_1);
        }
     
    }
    


    //the main functionnnn

    public static void main(String args[]){
        int a;
        int b;
        int c;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter principal value : ");
        a = object.nextInt();
        System.out.println("Enter the rate ");
        b = object.nextInt();
        System.out.println("Enter the years : ");
        c = object.nextInt();

        interest(a, b, c);

    }
}