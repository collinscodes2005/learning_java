import java.util.Scanner;
public class using_util{
    public static void main(String[] args){
        int value;
        int age;
        Scanner object = new Scanner(System.in);
        System.out.print("Input a value  to print desired output");
        value = object.nextInt();

        if (value == 1){
            System.out.println("My name is collins.");
        }
        else if(value == 2){
            System.out.println("My school is babcock");
        }
        else if(value == 3){
            System.out.println("Lecturers name is otuneme.");
        }
        else if(value == 4){
            System.out.println("My hostel is akande ");
        }
        else{
            System.out.println("Invalid input ");
        }


    }
}
