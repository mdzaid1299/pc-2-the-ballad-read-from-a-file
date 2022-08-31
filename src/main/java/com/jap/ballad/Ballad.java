   package com.jap.ballad;

import java.io.*;

   public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        String res = "";
        String data = "";
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((data = bufferedReader.readLine()) != null) {

                res = res.concat("\n") + data;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }

       public static void main(String[] args) {
           Ballad obj = new Ballad();
           System.out.println(obj.readPoemFromAFile("src/main/resources/ballad.txt"));
       }

}
