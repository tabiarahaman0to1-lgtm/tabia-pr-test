public class Main {
   public static double divide(double a, double b) {
    if (b == 0) {
        System.out.println("Cannot divide by zero");
    }
    return a / b;
}
    }

    public static void main(String[] args) {
        double result = divide(10, 2);
        System.out.println("So the result of 10/2 is : "+result);
    }
}
