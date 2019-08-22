package pl.practice.BuilderWithNoLombok;

public class MountineBulider {

    private Mountine mountineToBulid;

    public MountineBulider() {
        this.mountineToBulid = new Mountine();
    }

    public MountineBulider withName(String name) {
        mountineToBulid.setName(name);
        return this;
    }

    public MountineBulider withContinent(Continent continent) {
        mountineToBulid.setContinent(continent);
        return this;
    }

    public MountineBulider withHeight(double height) {
        mountineToBulid.setHeight(height);
        return this;
    }

    public Mountine build() {
        return mountineToBulid;
    }
}
