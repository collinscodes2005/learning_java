import java.util.Scanner;
public class simple_calc{
    static int option;
    static int  a;
    static int b;
    static Scanner machine = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcomme to intelligent calculator");
        System.out.println("This are the following operations you can perform");
        System.out.println("1. additon");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Max between 2 numbers ");
        System.out.println("5. minimum value");
        System.out.println("6. Square root");
        System.out.println("Enter your valueeee:    ");

        //initializing the input section
        option = machine.nextInt();

        //condition section for the operations 
        switch(option){
            case 1: 
                int sum;
                System.out.println("Enter the first number : ");
                a = machine.nextInt();
                System.out.println("Enter the second number :  ");
                b = machine.nextInt();
                sum = a + b;
                System.out.println("The sum of the values you inputed is : " + sum );
            case 2:
                int sub;
                System.out.println("Enter the first number : ");
                a = machine.nextInt();
                System.out.println("Enter the second number: ");
                b = machine.nextInt();
                sub = a - b;
                System.out.println("The subtraciton of the two nnumbers is :"+ sub);
            
            case 3:
                int multi;
                System.out.println("Enter the first number : ");
                a = machine.nextInt();
                System.out.println("Enter the second number: ");
                b = machine.nextInt();
                multi = a * b;
                System.out.println("The multiplication of the two numbers : " +multi);

            case 4:
                int max;
                System.out.println("Enter the first number : ");
                a = machine.nextInt();
                System.out.println("Enter the second number: ");
                b = machine.nextInt();
                max = Math.max(a,b);
                System.out.println("The maximum value is : " + max);

            case 5:
                int min;
                System.out.println("Enter the first number : ");
                a = machine.nextInt();
                System.out.println("Enter the second number: ");
                b = machine.nextInt();
                min = Math.min(a,b);
                System.out.println("The minimum value is : "+ min);
            
            case 6:
                double sqrt;
                System.out.println("Enter the number : ");
                a = machine.nextInt();
                sqrt = Math.sqrt(a);
                System.out.println("The squareroot of the val is : " + sqrt);

        }

        
        


        //inpuiti

        }
}