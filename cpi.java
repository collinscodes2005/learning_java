import java.util.Scanner;
public class cpi {
    //creating the method that gets the value form the user
    static Scanner entry = new Scanner(System.in);
    //the historicalCPI variable
    static double historicalCPI = 15.34;
    //the currentCPI variable
    static double currentCPI;
    //function to get the cpi from the user
    static double getCPI(){
        //asking user for value
        do {
            System.out.print("Enter a decimal value betweeen -20 and 20 : ");
            currentCPI = entry.nextDouble();
            if(currentCPI > 20 ){
                System.out.println("Number too highh");
            }
            else if(currentCPI < -20){
                System.out.println("Number too low ");
            }
            else {
               return currentCPI;
            }
        }
        while(currentCPI <= - 20 || currentCPI >= 20);
        return currentCPI;

    }
    static double inflation(double currentCPI, double historicalCPI){
        double inflation_rate = (currentCPI - historicalCPI/currentCPI) * 100;
        return inflation_rate;
    }
    //main function
    public static void main(String[] args){
        getCPI();
        System.out.println("inflation rate is : " + inflation(currentCPI, historicalCPI));
    }
}

