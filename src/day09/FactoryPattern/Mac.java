package day09.FactoryPattern;

public class Mac extends Computer {


    @Override
    public void start() {
        System.out.println(getName() + "开机了");
    }
}
