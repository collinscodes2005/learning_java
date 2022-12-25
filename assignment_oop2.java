//by Ikotun Collins
//Employee Salary display
import java.util.Scanner;

public class assignment_oop2 {

    //instatiating the scanner class
    Scanner obj_scanner = new Scanner(System.in);
    static public class Employee{
        String first_name; //  first name of employee
        String last_name;  // last name of the employee
        double salary; //employees salary

        //constructor for the employee class
        public Employee(String fname, String lname, double salary){
            //initializing the 3 variables
            this.first_name = fname;
            this.last_name = lname;
            //condtion states : --> do not set the salary if its not positive
            if (salary>0) {
                this.salary = salary;
            }
            else{
                System.out.print("The salary is not a positive value");
            }
        }
        //function for getting the name
        public String get_name(){
            return first_name;
        }
        //function
        public double get_salary(){
            return salary;
        }

    }
    public static void main(String[] args){
        String fname; //firstname input
        String lname; //last name input
        double wage;   //wage input

        Employee employee_1 = new Employee("Solomon", "Adeniran", 20000);
        Employee employee_2 = new Employee("Kelechi", "Pascal", 1000);

        //printing the employee info
        System.out.println("Employee name : " +employee_1.first_name +" " + employee_1.last_name);
        System.out.println("Yearly salary : " + employee_1.salary * 12);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Employee name : " +employee_2.first_name +" " + employee_2.last_name);
        System.out.println("Yearly salary : " + employee_2.salary * 12);

        //increasing salary by 10%
        double new_salary = employee_1.salary*0.1;
        double new_salary_2 = employee_2.salary*0.1;

        //printing the employee info
        System.out.println("Employee name : " +employee_1.first_name +" " + employee_1.last_name);
        System.out.println("Yearly salary : " + (employee_1.salary+new_salary) * 12);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Employee name : " +employee_2.first_name +" " + employee_2.last_name);
        System.out.println("Yearly salary : " + (employee_2.salary+new_salary_2) * 12);

    }
}
