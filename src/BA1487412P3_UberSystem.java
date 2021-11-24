import java.util.ArrayList;
import java.util.Date;

public class BA1487412P3_UberSystem {

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

        Captain[] captains = null;
        UberAdmin[] uberAdmins = null;
        Ride[] rides = null;
        RiderBonus[] riderBonuses = null;
        Payment[] payments = null;
        Rider[] riders = null;

        int riderIndexBonus = 0;
        int riderIndexPayment = 0;

        //executing the command from input.txt, which are saved in the commandList
        for (int i = -1; i < commandList.size() - 1; i++) {

            //get the current command, which should be executed
            String[] command = commandList.get(i + 1).split(" ");

            if (i == -1) {
                //arrays for the objects
                captains = new Captain[Integer.parseInt(command[0])];
                uberAdmins = new UberAdmin[Integer.parseInt(command[1])];
                rides = new Ride[Integer.parseInt(command[2])];
                riderBonuses = new RiderBonus[Integer.parseInt(command[3])];
                payments = new Payment[Integer.parseInt(command[4])];
                riders = new Rider[Integer.parseInt(command[5])];
            }

            //add the captains
            if (command.length > 0 && command[0].equals("Add_Captain")) {

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
                fileReader.addRecords("Command " + command[0] + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        captains[i].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add the uberAdmins
            if (command.length > 0 && command[0].equals("Add_UberAdmin")) {

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
                fileReader.addRecords("Command " + command[0] + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        uberAdmins[i - 10].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add rides to the rides array
            if (command.length > 0 && command[0].equals("Add_Ride")) {
                rides[i - 15] = new Ride(
                        Integer.parseInt(command[1]), //rideId
                        command[2], //rideType
                        Integer.parseInt(command[3]), //noOfSeats
                        command[4] //registrationNo
                );

                //add the rides to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        rides[i - 15].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add riderBonuses to the riderBonuses array
            if (command.length > 0 && command[0].equals("Add_RiderBonus")) {
                riderBonuses[i - 35] = new RiderBonus(
                        Integer.parseInt(command[1]), //bonusId
                        command[2], //bonusDesc
                        Double.parseDouble(command[3]) //bonusCredit
                );

                //add the riderBonuses to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        riderBonuses[i - 35].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            //add the payments to the payments array
            if (command.length > 0 && command[0].equals("Add_Payment")) {
                payments[i - 45] = new Payment(
                        Integer.parseInt(command[1]), //paymentId
                        command[2], //paymentDesc
                        Double.parseDouble(command[3]) //paymentAmount
                );

                //add the payments to the riderWrite.txt file
                fileReader.addRecords("Command " + command[0] + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        payments[i - 45].toString() + "\n" +
                        "----------------------------------------------\n");
            }

            if (command.length > 0 && command[0].equals("Add_Rider")) {
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
                fileReader.addRecords("Command " + command[0] + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        riders[i - 55].toString() + "\n\n" +
                        "----------------------------------------------\n");


            }


            //assign the captains to the riders
            if (command.length > 0 && command[0].equals("Assign_Captain_Rider")) {
                for (Captain captain : captains) {
                    if (captain.getId() == Integer.parseInt(command[1])) {
                        for (Rider rider : riders) {
                            if (rider.getId() == Integer.parseInt(command[2])) {
                                rider.setCaptain(captain);
                                fileReader.addRecords("Command " + command[0] + ": \n" +
                                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                                        "\tCaptain: " + captain.getName() + "\n" +
                                        "\tAssigned to Rider " + rider.getName() + "\n\n" +
                                        "-----------------------------------\n"
                                );
                            }
                        }
                    }
                }
            }

            //assign the rides to the riders
            if (command.length > 0 && command[0].equals("Assign_Ride_Rider")) {
                for (Ride ride : rides) {
                    if (ride.getRideID() == Integer.parseInt(command[1])) {
                        for (Rider rider : riders) {
                            if (rider.getId() == Integer.parseInt(command[2])) {
                                rider.setRide(ride);
                                fileReader.addRecords("Command " + command[0] + ":" + "\n" +
                                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                                        "\tRide: " + ride + "\n" +
                                        "\tAssigned to Rider: " + rider.getName() + "\n\n" +
                                        "-----------------------------------\n"
                                );
                            }
                        }
                    }
                }
            }

            //assign the uberAdmins to the riders
            if (command.length > 0 && command[0].equals("Assign_UberAdmin_Rider")) {
                for (UberAdmin uberAdmin : uberAdmins) {
                    if (uberAdmin.getId() == Integer.parseInt(command[1])) {
                        for (Rider rider : riders) {
                            if (rider.getId() == Integer.parseInt(command[2])) {
                                rider.setUberAdmin(uberAdmin);
                                fileReader.addRecords("Command " + command[0] + ":" + "\n" +
                                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                                        "\tUberadmin: " + uberAdmin.getName() + "\n" +
                                        "\tAssigned to Rider: " + rider.getName() + "\n\n" +
                                        "-----------------------------------\n"
                                );
                            }
                        }
                    }
                }
            }


            //assign the riderBonuses to the riders
            if (command.length > 0 && command[0].equals("Assign_RiderBonus_Rider")) {
                int x = 2;
                if (riderIndexBonus != 0) {
                    fileReader.addRecords("-----------------------------------\n" +
                            "Command " + command[0] + ":" + "\n" +
                            "Successfully Processed by the System, Following are the details:" + "\n\n" +
                            "\tRider: " + riders[riderIndexBonus].getName() + "\n");
                } else {
                    fileReader.addRecords("Command " + command[0] + ":" + "\n" +
                            "Successfully Processed by the System, Following are the details:" + "\n\n" +
                            "\tRider: " + riders[riderIndexBonus].getName() + "\n\n");
                }
                while (x < command.length) {
                    for (RiderBonus riderBonus : riderBonuses) {
                        if (riderBonus.getBonusId() == Integer.parseInt(command[x])) {
                            riders[riderIndexBonus].setRiderBonus(riderBonus, x-2);
                            fileReader.addRecords("\tRider Bonus added: \n" + riderBonus + "\n");
                        }
                    }
                    x++;
                }
                riderIndexBonus++;
            }

            //assign the payments to the riders
            if (command.length > 0 && command[0].equals("Assign_Payment_Rider")) {
                int x = 2;

                fileReader.addRecords("-----------------------------------\n" +
                        "Command " + command[0] + ":" + "\n" +
                        "Successfully Processed by the System, Following are the details:" + "\n\n" +
                        "\tRider: " + riders[riderIndexPayment].getName() + "\n\n");

                while (x < command.length) {
                    for (Payment payment : payments) {
                        if (payment.getPaymentId() == Integer.parseInt(command[x])) {
                            riders[riderIndexPayment].setPayment(payment, x-2);
                            fileReader.addRecords("\tRider Payment added: \n" + payment + "\n");
                        }
                    }
                    x++;
                }
                riderIndexPayment++;
            }

            if (command.length > 0 && command[0].equals("Print_Report")) {
                for (Rider rider : riders){
                    rider.printReport();

                }
            }

            if (command.length > 0 && command[0].equals("Quit")) {
                //closing the files to avoid damaging them
                fileReader.closeWriter();
                fileReader.closeReader();
            }

        }//complete commandList

    } //main method

}//class


