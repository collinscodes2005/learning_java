//...................inheritance.........................//

public class inheritance {

    //if you want anything to belong to class, make it static
    //class is a set of rules
    //that determines what an object would have
    //assignment
    //object-oriented design that model shapes
    static class Product{
        //Attributes(State)
        int pid;
        String name;
        int price;

        //Constructor
        Product() {
            System.out.println(">>Product object constructed ");
        }

        void setProductDetails(int pid, String name, int price) {
            this.pid = pid;
            this.name = name;
            this.price = price;
        }


        void showProductDetails() {
            System.out.println("This is product id " + pid);
            System.out.println("Name :\t" + name);
            System.out.println("Price :\t" + price);

        }
    }

    public static void main(String args[]){
        Product new_product = new Product();
        Product new_product_2 = new Product();
        System.out.println("product id : " + new_product);

        new_product.setProductDetails(001, "Iphone X", 150000);
        new_product_2.setProductDetails(002, "Iphone 13", 450000);


        new_product.showProductDetails();
        new_product_2.showProductDetails();

    }

}