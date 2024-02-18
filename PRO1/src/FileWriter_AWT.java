
import java.io.FileWriter;
import java.io.IOException;
    public class FileWriter_AWT {
        public static void main(String[] args)
        {
            try {
                FileWriter fw = new FileWriter("G:\\basic project\\writeDoc.txt");
                fw.write(" Welcome to java Programming");
                fw.close();
                // Print and display message
                System.out.println("\nFile write done");
            }
            catch (IOException e) {
                System.out.println("There are some IOException");
            }
        }
    }


