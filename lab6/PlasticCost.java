import java.util.Scanner;

class Two_D {
    private double length;
    private double breadth;

    Two_D(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

class Three_D extends Two_D {
    private double height;

    Three_D(double l, double b, double h) {
        super(l, b);
        height = h;
    }

    double volume() {
        return super.area() * height;
    }

    double cost() {
        return volume() * 60;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dimensions of the plastic sheet (length and breadth): ");
        double l = input.nextDouble();
        double b = input.nextDouble();
        Two_D sheet = new Two_D(l, b);
        double sheetArea = sheet.area();
        double sheetCost = sheetArea * 40;
        System.out.println("The cost of the plastic sheet is Rs. " + sheetCost);

        System.out.print("Enter the dimensions of the plastic box (length, breadth, and height): ");
        l = input.nextDouble();
        b = input.nextDouble();
        double h = input.nextDouble();
        Three_D box = new Three_D(l, b, h);
        double boxVolume = box.volume();
        double boxCost = box.cost();
        System.out.println("The cost of the plastic box is Rs. " + boxCost);
    }
}
