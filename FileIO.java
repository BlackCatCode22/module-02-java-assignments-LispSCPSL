// TD 09/05/2024


import java.io.*;
import java.nio.Buffer;

public class FileIO {
    public static void main(String[] args) {

      try {
          BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
          writer.write("\nWriting to a file.");
          writer.write("\nFrom, Tyler Dupree");
          writer.close();
      } catch (IOException e) {
          e.printStackTrace();
      }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}