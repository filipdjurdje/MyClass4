public class MyClass2 {

    public static void main(String[] args) {
        MyClass3 v1 = new MyClass3(); // Using default color "Blue"
        MyClass3 v2 = new MyClass3("Red"); // Setting color to "Red"
        
        System.out.println("Vehicle color: " + v1); // Prints "Vehicle color: Blue"
        System.out.println("Vehicle color: " + v2); // Prints "Vehicle color: Red"
    }
}
