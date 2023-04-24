// 3. Write a program in java to search all the special characters (like @,#,&,etc) from a file and then
// copy them to another file. Display the new file which contains only special characters.

import java.util.*;
import java.io.*;


public class question3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileOutputStream fout = new FileOutputStream("bio.txt");
            String s = "Name: H@ri &om K%mar\n#ge: 20\nAddress: Birgunj";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
     System.out.println("Enter the file name to copy special characters: ");
        String filename2 = sc.nextLine();
        try {
            Scanner sc2 = new Scanner(new File("bio.txt"));
            PrintWriter pw = new PrintWriter(new File(filename2));
            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == '@' || c == '#' || c == '&' || c == '$' || c == '%' || c == '^' || c == '*') {
                        pw.print(c);
                    }
                }
            }
            pw.close();
            sc2.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}