import java.io.File;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class FileReader {

    private Scanner reader;
    private Formatter writer;

    //initialises a formatter to write into riderWrite.txt
    public void openWriter() {
        try {
            writer = new Formatter("RiderWrite.txt");
        } catch (Exception e) {
            System.out.println("Error in FileReader");
        }
    }

    //method to add text to the RiderWrite.txt file
    public void addRecords(String text) {
        writer.format("%s", text);
    }

    //closes the formatter to avoid damaging the riderWrite.txt file
    public void closeWriter() {
        writer.close();
    }

    //initialises a scanner to get the commands from the input.txt file
    public void openReader() {
        try {
            reader = new Scanner(new File("input.txt"));
        } catch (Exception e) {
            System.out.println("File input.txt was not found");
        }
    }

    //returns an ArrayList with all the commands from input.txt
    public ArrayList<String> getCommandListFromInputFile() {
        ArrayList<String> commandList = new ArrayList<>();
        while (reader.hasNextLine()) {
            commandList.add(reader.nextLine());
        }
        return commandList;
    }

    //closes the scanner to avoid damaging the input.txt file
    public void closeReader() {
        reader.close();
    }

}
