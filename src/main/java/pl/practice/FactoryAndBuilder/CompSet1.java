package pl.practice.FactoryAndBuilder;

public class CompSet1 implements IComputer {

    CompBulider compBulider1 = new CompBulider();
    ComputerRequirement lowEnd = compBulider1
            .withDiskSpace(DiskSpace.DISK_256GB)
            .withprocessorCoreNumber(2)
            .withProcessorSpeed(1800)
            .withRam(Ram.RAM_4GB)
            .build();

    @Override
    public String toString() {
        return "CompSet1" + "\n "
                + "Low End: " + "\n "
                + "Disk space: " + lowEnd.getDiskSpace() + "\n "
                + "Processor core quantity: " + lowEnd.getProcessorCoreNumber() + "\n "
                + "Processor speed: " + lowEnd.getProcessorSpeed() + "\n "
                + "RAM capacity: " + lowEnd.getRam();
    }
}
