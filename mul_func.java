//IkotunCollins 
import java.util.Scanner;
public  class mul_func{
    //method for detecting prime numbers
//making the scanner instance static 
    static Scanner object = new Scanner(System.in);

    //creating a flag
    static boolean detectPrime(int x){
        boolean flag = true;
        if(x<=1){
        return false;
     }

     else{
        for(int i = 2; i <= x/2; i++){
            if(x % i == 0){
              flag = false;
              break;
            }
        
        }
        return false;
     }

        // if (flag)
        // {
        //     System.out.println("This is a prime number");
        // }  
        // else{
        //     System.out.println("This is not a prime numner");
        // }
        // return true;
        
    }

    //method to detect odd numbers 
    static boolean detectOdd(int x){
        if (x % 2 == 1){
            System.out.println("this is an odd number ...");
            return true;
        }
        else{
            System.out.println("This is even number");
            return false;
        }
    }

    //find factorial
    static int factorial(int x){
        int mul = 1;
        for(int i = 1; i<=x; i++){
            mul = mul*i;
        }
        return mul;
    }

    //summation
    static int summation(int x){
        int sum = 0;
        for(int i=1; i<=x; i++){
            sum = sum+i;
        }
        return sum;
    }


//the main function..................................
//////////the sexy main function

    public static void main(String[] args){
        System.out.println("Welcome to the smart Math calculator");
        System.out.println("1 for detecting prime number");
        System.out.println("2 for detecting odd number ");
        System.out.println("3 for factorial");
        System.out.println("4 for summation");


        int choice;
        choice = object.nextInt();

        switch(choice){
            case 1: 
               int x;
               System.out.println("Input your value : ");
               x = object.nextInt();
               System.out.println(".. : " + detectPrime(x));
               break;
            case 2:
               int e;
               System.out.println("Input your value : ");
               e = object.nextInt();
               System.out.println(".. : " + detectOdd(e));
               break;
            case 3:
               int d;
               System.out.println("Input your value : ");
               d = object.nextInt();
               System.out.println(".. : " + factorial(d));
               break;
            
            case 4:
               int a;
               System.out.println("Input your value : ");
               a = object.nextInt();
               System.out.println(".. : " + summation(a));
               break;
               
            default:
                System.out.println("No valid work");
                break;
        }

    }
}