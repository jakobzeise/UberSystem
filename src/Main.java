import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.openFile();
        fileReader.testGet();
        fileReader.closeFile();

        Captain[] captains = new Captain[10];
        UberAdmin[] uberAdmins = new UberAdmin[5];
        Ride[] rides = new Ride[20];
        RiderBonus[] riderBonuses = new RiderBonus[10];
        Payment[] payments = new Payment[10];
        Rider[] riders = new Rider[25];

        int i = -1;
        int index = 0;
        for (String s : fileReader.commandList) {
            if (i >= 0 && i < 10) {
                String[] command = fileReader.commandList.get(i + 1).split(" ");

                captains[i] = new Captain(
                        Integer.parseInt(command[1]), //drivingLicenseNo
                        Integer.parseInt(command[2]), //totalRides
                        Double.parseDouble(command[3]), //rating
                        Integer.parseInt(command[4]), //empId
                        command[5], //empDesc
                        Boolean.parseBoolean(command[6]), //onLeave
                        Integer.parseInt(command[7]), //id
                        command[8], //name
                        command[9], //email
                        new Date(Integer.parseInt(command[10]), Integer.parseInt(command[11]), Integer.parseInt(command[12])), //dateOfBirth
                        command[13].charAt(0), //gender
                        Integer.parseInt(command[14]), //phone
                        command[15] //address

                );

            }

            if (i >= 10 && i < 15) {
                String[] command = fileReader.commandList.get(i + 1).split(" ");
                uberAdmins[index++] = new UberAdmin(
                        command[1], //department
                        Integer.parseInt(command[2]), //empId
                        command[3], //empDesc
                        Boolean.parseBoolean(command[4]), //onLeave
                        Integer.parseInt(command[5]), //id
                        command[6], //name
                        command[7], //email
                        new Date(Integer.parseInt(command[8]), Integer.parseInt(command[9]), Integer.parseInt(command[10])), //dateOfBirth
                        command[11].charAt(0), //gender
                        Integer.parseInt(command[12]), //phone
                        command[13] //address
                );
            }


            i++;
        }
        System.out.println(uberAdmins[0].name);

    }
}

