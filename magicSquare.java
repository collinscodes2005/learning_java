//code to display elements of a magicSquare
import java.util.Scanner;
public class magicSquare {
    //function for displaying row words
   public static void displayRow(String[] MagicSquare){
       for(int row=0;row< MagicSquare.length;row++){
           System.out.print(MagicSquare[row]);
       }
       //to break into a different line
       System.out.println(" ");
   }
   //function for displaying column words
   public static void displayColumn(String[][] MagicSquare, int col){
       //for loop for picking switching between between the column
           for (int row = 0; row<MagicSquare.length; row++){
               System.out.print(MagicSquare[row][col]);
           }
       }

    public static void main(String[] args){

        String[][] MagicSquare;


        MagicSquare = new String[4][4];



        MagicSquare[0][0] = "P";
        MagicSquare[0][1] = "R";
        MagicSquare[0][2] = "E";
        MagicSquare[0][3] = "Y";
        MagicSquare[1][0] = "L";
        MagicSquare[1][1] = "A";
        MagicSquare[1][2] = "V";
        MagicSquare[1][3] = "A";
        MagicSquare[2][0] = "O";
        MagicSquare[2][1] = "V";
        MagicSquare[2][2] = "E";
        MagicSquare[2][3] = "R";
        MagicSquare[3][0] = "T";
        MagicSquare[3][1] = "E";
        MagicSquare[3][2] = "N";
        MagicSquare[3][3] = "D";

        //variables for geting the row ad the column
        int r,c;


        //instatiating the scanner class

        Scanner sc = new Scanner(System.in);
        //getting the row wanted by the user
        System.out.println("Enter in the row you want (1-4)");
        r = sc.nextInt();

        //passing the values into the method for processing row
        displayRow(MagicSquare[0]);
        //getting the column wanted by the user
        System.out.println("Enter in the column you want (1-4)");
        c=sc.nextInt();

        //passing the values into the method for processing columns
        displayColumn(MagicSquare,  c);
    }
}
