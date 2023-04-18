
package bytestreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab2 {
    public static void main(String[] args) {
        try {
            FileOutputStream output=new FileOutputStream("data.dat");
            String s="Hello world!?";
            byte[]b=s.getBytes();
            output.write(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            FileInputStream input =new FileInputStream("data.dat");
            int value;
            while((value=input.read())!=-1){
                System.out.print((char)value);
            }
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
