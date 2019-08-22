package pl.practice.ProductBuliderWithLogWriter;

public class App {

    public static void main(String[] args) {

        ProductBuilder productBuilder = new ProductBuilder();
        Product readyProduct1 = productBuilder
                .withComp1(Component01.COMPONENT_01_V_A)
                .withComp2(Component02.COMPONENT_02_V_1)
                .withComp3(Component03.COMPONENT_03_V_Z)
                .build();
        System.out.println(readyProduct1.toString());

        ProductLogWriter productLogWriter = new ProductLogWriter();
        productLogWriter.write(
                "C:\\Users\\piotr\\IdeaProjects\\DesignPattersEx\\src\\main\\resources\\product.log");
    }
}