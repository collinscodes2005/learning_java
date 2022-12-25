public class inheriting_props {
    public static class Parent{
        //attributes of the object
        private String name;
        private int age;
        private int id;
        //constructor
         Parent(String name, int age, int id) {
            //instatiating the variable inside the constructor
            this.name = name;
            this.age = age;
            this.id = id;
        }
        //creatiing a getter
        public String getName(){ return name; }
        //creating a setter
        public void setName(String name_set){
            name = name_set;
        }
        //parent cooking
        public void cook(){
             System.out.println(name + " is cooking ");
        }
    }
    //creating a sub class


    //inheritanceee

   static class uncle extends Parent {
        public static String whos_side;
        uncle(String whos_side, String name, int age, int id) {
            super(name, age, id);

        }
        //setting the characteristics of the subclass
        public void setwhos(String side){
            whos_side = side;
        }
        public String getwhos(){return whos_side;}

    }
    public static void main(String[] args){
        Parent adeyemi = new Parent("Aladesuyi", 25, 001);
        uncle yemi = new uncle("mums", "yemi", 12, 004 );
        System.out.println(adeyemi.getName());
       adeyemi.cook();

       yemi.setwhos("Mothers");

       yemi.cook();
       System.out.println(yemi.getName() +  " is from the " + yemi.getwhos() + "side");
    }
}
