import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileReader;

public class BufferedReaderDemo {
   public static void main(String[] args) throws Exception {
      
      String thisLine = null;
      try{
         // open input stream test.txt for reading purpose.
         String path = "./tmp";
         FileReader fileReader = new FileReader(path);
         BufferedReader bufferedReader = new BufferedReader(fileReader);
         while ((thisLine = bufferedReader.readLine()) != null) {
            System.out.println(thisLine);
         }       
      }catch(Exception e){
         e.printStackTrace();
      }
   }
}