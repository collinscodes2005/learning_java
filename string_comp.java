import java.util.Scanner;

public class string_comp{
    public static void main(String[] args)
    {
        //setting the instance of the scanner 
        Scanner object = new Scanner(System.in);
        String valid_username = "collins";
        String username;
        System.out.println("Please, input  your username : ");
        username = object.nextLine();

        if (valid_username.equals(username)){
            System.out.println("Welcome...");
        }
        else{
            System.out.println("This is  an iinvalid username");
        }
    }
}

