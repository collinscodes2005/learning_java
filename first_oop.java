public class first_oop {
    static class Student{

        //sttributes
        static String name;
        static int level;

        //getter for the name
        static String getName(){
            return name;
        }


        static void setName(String name_input){
            name = name_input;
        }

        static void print_name(){
            System.out.println(name + " is in class");
        }


    }

    public static void main(String[] args){
        Student mimi = new Student();
        mimi.name = "mimi";
        mimi.level = 100;

        mimi.print_name();



    }
}
