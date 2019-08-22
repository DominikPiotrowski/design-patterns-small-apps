package pl.practice.ProductBuliderWithLogWriter;

public class Product {

    private Component01 component01;
    private Component02 component02;
    private Component03 component03;

    public Component01 getComponent01() {
        return component01;
    }

    public void setComponent01(Component01 component01) {
        this.component01 = component01;
    }

    public Component02 getComponent02() {
        return component02;
    }

    public void setComponent02(Component02 component02) {
        this.component02 = component02;
    }

    public Component03 getComponent03() {
        return component03;
    }

    public void setComponent03(Component03 component03) {
        this.component03 = component03;
    }

    @Override
    public String toString() {
        return "Product{" +
                "component01=" + component01 + " "+component01.getVersion() +
                ", component02=" + component02 + " " + component02.getSerialNum() +
                ", component03=" + component03 + " is tested:  " + component03.isTested() +
                '}';
    }
}
