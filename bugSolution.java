public class MyClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int z = 0; 
        try {
            z = x / y; 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
            // Handle the exception appropriately, e.g., provide a default value or take alternative action
            z = Integer.MAX_VALUE; // Or any other appropriate default value
        }
        System.out.println(z);
    }
}