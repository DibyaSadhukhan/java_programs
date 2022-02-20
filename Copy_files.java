import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileOutputStream; 
import java.io.IOException; 
public class Copy_files  { 
    public static void main(String[] args){ 
        FileInputStream instream = null; 
        FileOutputStream outstream = null; 
        try{ 
            File infile =new File(".\\Data\\one.txt");  
            File outfile =new File(".\\Data\\two.txt"); 
            instream = new FileInputStream(infile);  outstream = new FileOutputStream(outfile); 
            byte[] buffer = new byte[512]; 
            int length;
            while ((length = instream.read(buffer)) > 0){  
                outstream.write(buffer, 0, length);  
            }  
            outstream.close(); 
            System.out.println("File copied successfully!!");  
        }catch(IOException ioe){
            ioe.printStackTrace(); 
        } 
    } 
} 
