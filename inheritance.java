class A {
    void display() {
        System.out.println("This is class A");
    }
}

class B extends A{
    void output(){
        System.out.println("This is of class B");
    }
}


public class inheritance {
    public static void main(String[] args) {
        B b1 = new B();
        b1.display();
        b1.output();
    }
}
