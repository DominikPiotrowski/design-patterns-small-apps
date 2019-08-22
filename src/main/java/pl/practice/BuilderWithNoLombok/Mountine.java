package pl.practice.BuilderWithNoLombok;

public class Mountine {

    private String name;
    private double height;
    private Continent continent;

    @Override
    public String toString() {
        return "Mountine{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", continent=" + continent +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
