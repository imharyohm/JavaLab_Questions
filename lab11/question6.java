// 2. WAP in java to work on following functions on string “welcome to Java
// Programming” ,, “hello world” “hello” “good morning” using stringBuffer class
// A. append(),insert(), replace(),delete(),reverse(), capacity(), ensureCapacity(),charat()
public class question6 {

    public static void main(String[] args) {
        
        StringBuffer s1 = new StringBuffer("welcome to Java Programming");
        StringBuffer s2 = new StringBuffer("hello world");
        StringBuffer s3 = new StringBuffer("hello");
        StringBuffer s4 = new StringBuffer("good morning");
        System.out.println(s1.append(s2));
        System.out.println(s1.insert(0, "jai shree ram"));
        System.out.println(s1.replace(4, 11, "jai shree krishna"));
        System.out.println(s1.delete(0, 11));
        System.out.println(s1.reverse());
        System.out.println(s1.capacity());
        s1.ensureCapacity(10);
        System.out.println(s1.capacity());
        System.out.println(s1.charAt(0));


    }
    
}
