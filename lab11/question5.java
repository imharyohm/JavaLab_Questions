// 1. WAP in java to work on following functions on strings “welcome to Java
// Programming” ,, “hello world” “hello” “good morning” A. concat(), isempty(),split(), trim(), uppercase(), lowercase(),replace(),intern(),


public class question5 {
    public static void main(String[] args) {
        String s1 = "welcome to Java Programming";
        String s2 = "hello world";
        String s3 = "hello";
        String s4 = new String("good morning");

        System.out.println(s1.concat(s2));
        System.out.println(s1.isEmpty());
        for(String w:s1.split("\\s",0)){
        System.out.println(w);
        }
        System.out.println(s1.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.replace("Java", "Python"));
        System.out.println(s4.intern());



    }
}
