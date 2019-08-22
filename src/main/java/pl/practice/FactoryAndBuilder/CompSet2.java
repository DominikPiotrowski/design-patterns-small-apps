package pl.practice.FactoryAndBuilder;

public class CompSet2 implements IComputer {

    CompBulider compBulider2 = new CompBulider();
    ComputerRequirement midEnd = compBulider2
            .withDiskSpace(DiskSpace.DISK_512GB)
            .withprocessorCoreNumber(4)
            .withProcessorSpeed(2500)
            .withRam(Ram.RAM_8GB)
            .build();

    @Override
    public String toString() {
        return "CompSet1" + "\n "
                + "Mid End: " + "\n "
                + "Disk space: " + midEnd.getDiskSpace() + "\n "
                + "Processor core quantity: " + midEnd.getProcessorCoreNumber() + "\n "
                + "Processor speed: " + midEnd.getProcessorSpeed() + "\n "
                + "RAM capacity: " + midEnd.getRam();
    }
}
