// Cesar Pimentel

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("What kind of device would you like to purchase?: \n1)Tablet\n2)Laptop");
        int answer = input.nextInt();



        if (answer == 1){
            System.out.println("Write your desired cpuClockSpeed");
            double speed = input.nextDouble();

            System.out.println("Write your desired ram");
            int ram = input.nextInt();

            System.out.println("Write your desired storage");
            int storage = input.nextInt();

            System.out.println("Pick a screen size: \n8\n10\n13");
            int screenSize = input.nextInt();

            Tablet userTablet = new Tablet(speed, ram, storage, screenSize);
        }

        else if (answer == 2){
            System.out.println("Write your desired cpuClockSpeed");
            double speed = input.nextDouble();

            System.out.println("Write your desired ram");
            int ram = input.nextInt();

            System.out.println("Write your desired storage");
            int storage = input.nextInt();

            System.out.println("Would you like to add a dvd Drive?:\n1)Yes\n2)No");
            int drive = input.nextInt();

            boolean driveChoice;

            if(drive == 1){
                driveChoice = true;
            }
            else if(drive == 2){
                driveChoice = false;
            }
            else{
                throw new IllegalArgumentException("Choose either 1 or 2");
            }

            if(input.nextInt() == 1){
                Laptop userLaptop = new Laptop(speed, ram, storage, driveChoice);
            }
        }
        else{
            throw new IllegalArgumentException("Wrong answer.");
        }


    }
}