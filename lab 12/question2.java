// 4. Write a program in java to compare two files and check the content in both files
// are equal or not. Display a message accordingly. 

import java.io.*;

public class question2{
    public static void main(String[] args){
        File file = new File("bio.txt");
        File file2 = new File("bio1.txt");
        // using FileInputStream

        try{       
        FileInputStream fin = new FileInputStream(file);
        FileInputStream fin1 = new FileInputStream(file2);
        int i=0;
        int j=0;
        while((i = fin.read()) != -1 && (j = fin1.read()) != -1){
            if(i != j){
                System.out.println("Files are not equal");
                break;
            }
        }
            j = fin1.read();

        if(i == -1 && j == -1){
            System.out.println("Files are equal");
        }
        fin.close();
        fin1.close();
        System.out.println("Check");
 
    }catch(IOException e){
        System.out.println(e);
    }
    }
}

