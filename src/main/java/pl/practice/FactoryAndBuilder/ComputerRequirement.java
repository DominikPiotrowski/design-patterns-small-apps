package pl.practice.FactoryAndBuilder;

public class ComputerRequirement {

    private DiskSpace diskSpace;
    private Ram ram;
    private int processorSpeed;
    private int processorCoreNumber;

    public DiskSpace getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(DiskSpace diskSpace) {
        this.diskSpace = diskSpace;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(int processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public int getProcessorCoreNumber() {
        return processorCoreNumber;
    }

    public void setProcessorCoreNumber(int processorCoreNumber) {
        this.processorCoreNumber = processorCoreNumber;
    }
}
