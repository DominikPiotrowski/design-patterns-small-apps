package pl.practice.ProductBuliderWithLogWriter;

public class ProductBuilder {

    private Product productToBuild;

    public ProductBuilder() {
        this.productToBuild = new Product();
    }

    public ProductBuilder withComp1(Component01 comp1) {
        productToBuild.setComponent01(comp1);
        return this;
    }

    public ProductBuilder withComp2(Component02 comp2) {
        productToBuild.setComponent02(comp2);
        return this;
    }

    public ProductBuilder withComp3(Component03 comp3) {
        productToBuild.setComponent03(comp3);
        return this;
    }

    public Product build() {
        return productToBuild;
    }
}