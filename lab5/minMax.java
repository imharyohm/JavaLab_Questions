import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int value;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of martix");
    value = sc.nextInt();
    int arr[] = new int[value];
    System.out.println("Enter the element of martix");
    for(int i=0;i<value;i++){
        arr[i]=sc.nextInt();
    }
    int max= arr[0];
    int min=arr[0];
    for(int i=0;i<value;i++){
        for(int j=i+1;j<value;j++){
            if(max<arr[j])
            max=arr[j];
            if(min>arr[j])
            min=arr[j];
        }
    }

    System.out.println("The maximium value is:"+max);
    System.out.println("The minimium value is:"+min);
    }
    
}
