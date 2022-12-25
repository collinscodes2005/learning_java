import java.util.Scanner;
public class encapsulation_intro {
    static public class Person{
        int id;
        String name;
        int level;
        Person(){
            System.out.println("object constructed");
        }

        void setPersonDetails(int id, String name, int level){
            this.id = id;
            this.name = name;
            this.level = level;
        }
        void showPersonDetails(){
            System.out.println("This is id. " +id +" and name " + name);
        }

    }
    static public class Person_again{
        private String name; //private = restricted access
//        Person_again(){
//
//        }
        //Getter
        public String getName(){
            return name;
        }

        public void setName(String newName){
            this.name = newName;

        }

    }
    public static void main(String[] args){
        Person_again person_obj = new Person_again();


    }
}
