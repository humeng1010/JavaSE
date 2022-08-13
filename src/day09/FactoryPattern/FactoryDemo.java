package day09.FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer mac = FactoryPattern.createComputer("Mac");
        mac.start();
        Computer huawei = FactoryPattern.createComputer("Huawei");
        huawei.start();
    }
}
