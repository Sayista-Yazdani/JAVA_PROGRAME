import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalysis {
    public static void main(String[] args) {
        String filePath = "G:\\MY_EDU_DOC\\Notepad Notes\\web idea.txt"; // Replace with the actual file path

        try {
            // Open the file
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;

            // Read each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                // Split the line into words and count them
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            // Close the file
            bufferedReader.close();

            // Display the results
            System.out.println("Number of characters: " + charCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
