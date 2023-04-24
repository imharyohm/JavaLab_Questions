// 5. Write a program in java to illustrate in what situations will compile time error will
// occur in Method Overriding.

class A {
    protected int add(int a, int b) {
        return a + b;
    }
}
 class B extends A {
    // Example 1: Signature mismatch
    // This will cause a compile time error
    // public void add(int a, int b, int c) {
    //     System.out.println(a + b + c);
    // }

    // Example 2: Access level more restrictive
    // This will cause a compile time error
    // private int add(int a, int b) {
    //     return a + b;
    // }

    // Example 3: Return type not a subtype
    // This will cause a compile time error
    // public float add(int a, int b) {
    //     return a + b;
    // }

    // This is a valid override
    private int add(int a, int b) {
        return a + b + 10;
    }
 }
// 1. If the method in the subclass has a different return type than the method in the superclass.
        // 2. If the method in the subclass has a different access modifier than the method in the superclass.
        // 3. If the method in the subclass throws a checked exception that is not thrown by the method in the superclass.
        // 4. If the method in the subclass throws a different exception than the method in the superclass.
        // 5. If the method in the subclass overrides a method in the superclass and the method in the subclass has a different signature than the method in the superclass.
        // These are some more situations where compile time error will occur in Method Overriding.
public class question3 {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.add(2, 3));
    }
}
