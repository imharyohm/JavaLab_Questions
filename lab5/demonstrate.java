//6. WAP in java to demonstrate the following:
//a. static block b. final variable c. final function d. final class

// a. Static Block
// public class random {
//     static{
//         System.out.println("This is static block.");
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }

// b. Final variable
// public class demonstrate{
//     final int a = 100;
//     void run(){
//         a = 200;
//     }
//     public static void main(String args[]){
//         demonstrate obj = new demonstrate();
//         obj.run();
//     }
// }

// c. Final Function
// public class demonstrate{
//     final void run(){
//         System.out.println("parent class run");
//     }
// }
// class child extends demonstrate{
//     void run(){
//         System.out.println("child class run");
//     }
//     public static void main(String[] args){
//         child obj = new child();
//         obj.run();
//     }
// }

// d. Final Class
public final class demonstrate{}
class child extends demonstrate{
    void run(){
        System.out.println("running");
    }
    public static void main(String[] args){
        child obj= new child();
        obj.run();
    }
}