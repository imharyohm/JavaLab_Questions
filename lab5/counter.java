public class counter {
    static int count=0;
    counter(){
        count++;
    }
    public static void main(String args[]){
        counter c1= new counter();
        counter c2 = new counter();
        System.out.println("No. of object is:"+count);
    }
}
