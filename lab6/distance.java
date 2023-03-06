public class distance {

    private int feet;
    private int inches;

    // Constructor to initialize feet and inches
    public distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    // Method to add two distances
    public distance add(distance other) {
        int totalInches = this.inches + other.inches;
        int carry = totalInches / 12;
        int remainingInches = totalInches % 12;
        int totalFeet = this.feet + other.feet + carry;
        return new distance(totalFeet, remainingInches);
    }

    // Method to subtract two distances
    public distance subtract(distance other) {
        int thisTotalInches = this.feet * 12 + this.inches;
        int otherTotalInches = other.feet * 12 + other.inches;
        int remainingInches = Math.abs(thisTotalInches - otherTotalInches);
        int totalFeet = remainingInches / 12;
        remainingInches = remainingInches % 12;
        return new distance(totalFeet, remainingInches);
    }

    // Method to display distance in feet and inches
    public void display() {
        System.out.println(this.feet + " feet " + this.inches + " inches");
    }

    public static void main(String[] args) {
        distance d1 = new distance(3, 10);
        distance d2 = new distance(2, 6);

        distance d3 = d1.add(d2);
        System.out.print("Sum of distances: ");
        d3.display();

        distance d4 = d1.subtract(d2);
        System.out.print("Difference of distances: ");
        d4.display();
    }
}
