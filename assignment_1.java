//this  code was written by Ikorun collins olawale
import java.util.Scanner;

public class assignment_1{
    //making variables object oriented 
    public static void main(String[] args){
        String password  = "collins";
        String input;
        int choice;
        int i; //thiis for my looping 
        Scanner object = new Scanner(System.in);
        System.out.println("Welcome to Ikottun Collins 21/0791 validation systen.......");
        System.out.println("Enter your password: ");
        input = object.nextLine();

        //usiing if statement to confirm the password 
        if(password.equals(input)){
            System.out.println("Valid password, select an option, the while section is in the else block");
            System.out.println("Select 1 for app development");
            System.out.println("Select 2 for cloud programming");
            System.out.println("Select 3 for Machine learniing");
            choice = object.nextInt();
            //this is the section for the switch case 
            switch(choice){
                case 1:
                    System.out.println("You need to learn kotlin,java and flutter");
                    break;
                case 2:
                    System.out.println("You need to learn AWS, GCP, and working wiith contaiiners.");
                    break;
                case 3:
                    System.out.println("You need to learn python - numpy,pandas.");
                    break;
                
                default:
                    System.out.println("Invalid input");
            }
            //the do while loop - prints sometjing repeatedly till i exceeds 
            System.out.println("This do while loop does something until i limit  is exceeded, input i( i < 2): ");
            i = object.nextInt();
            do{
                System.out.println("This is the do-while loop");
                i++;
            }
            while(i<5);

        }
        
        
        
        else{
            //this section shows how the while loop works
            System.out.println("Invalid details...Input a value for your (i) (1 < 7): ");
            i = object.nextInt();
            while(i < 10){
                System.out.println("You inputed a wrong password ");
                i++;
            }
            

        }

    }
}