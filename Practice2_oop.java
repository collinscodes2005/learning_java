//employee class stuff thingy
public class Practice2_oop{
    public static class Employee
    {
        //attributes
         String fname;
         String lname;
         double salary;
        Employee(String name, String lname, double slry)
        {
            //intializing the variables using constructors
            this.fname= name;
            this.lname=lname;
            // this.salary=salary;
            if (slry<0){
                System.out.println("Salary less than 0, not setting ");
            }
            else {
                //setting 
                this.salary = slry;
            }
        }
//        //get method
        public String get_fname(){

            return fname;
        }
        public String get_lname(){
            return lname;
        }
        public double get_salary(){
            return salary;
        }

        // //set method for mothly salry
        // static void set_salary(double slry){
        // }
    }
        public static void main(String[] args)
        {
            Employee employee_1 = new Employee("collins", "coke", 35);
            Employee employee_2 = new Employee("adesuwa", "cupa", 30);

            System.out.println(employee_1.fname);
            System.out.println(employee_2.fname);



        }
    
}