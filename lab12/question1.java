// Write a program in java write and read your biodata in a file in byte form and
// character form using FileInputStream, FileOutputStream, FileReader and FileWriter
// classes.

import java.io.*;
import java.io.IOException;

public class question1 {
    public static void main(String[] args) {
        String biodata = "Name: Hariom\nAge: 20\n\nCity: New York";
        String filename = "bio1.txt";

        // Writing biodata to file in byte form using FileOutputStream
        try  {
            FileOutputStream fos = new FileOutputStream(filename);
            // Converting biodata string to byte array
            byte[] byteData = biodata.getBytes();
            fos.write(byteData);
            System.out.println("Biodata written to file in byte form successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Reading biodata from file in byte form using FileInputStream
        try (FileInputStream fis = new FileInputStream(filename)) {
            int fileSize = fis.available();
            byte[] byteData = new byte[fileSize];
            fis.read(byteData);
            String byteBiodata = new String(byteData);
            System.out.println("Biodata read from file in byte form:\n" + byteBiodata);
        } catch (IOException e) {
            System.out.println(e);
        }

        // Writing biodata to file in character form using FileWriter
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(biodata);
            System.out.println("Biodata written to file in character form successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }

        // Reading biodata from file in character form using FileReader
        try (FileReader fr = new FileReader(filename)) {
            int fileSize = (int) new File(filename).length();
            char[] charData = new char[fileSize];
            fr.read(charData);
            String charBiodata = new String(charData);
            System.out.println("Biodata read from file in character form:\n" + charBiodata);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}





