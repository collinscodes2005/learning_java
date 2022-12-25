//code to calciulate the monthly consumption of consumer water
import java.util.Scanner;
public class midsem_1 {

    //amount of the units concumed by the consumer
    static int amount;
    static Scanner entry = new Scanner(System.in);

    //first method to accept the users name and display it
    static String display_name(){
        String name;
        System.out.println("please,  Enter your name : ");
        name = entry.nextLine();
        return name;

    }
    static double calculate_bill(){
        //2-5 unit attracts 500p
        //6-10 unit attract 700p
        //10unit + attracts 1000p
        int unit;
        System.out.println("Enter the units consumed by thew user : ");
        unit = entry.nextInt();
        if (unit>= 2 && unit<=5){
            amount = unit * 500;
        }
        else if (unit>=6 && unit <= 10){
            amount = unit * 700;
        }
        else if (unit > 10){
            amount = unit * 1000;
        }
        return amount;
    }
    public static void main(String[] args){
        System.out.println(display_name());
        System.out.println(calculate_bill());
    }
}
