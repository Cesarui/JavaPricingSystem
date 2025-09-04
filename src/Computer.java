// Cesar Pimentel
public abstract class Computer implements ComputingDevice{

    protected double cpuClockSpeed;
    protected int ram;
    protected int storage;
    protected boolean wirelessNetworkCard = true;

    Computer(double cpuClockSpeed, int ram, int storage) {
        this.cpuClockSpeed = cpuClockSpeed;
        this.ram = ram;
        this.storage = storage;
    }

}