import java.util.Scanner;
public class shape_model {
    static  Scanner obj = new Scanner(System.in);

    //class for rectangle
    //can return the area and the perimeter of a rectangle
    static class rectangle{
        double height;
        double breadth;
        //method to return area
        public void area(){
            double result_area;
            result_area = height*breadth;
            System.out.println("The area of the rect is  : " +result_area);

        }
        //method to return
        public void perimeter(){
            double p_result;
            p_result = 2*height + 2*breadth;
            System.out.println("The perimeter of the rect is : "+ p_result);
        }
    }
    //class for circle object
    static class circle{
        double radius;
        int daimeter;
        double pi = 3.142;

        //method for the circumference of the circle
        public void circum(){
            double result_circum;
            result_circum = 2*pi*radius;
            System.out.println("The circumference of this circle is : " +result_circum);
        }

        //method for the area of the circle
        public void area(){
            double result_area;
            result_area = pi*radius*radius;
            System.out.println("The area of the circle is " + result_area);
        }

    }
    //main function
    public static void main(String[] args){
        int choice;
        double a, b;
        System.out.println("Enter 1 for rectangle  \n Enter  2 for circle :  ");
        choice = obj.nextInt();

        switch (choice){
            case 1 :
                int rect_choice;
                System.out.println("Enter 1 for area / 2 for perimeter : ");
                rect_choice = obj.nextInt();
                //switch case for checking decision of rectangle
                switch (rect_choice) {


                    case 1:
                        System.out.println("Enter the height of the rectangle : ");
                        a = obj.nextDouble();
                        System.out.println("Enter the breadth  of the rectangle : ");
                        b = obj.nextDouble();
                        rectangle new_rect = new rectangle();

                        new_rect.breadth = a;
                        new_rect.height = b;

                        new_rect.area();
                        break;
                    case 2:
                        System.out.println("Enter the height of the rectangle : ");
                        a = obj.nextDouble();
                        System.out.println("Enter the breadth  of the rectangle : ");
                        b = obj.nextDouble();
                        rectangle new_recta = new rectangle();
                        new_recta.breadth = a;
                        new_recta.height = b;

                        new_recta.perimeter();
                        break;
                    default:
                        System.out.println("Invalid input recieved ");

                }
            case 2:
                int circle_choice;
                System.out.println("Enter 1 for area / 2 for circumeference : ");
                circle_choice = obj.nextInt();
                switch(circle_choice){
                    case 1:
                        double r;
                        System.out.println("Enter the radius  of the circle : ");
                        r = obj.nextDouble();
                        circle new_circle = new circle();

                        new_circle.radius = r;


                         new_circle.area();
                        break;

                    case 2:
                        double e;
                        System.out.println("Enter the radius  of the circle : ");
                        e = obj.nextDouble();
                        circle new_circle_2 = new circle();

                        new_circle_2.radius = e;


                        new_circle_2.circum();
                        break;
                    default:
                        System.out.println("Not valid ");




                }
                //switch case for checking decision of rectangle

                }





     //   new_rect.


    }
}
