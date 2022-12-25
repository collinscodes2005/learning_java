import java.util.Scanner;
public class method_overloading{
    //method overloading  is when you can use  the method name but different signatures 
    //signatures : arguments, type of arguments 

    public static int evenCheck(int num)
    {

            if (num%2 == 0){
                System.out.println("The number is an even number ");
                int gug = 78;
                return gug;
            }
            else{
                System.out.println("The number is an odd number ");
                return 0;
            }
        } 
    public static int evenCheck(int x, int y){
        if(x > y){
            System.out.println("The number is divisible");
            int result = x+y;
            return result;


        }
        else{
            return 98;
        }
    }
    public static void main(String[] args){
        int x;
        int a;
        System.out.println("Enter a value : ");
        Scanner object = new Scanner(System.in);

        x = object.nextInt();

        System.out.println("Enter a second value : ");
        a = object.nextInt();

        System.out.println("First function gives : " + evenCheck(x));

        System.out.println("This is also an even check :" + evenCheck(x, a));


    }
}