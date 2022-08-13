package day09.FactoryPattern;

public class Huawei extends Computer {
    @Override
    public void start() {
        System.out.println(getName() + "开机了");
    }
}
