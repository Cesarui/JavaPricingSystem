// Cesar Pimentel
public class Tablet extends Computer{

    private final double basePrice = 400;
    private final int[] sizes = {8, 10, 13};
    private int screenSize;
    private boolean isValid;

    /*
        A simple method that checks if one of the sizes is valid, basically just iterates through the sizes array
        to check if the size the user inputs is one of the available options.
     */
    boolean checkScreenSize(int screenSize) {
        for(int size: sizes){
            if (screenSize == size) {
                isValid = true;
                break;
            }
            else {
                isValid = false;
            }
        }
        return isValid;
    }
    /*
        Tablet constructor, takes in parameters which then are initialized by its super class.
        If one of the arguments aren't according to the minimum amount, an IllegalArgumentException ill get thrown.
    */
    Tablet(double cpuClockSpeed, int ram, int storage, int screenSize) {
        super(cpuClockSpeed, ram, storage);
        this.screenSize = screenSize;

        if(checkScreenSize(screenSize)){
        }
        else{
            throw new IllegalArgumentException("Not a valid Screen Size, Valid Screen Size are: \n8,10,13");
        }

        if (cpuClockSpeed < 1.1 || ram < 4){
            throw new IllegalArgumentException("CPU clock speed can't be less than 1.1...and ram can't be less than 4GB");
        }


    }
    // Individual price for components (I chose random reasonable values)
    double getRamPrice(){
        return Math.round(ram * 25.00);
    }
    double getStoragePrice(){
        return Math.round(storage * 0.3);
    }
    double getCpuPrice(){
        return Math.round(cpuClockSpeed * 18.00);
    }

    // Price will increase based on the screen size.
    double getTotalPrice(){
        double price = getRamPrice() + getStoragePrice() + getCpuPrice() + basePrice;

        if(screenSize == 8){
            return Math.round(price + 50.00);
        }
        else if(screenSize == 10){
            return Math.round(price + 100.00);
        }
        else if(screenSize == 13){
            return Math.round(price + 200.00);
        }
        else{
            return Math.round(price);
        }
    }

    // Method for shipping cost
    double getShippingCost() {
        return Math.round(getTotalPrice() * 0.05);
    }

    // Regular methods
    @Override
    public void turnOn() {
        System.out.println("Beep boop, tablet turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Beep boop, tablet turning off");
    }

    // Self explanatory ToString:)
    @Override
    public String toString() {
        return "Your tablet's specs: \nCpuClockSpeed - " + cpuClockSpeed + " \nRam - " + ram + " \nStorage - " + storage + " \nScreen size - " + screenSize;
    }
}
