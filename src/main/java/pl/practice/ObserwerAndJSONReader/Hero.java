package pl.practice.ObserwerAndJSONReader;

public class Hero {

    private String heroName, realName, mainSuperpower, mainWeakPoint;
    private boolean hasToys;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMainSuperpower() {
        return mainSuperpower;
    }

    public void setMainSuperpower(String mainSuperpower) {
        this.mainSuperpower = mainSuperpower;
    }

    public String getMainWeakPoint() {
        return mainWeakPoint;
    }

    public void setMainWeakPoint(String mainWeakPoint) {
        this.mainWeakPoint = mainWeakPoint;
    }

    public boolean isHasToys() {
        return hasToys;
    }

    public void setHasToys(boolean hasToys) {
        this.hasToys = hasToys;
    }

    @Override
    public String toString() {
        return "Hero data:" + "\n"+
                "heroName='" + heroName + '\'' + "\n"+
                "realName='" + realName + '\'' + "\n"+
                "mainSuperpower='" + mainSuperpower + '\'' + "\n"+
                "mainWeakPoint='" + mainWeakPoint + '\'' + "\n"+
                "hasToys=" + hasToys + "\n"+
                "\n";
    }
}
