/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automatic.washing.machine;

import java.util.Scanner;

/**
 *
 * @author dania
 */
public class AutomaticWashingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Scanner getinput = new Scanner(System.in);
        System.out.println("Power on the Start !!");
        System.out.print("Please type 'on' to power on the machine or 'off' to power off:");
        String on = getinput.nextLine();
        if(on.equals("on")){
            System.out.println("Initializing !! ");
            Thread.sleep(3000);
            System.out.println("Welcome to Automatic Washing Machine !");
            System.out.println("Working !! ");
            Thread.sleep(2000);
            
            System.out.println("Choose the Washing Process ");
            System.out.println("1. COMMON");
            System.out.println("2. HEAVY");
            System.out.println("3. SOFT");
            System.out.println("4. QUICK");
            System.out.println("5. STANDARD");
            System.out.println("6. JEANS");
            System.out.println("7. SILK");
            System.out.println("8. CHILDISH");
            System.out.println("9. CLEAN TUB");
            System.out.println("10. AIR-DRY");

            // Get the user's choice
            System.out.print("Enter the number corresponding to your choice: ");
            int processChoice = getinput.nextInt();
            System.out.println("Working !! ");
            Thread.sleep(2000);
            switch(processChoice){
                case 1:
                    System.out.println("You have selected Common process !!");
                    break;
                case 2:
                    System.out.println("You have selected Heavy process !!");
                    break;
                case 3:
                    System.out.println("You have selected Soft process !!");
                    break;
                case 4:
                    System.out.println("You have selected Quick process !!");
                    break;
                case 5:
                    System.out.println("You have selected Standard process !!");
                    break;
                case 6:
                    System.out.println("You have selected Jeans process !!");
                    break;
                case 7:
                    System.out.println("You have selected Silk process !!");
                    break;
                case 8:
                    System.out.println("You have selected Childish process !!");
                    break;
                case 9:
                    System.out.println("You have selected Clean Tube process !!");
                    break;
                case 10:
                    System.out.println("You have selected Air-Dry process !!");
                    break;
        }
            Thread.sleep(2000);
            System.out.print("Enter the number corresponding to your choice: ");
            System.out.println("Working !! ");
            System.out.println("1. SOAK");
            System.out.println("2. WASH");
            System.out.println("3. RINSE");
            System.out.println("4. SPIN");
            int WashingProcess = getinput.nextInt();
            Thread.sleep(2000);
            switch(WashingProcess){
                case 1:
                    System.out.println("You have selected Soak !!");
                    break;
                case 2:
                    System.out.println("You have selected Wash !!");
                    break;
                case 3:
                    System.out.println("You have selected Rinse !!");
                    break;
                case 4:
                    System.out.println("You have selected Spin !!");
                    break;
        }
                Thread.sleep(2000);
                if(processChoice == 1 || processChoice == 2){
                System.out.println("Press Washing Mode: ");
                System.out.println("1. Stand-Wash");
                System.out.println("2. Soft-Wash");
                System.out.println("3. Care-Wash");
                System.out.print("Enter the number corresponding to your choice: ");
                int washMode = getinput.nextInt();
                
                switch (washMode) {
                case 1:
                    System.out.println("Wash Mode: STAND-WASH");
                    break;
                case 2:
                    System.out.println("Wash Mode: SOFT-WASH");
                    break;
                case 3:
                    System.out.println("Wash Mode: Care-WASH");
                    break;
                default:
                    System.out.println("Invalid wash mode.");
            }
                
                System.out.print("Do You want to enable Child-Lock? (y/n)");
                String Childlock = getinput.next();
                if(Childlock.equals("y")){
                    System.out.println("You have Enabled Child-Lock !!");
                    System.out.println("Washing !!");
                Thread.sleep(15000);
                
                System.out.println("Process complete. Powering off automatically.");
                getinput.close();
                }
                else{
                        System.out.println("Child-Lock in not Enabled !!");
                        System.out.println("Washing !!");
                        System.out.println("You can Stop the process as you have not Enabled Child-Lock");
                boolean processRunning = true;
                    
                    while (processRunning) {
                        System.out.print("Enter 'stop' to pause or 'continue' to proceed: ");
                        String userChoice = getinput.next();
                        
                        if (userChoice.equalsIgnoreCase("stop")) {
                            System.out.println("Process stopped. Waiting for further instructions...");
                            
                            // Waiting until user decides to continue
                            while (true) {
                                System.out.print("Enter 'continue' to resume the process: ");
                                userChoice = getinput.next();
                                
                                if (userChoice.equalsIgnoreCase("continue")) {
                                    System.out.println("Resuming the process...");
                                    break;
                                }
                            }
                        } else if (userChoice.equalsIgnoreCase("continue")) {
                            System.out.println("Washing process continuing...");
                            Thread.sleep(15000); // Simulate the washing process
                            processRunning = false; // Exit the loop when washing completes
                        } else {
                            System.out.println("Invalid input. Please enter 'stop' or 'continue'.");
                        }
                    }
                    
                    System.out.println("Process complete. Powering off automatically.");
                    getinput.close();
                        }
                
                }

            
        }
        else if(on.equalsIgnoreCase("off")) {
            System.out.println("Machine is Powered OFF !!");
        } 
        else {
            System.out.println("Invalid input. Please type 'on' or 'off'.");
        }
    }
    
}
