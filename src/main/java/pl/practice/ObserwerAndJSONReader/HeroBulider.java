package pl.practice.ObserwerAndJSONReader;

public class HeroBulider {

    private Hero heroToBulid;

    public HeroBulider() {
        heroToBulid = new Hero();
    }

    public HeroBulider withHeroName(String heroName) {
        heroToBulid.setHeroName(heroName);
        return this;
    }

    public HeroBulider withRealName(String realName) {
        heroToBulid.setRealName(realName);
        return this;
    }

    public HeroBulider withMainSuperpower(String mainSuperpower) {
        heroToBulid.setMainSuperpower(mainSuperpower);
        return this;
    }

    public HeroBulider withMainWeakPoint(String mainWeakPoint) {
        heroToBulid.setMainWeakPoint(mainWeakPoint);
        return this;
    }

    public HeroBulider withHasToys(Boolean hasToys) {
        heroToBulid.setHasToys(hasToys);
        return this;
    }

    public Hero bulid() {
        return heroToBulid;
    }
}
