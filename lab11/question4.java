//5. WAP in java to work on following functions in string “welcome to Java
// Programming” A.equals, ==, compareto, equalsIgnoreCase, length


public class question4 {
    public static void main(String[] args) {
        String s1 = "welcome to Java Programming";
        String s3 = "jai shree ram";
        String s2 = new String("welcome to Java Programming");
        String s4 = new String("jai shree Krishna");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1==s3);
        System.out.println(s1.compareTo(s3));
    }

}
