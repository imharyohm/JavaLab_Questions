// Write a program in java write and read your biodata in a file in byte form and
// character form using FileInputStream, FileOutputStream, FileReader and FileWriter
// classes.

import java.io.*;
public class question1{
    public static void main(String[] args) throws IOException{
        // using FileOutputStream  with byte array
        String str = "Name: Hariom\nRoll No: 21053282\nBranch: CSE\n";
        FileOutputStream fout = new FileOutputStream("bio.txt");
        fout.write(str.getBytes());
        fout.close();

        // using FileInputStream
        FileInputStream fin = new FileInputStream("bio.txt");
        int i;
        while((i = fin.read()) != -1){
            System.out.print((char)i);
        }
        fin.close();
    
        //using FileWriter with String
        FileWriter fw = new FileWriter("bio1.txt");
        fw.write(str);
        fw.close();

        //using FileReader
        FileReader fr = new FileReader("bio1.txt");
        int j;
        while((j = fr.read()) != -1){
            System.out.print((char)j);
        }
        fr.close();
    }

}