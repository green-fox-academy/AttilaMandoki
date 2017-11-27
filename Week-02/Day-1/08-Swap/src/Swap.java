public class Swap {
    public static void main(String[] args) {

        // Swap the values of the variables
        int a = 123;
        int b = 526;

        // I just copied but I don't get it

        System.out.println("Before swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap:");
        System.out.println("a value: "+a);
        System.out.println("b value: "+b);
    }
}