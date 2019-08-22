package pl.practice.BuilderWithNoLombok;

public class App {
    public static void main(String[] args) {

        MountineBulider mountineBulider = new MountineBulider();
        Mountine MountEverest = mountineBulider
                .withName("Mount Everest")
                .withContinent(Continent.ASIA)
                .withHeight(8848)
                .build();

        MountineBulider mountineBulider1 = new MountineBulider();
        Mountine Aconcagua = mountineBulider1
                .withName("Aconcagua ")
                .withContinent(Continent.SOUTH_AMERICA)
                .withHeight(6961)
                .build();

        System.out.println(MountEverest);
        System.out.println(Aconcagua);
    }
}
