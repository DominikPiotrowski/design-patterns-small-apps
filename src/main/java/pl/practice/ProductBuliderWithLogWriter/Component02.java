package pl.practice.ProductBuliderWithLogWriter;

public enum Component02 {
    COMPONENT_02_V_1(558966),
    COMPONENT_02_V_2(987550),
    COMPONENT_02_V3(889322);

    private Integer serialNum;

    Component02(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Integer getSerialNum() {
        return serialNum;
    }
}
