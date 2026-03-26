class Human{
    int age;
    String name;
}


public class instance_variables {
    

    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();
        obj1.age = 25;
        obj1.name = "John";
        obj2.age = 30;
        obj2.name = "Jane";
        System.out.println("Object 1: Name = " + obj1.name + ", Age = " + obj1.age);
        System.out.println("Object 2: Name = " + obj2.name + ", Age = " + obj2.age);
    }
}
