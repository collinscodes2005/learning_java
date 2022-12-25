//by Ikotun Collins
//Code to calculate maximum heart_Rate and Target-heart-rate

import java.time.Year; //the year class
import java.util.Scanner; //the scanner class


public class assignment_oop1{

    //instatiating the scaner class
    static Scanner input_obj = new Scanner(System.in);
    static public class HeartRates{
        String first_name;
        String last_name;
        int day_of_birth;
        int year_of_birth;
        int month_of_birth;

        //constructor
         HeartRates(String first_name, String last_name, int dob, int yob, int mob){
            this.first_name = first_name;
            this.last_name = last_name;
            this.day_of_birth = dob;
            this.year_of_birth = yob;
            this.month_of_birth = mob;
        }

        //method to set the value for the age
        public int get_age(){
             return Year.now().getValue() - year_of_birth; //returning age using the year function
        }
        //method to calculate the maximum heart rate
        public int max_heart_rate(){
             return 220 - this.get_age(); //returning maximum heart rate
        }

        public int target_rate(){
             double base = 0.05 * this.max_heart_rate(); // beginning of the maximum heart rate
             double limit = 0.085 * this.max_heart_rate(); // limit of the maximum heart rate
             System.out.println( base + " - " + limit);
             return 0;

        }
    }
    public static void main(String[] args){
        String name_1;
        String name_2;
        int dobt; //day of birth
        int yobt; //year of birth
        int mobt; //month of birth
        //input section for the full name of the user
        System.out.print("Please input your first name : ");
        name_1  = input_obj.nextLine();
        System.out.print("Input your Last name : ");
        name_2 = input_obj.nextLine();
        System.out.print("Input your day of birth in digit(1-31) : ");
        dobt = input_obj.nextInt();
        System.out.println("Input the year of birth in digit : ");
        yobt = input_obj.nextInt();
        System.out.println("Input the month of birth in digit(1 - 12) : ");
        mobt = input_obj.nextInt();

        HeartRates object = new HeartRates(name_1, name_2, dobt, yobt, mobt);

        ///////////////////////////////////////////////////////
        System.out.println("Name  : " + object.first_name + object.last_name);
        System.out.println("Age   : " + object.get_age() + "years");
        System.out.println("year of birth : " + object.day_of_birth + "." + object.month_of_birth + "." + object.year_of_birth);
        System.out.println("Maximum heart rate : " + object.max_heart_rate());
        System.out.println("Rate : ");
        System.out.println(object.target_rate());


    }
}
