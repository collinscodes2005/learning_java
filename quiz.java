//code to check if numbers are consecutive or not
import java.util.Scanner;



public class quiz {

    //function checking if the numbers are consecutive 
    public static boolean consecutive(int a, int b, int c){

        if(b == a+1 && c  == b+1){
            System.out.println("Numbers are consecutive");
            return true;

        }
        else{
            System.out.println("Numbers are not consecutive  ");
            return false;
        }

    }

    //the main function
    public static void main(String args[]){
        int x;
        int y;
        int z;
        Scanner object = new Scanner(System.in);
   
        System.out.println("Enter the first number:  ");
        x = object.nextInt();
        System.out.println("Enter the second number: ");
        y = object.nextInt();
        System.out.println("Enter the third number : ");
        z = object.nextInt();

        consecutive(x, y, z);

       


    }
}
