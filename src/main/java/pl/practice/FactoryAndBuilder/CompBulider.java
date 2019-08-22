package pl.practice.FactoryAndBuilder;

public class CompBulider {

    private ComputerRequirement computerRequirementToBulid;

    public CompBulider() {
        this.computerRequirementToBulid = new ComputerRequirement();
    }

    public CompBulider withDiskSpace(DiskSpace diskSpace) {
        computerRequirementToBulid.setDiskSpace(diskSpace);
        return this;
    }

    public CompBulider withRam(Ram ram) {
        computerRequirementToBulid.setRam(ram);
        return this;
    }

    public CompBulider withProcessorSpeed(int processorSpeed) {
        computerRequirementToBulid.setProcessorSpeed(processorSpeed);
        return this;
    }

    public CompBulider withprocessorCoreNumber(int processorCoreNumber) {
        computerRequirementToBulid.setProcessorCoreNumber(processorCoreNumber);
        return this;
    }

    public ComputerRequirement build() {
        return computerRequirementToBulid;
    }
}
