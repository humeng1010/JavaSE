package day02.d2OOP.d8_interface_implements;

public class PingPongMan implements SportMan {
    private String name;

    public PingPongMan() {
    }

    public PingPongMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "必须跑步训练");

    }

    @Override
    public void competition() {
        System.out.println(name + "为国争光");
    }
}
