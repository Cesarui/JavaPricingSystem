// Cesar Pimentel
public class Laptop extends Computer{

    private final double basePrice = 600;
    private boolean dvdDrive;

    // Default constructor, error is thrown if rules for minimum values aren't met
    Laptop(double cpuClockSpeed, int ram, int storage, boolean dvdDrive) {
        super(cpuClockSpeed, ram, storage);

        if (cpuClockSpeed < 1.1 || ram < 4){
            throw new IllegalArgumentException("CPU clock speed can't be less than 1.1...and ram can't be less than 4GB");
        }
    }

    // Getting individual price methods
    double getRamPrice(){
        return Math.round(ram * 30.00);
    }
    double getStoragePrice(){
        return Math.round(storage * 50.00);
    }
    double getCpuPrice(){
        return Math.round(cpuClockSpeed * 20.00);
    }
    double getDVDPrice(){
        return 200.00;
    }

    /*
        Getting total price, calls the individuals methods that return their prices and adds them up,
        whether the user decides to buy a dvd or not, the price will increase accordingly.
    */
    double getTotalPrice(){
        double price = getRamPrice() + getStoragePrice() + getCpuPrice() + basePrice;

        if(dvdDrive){
            return Math.round(price + 200.00);
        }
        else{
            return Math.round(price);
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Beep boop, laptop turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Beep boop, laptop turning off");
    }

    public String toString() {
        return "Your laptop's specs: \nCpuClockSpeed - " + cpuClockSpeed + " \nRam - " + ram + " \nStorage - " + storage + " \nDvdDrive - " + dvdDrive;
    }
}

