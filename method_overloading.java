class calculator{
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public double sum(double a, double b){
        return a+b;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(2, 3));
        System.out.println(cal.sum(2, 3, 4));
        System.out.println(cal.sum(2.5, 3.5));
    }
}
