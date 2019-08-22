package pl.practice.FactoryAndBuilder;

public class CompSet3 implements IComputer{

    CompBulider compBulider3 = new CompBulider();
    ComputerRequirement highEnd = compBulider3
            .withDiskSpace(DiskSpace.DISK_1024GB)
            .withprocessorCoreNumber(8)
            .withProcessorSpeed(5000)
            .withRam(Ram.RAM_32GB)
            .build();

    @Override
    public String toString() {
        return "CompSet1" + "\n "
                + "High End: " + "\n "
                + "Disk space: " + highEnd.getDiskSpace() + "\n "
                + "Processor core quantity: " + highEnd.getProcessorCoreNumber() + "\n "
                + "Processor speed: " + highEnd.getProcessorSpeed() + "\n "
                + "RAM capacity: " + highEnd.getRam();
    }
}
