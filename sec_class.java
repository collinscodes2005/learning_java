import java.util.Scanner;

public class sec_class{
    public static  void main(String[] args){
        Scanner inputer = new Scanner(System.in);
        //initializing string variables 
        //concatenation - ailoty to join two datatypes or two variables // 
        String name;
        boolean boolVal;
        int num_val;
        System.out.print("Please Enter your name : ");
        name = inputer.nextLine();

        System.out.println("Enter a boolean value: ");
        boolVal = inputer.nextBoolean();

        System.out.println("Enter a Numerical value : ");
        num_val = inputer.nextInt();
        


        // String name = "Collins";
        // String second_name = "Micheal";
        // String Empty_one;

        // Empty_one = name + second_name;

        // //printning ut the third string 
        // System.out.println(Empty_one);
        // //printing the length of  the variable 
        // System.out.println(Empty_one.length());
        



    }
}


