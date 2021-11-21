import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    ArrayList<String> commandList;
    private Scanner scanner;

    public void openFile() {
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (Exception e) {
            System.out.println("File input.txt was not found");
        }
    }

    public void getInputFromFile() {
        getCaptains();
    }

    public void getCaptains() {
        int i = 0;
        while (i < 5) {
            String method = scanner.next();
            int drivingLicenseNo = scanner.nextInt();
            int totalRides = scanner.nextInt();
            double rating = scanner.nextDouble();
            int empId = scanner.nextInt();
            String empDesc = scanner.next();

            i++;
        }
    }

    public void testGet() {
        commandList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            commandList.add(scanner.nextLine());
        }
    }

    public void closeFile() {
        scanner.close();
    }

    public ArrayList<String> getCommandList() {
        return commandList;
    }

    public void setCommandList(ArrayList<String> commandList) {
        this.commandList = commandList;
    }
}
