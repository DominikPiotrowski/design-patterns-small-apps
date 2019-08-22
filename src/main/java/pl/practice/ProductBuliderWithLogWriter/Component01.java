package pl.practice.ProductBuliderWithLogWriter;

public enum Component01 {
    COMPONENT_01_V_A("64NEW"),
    COMPONENT_01_V_B("8500K"),
    COMPONENT_01_V_C("980AZ");

    private String version;

    Component01(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }
}