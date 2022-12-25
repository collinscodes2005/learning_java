//importing the library with  the JoptionPane 
import javax.swing.*;


public class j_option{
    public static void main(String[] args){
        //crearting the instance of the joption pane to pass in all arguments and parameter inside of the joption panel//
      JFrame f = new JFrame();
      String course;
      int age;
      int level;

      JOptionPane.showMessageDialog(f, "Hello, welcome");

      //this section is receiving input using the Joption pane 
      String name  =  JOptionPane.showInputDialog(f, "Enter your name.....:");
      //using the parseint to convert the string input of Joptionpane into String 
      age = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter your age: "));

      //level
      level = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter your level:"));

    //input for course
     course = JOptionPane.showyInputDialog(f, "EWnter your course :  ");

    //condition - must be in software eng or medicine to be given the offer 
    if(course.equals("software") || course.equals("medicine")){
        if(age>18){
            if(level<=200){
                     JOptionPane.showMessageDialog(f, "Valid Credentials.....");
               
            }
        }    
    }
    else{
        JOptionPane.showMessageDialog(f, "Not a valid course..");

    }

      //JOptionPane.showMessageDialog(f, "Valid entry.....");


    //   }
    //   else{
    //     JOptionPane.showMessageDialog(f, "your name isn't available in the system");

    //   }



    }
}