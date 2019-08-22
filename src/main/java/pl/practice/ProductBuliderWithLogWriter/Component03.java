package pl.practice.ProductBuliderWithLogWriter;

public enum Component03 {
    COMPONENT_03_V_X(true),
    COMPONENT_03_V_Y(true),
    COMPONENT_03_V_Z(false);

    private boolean Tested;

    Component03(boolean tested) {
        Tested = tested;
    }

    public boolean isTested() {
        return Tested;
    }
}