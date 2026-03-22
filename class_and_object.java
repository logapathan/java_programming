class car{
    String color;
    int price;
    String model;

    void start(){
        System.out.println("car is starting");
    }
}

public class class_and_object {
    
    public static void main(String[] args) {
        car c1 = new car();
        c1.color = "red";
        c1.price = 1000000;
        c1.model = "BMW";
        System.out.println("color of the car is: " + c1.color);
        System.out.println("price of the car is: " + c1.price);
        System.out.println("model of the car is: " + c1.model);
        c1.start();

    }
}
