import java.util.Scanner; 
public class clw_1{
    public static void main(String[] args){
        int age;
        String school_name;
        
        //using the charAT function
      //  char first = school_name.charAt(0);
        Scanner object = new Scanner(System.in);
        char val = 'b';
        System.out.println("Hello there , Input your age -  :  ");
        age  = object.nextInt();

        if( age >= 18){
            System.out.println("Age valid, input the name of your school");
            System.out.println("Input your school name : ");
            school_name = object.nextLine();
            if(school_name.indexOf('b') == 0){
                System.out.println("Welcome");
            }
            else{
            
                    System.out.println("Invalid school");
                }
        }
        else{
            System.out.println("Invalid");
        }
            
        }
    }
