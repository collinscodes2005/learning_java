import java.util.Scanner;
public class class_method{

    static String addition(int x, int y){
        int result;
        String name = "Mercweds";
        String name_2 = "Heidi";
        result = x + y;
        if (result<7){
            return name;
        }
        else{
            return name_2;
        }
    }

    //main function
    public static void main(String[] args){
        int a;
        int b;
        Scanner object = new Scanner(System.in);
        //for inputing the first number 
        System.out.println("Enter the first number: ");
        a = object.nextInt();

        //second number 
        System.out.println("Enter the second number : ");
        b = object.nextInt();

        System.out.println(addition(a, b));

    }
}
