//4. Define an interface Motor with a data member – capacity and two methods such as run() and consume(). Define a Java class, Washing machine which implements this interface and implement the code to check the value of the interface data member and functions with any message in them through an object of the class.

interface motor{
    static final int capacity = 100;
    void run();
    void consume();
}

class washingMachine implements motor{
    public void run(){
        System.out.println("This is run method.");
    }

    public void consume(){
        System.out.println("This is consume method.");
    }
}

public class motorAbstract{
    public static void main(String[] args) {
        washingMachine obj = new washingMachine();
        obj.run();
        obj.consume();
    }
}