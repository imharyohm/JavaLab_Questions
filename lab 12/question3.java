// 5. Write a program in java to read a sentence from a file and convert the lower case
// letters to uppercase and vice-versa and also convert the vowels into ‘@’ symbol and
// write to same file. 
import java.io.*;

public class question3{
    public static void main(String[] args) {
        try{
            File file = new File("bio.txt");
            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file);
            int i;
            
            while((i = fr.read()) != -1){
                if(Character.isLowerCase((char)i)){
                    fw.write(Character.toUpperCase((char)i));
                }
                else if(Character.isUpperCase((char)i)){
                    fw.write(Character.toLowerCase((char)i));
                }
                else if((char)i == 'a' || (char)i == 'e' || (char)i == 'i' || (char)i == 'o' || (char)i == 'u'){
                    fw.write('@');
                }
                else{
                    fw.write(i);
                }
            }
            
            
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
 
