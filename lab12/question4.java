// 6. Write a program in java to count number of words, characters and sentences from a
// file and display the count.

import java.io.*;
import java.util.*;

public class question4{
    public static void main(String[] args) {
        try{
            File file = new File("bio1.txt");
            FileReader fr = new FileReader(file);
            int i;
            int words = 0;
            int characters = 0;
            int sentences = 0;
            while((i = fr.read()) != -1){
                if((char)i == ' '){
                    words++;
                }
                else if((char)i == '.'){
                    sentences++;
                }
                else{
                    characters++;
                }
            }
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + characters);
            System.out.println("Number of sentences: " + sentences);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}