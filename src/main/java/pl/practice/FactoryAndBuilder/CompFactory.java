package pl.practice.FactoryAndBuilder;

public class CompFactory {

    public IComputer produce(ComputerRequirement requieredComp) {

        IComputer computerSetToProduce = null;

        DiskSpace diskSpace = requieredComp.getDiskSpace();
        Ram ram = requieredComp.getRam();

        int processorSpeed = requieredComp.getProcessorSpeed();
        int processorCoreNumber = requieredComp.getProcessorCoreNumber();

        if (ram.equals(Ram.RAM_4GB)) {
            return new CompSet1();
        }
        if (ram.equals(Ram.RAM_8GB)) {
            return new CompSet3();
        }
        if (ram.equals(Ram.RAM_32GB)) {
            return new CompSet3();
        }

        if (diskSpace.equals(DiskSpace.DISK_256GB)) {
            return new CompSet1();
        }
        if (diskSpace.equals(DiskSpace.DISK_512GB)) {
            return new CompSet2();
        }
        if (diskSpace.equals(DiskSpace.DISK_1024GB)) {
            return new CompSet3();
        }

        if (processorCoreNumber<2 ) {
            return new CompSet1();
        }
        if (processorCoreNumber<4 && processorCoreNumber>2) {
            return new CompSet2();
        }
        if (processorCoreNumber>3) {
            return new CompSet3();
        }

        if (processorSpeed<2000) {
            return new CompSet1();
        }
        if (processorSpeed<4000 && processorSpeed>2000) {
            return new CompSet2();
        }
        if (processorSpeed>4000) {
            return new CompSet3();
        }


        return computerSetToProduce;
    }
}
