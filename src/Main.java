import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //fileReader to work with the input and report files
        FileReader fileReader = new FileReader();

        //creates reader and writer
        fileReader.openReader();
        fileReader.openWriter();

        //creates a list with all command from input.txt
        ArrayList<String> commandList = fileReader.getCommandListFromInputFile();

        //adds the heading to the rideWrite.txt file
        fileReader.addRecords("------------------ Welcome to Uber ------------------\n\n");

        //arrays for the objects
        Captain[] captains = new Captain[10];
        UberAdmin[] uberAdmins = new UberAdmin[5];
        Ride[] rides = new Ride[20];
        RiderBonus[] riderBonuses = new RiderBonus[10];
        Payment[] payments = new Payment[10];
        Rider[] riders = new Rider[25];

        //executing the command from input.txt, which are saved in the commandList
        for (int i = -1; i < commandList.size() - 1; i++) {

            //get the current command, which should be executed
            String[] command = commandList.get(i + 1).split(" ");

            //command 1 - 10 to add the captains
            if (i >= 0 && i < 10) {

                //add the captain to the captains array
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
                        new Date(
                                Integer.parseInt(command[10]), //year
                                Integer.parseInt(command[11]), //month
                                Integer.parseInt(command[12])), //day
                        command[13].charAt(0), //gender
                        Integer.parseInt(command[14]), //phone
                        command[15] //address

                );

                //add the captains to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] +
                        ": Add a new captain record in the System\n\n" +
                        captains[i].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //command 11 - 15 to add the uberAdmins
            if (i >= 10 && i < 15) {

                //add the uberAdmin to the uberAdmin array
                uberAdmins[i - 10] = new UberAdmin(
                        command[1], //department
                        Integer.parseInt(command[2]), //empId
                        command[3], //empDesc
                        Boolean.parseBoolean(command[4]), //onLeave
                        Integer.parseInt(command[5]), //id
                        command[6], //name
                        command[7], //email
                        new Date(
                                Integer.parseInt(command[8]), //year
                                Integer.parseInt(command[9]), //month
                                Integer.parseInt(command[10])), //day
                        command[11].charAt(0), //gender
                        Integer.parseInt(command[12]), //phone
                        command[13] //address
                );

                //add the uberAdmins to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] +
                        ": Add a new uberAdmin record in the System\n\n" +
                        uberAdmins[i - 10].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add rides to the rides array
            if (i >= 15 && i < 35) {
                rides[i - 15] = new Ride(
                        Integer.parseInt(command[1]),
                        command[2],
                        Integer.parseInt(command[3]),
                        command[4]
                );

                //add the rides to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] +
                        ": Add a new ride record in the System\n" +
                        "Ride Details are as follows:\n\n" +
                        rides[i - 15].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add riderBonuses to the riderBonuses array
            if (i >= 35 && i < 45) {
                riderBonuses[i - 35] = new RiderBonus(
                        Integer.parseInt(command[1]),
                        command[2],
                        Double.parseDouble(command[3])
                );

                //add the riderBonuses to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] +
                        ": Add a new riderBonus record in the System\n\n" +
                        riderBonuses[i - 35].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add the payments to the payments array
            if (i >= 45 && i < 55) {
                payments[i - 45] = new Payment(
                        Integer.parseInt(command[1]),
                        command[2],
                        Double.parseDouble(command[3])
                );

                //add the payments to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] +
                        ": Add a new payments record in the System\n\n" +
                        payments[i - 45].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            if (i >= 55 && i < 80) {
                riders[i - 55] = new Rider(
                        Double.parseDouble(command[1]), //walletBalance
                        command[2], //pickUpForm
                        command[3], //dropTo
                        Double.parseDouble(command[4]), //distance
                        new Date( //joinDate
                                Integer.parseInt(command[5]), //year
                                Integer.parseInt(command[6]), //month
                                Integer.parseInt(command[7])), //day
                        Double.parseDouble(command[8]), //rating
                        Integer.parseInt(command[9]), //id
                        command[10], //name
                        command[11], // email
                        new Date( //dateOfBirth
                                Integer.parseInt(command[12]), //year
                                Integer.parseInt(command[13]), //month
                                Integer.parseInt(command[14])), //day
                        command[15].charAt(0), //gender
                        Integer.parseInt(command[16]), //phone
                        command[17] //address

                );

                //add the riders to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] +
                        ": Add a new riders record in the System\n\n" +
                        riders[i - 55].toString() + "\n" +
                        "----------------------------------------------\n");


            }


            //assign the captains to the riders
            if (i >= 80 && i < 105) {
                for (Captain captain : captains) {
                    if (captain.getId() == Integer.parseInt(command[1])) {
                        for (Rider rider : riders) {
                            if (rider.getId() == Integer.parseInt(command[2])) {
                                rider.setCaptain(captain);
                                fileReader.addRecords("Command " + command[0] +
                                        ": Successfully Processed by the System, Following are the details:" + "\n" +
                                                "\tRider: " + rider.getName() + "\n" +
                                                "\tAssigned to Captain " + captain.getName() + "\n" +
                                                "-----------------------------------\n"
                                );
                            }
                        }
                    }
                }
            }
        }

        //closing the files to avoid damaging them
        fileReader.closeWriter();
        fileReader.closeReader();
    }
}

