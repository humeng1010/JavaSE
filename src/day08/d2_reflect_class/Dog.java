package day08.d2_reflect_class;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("狗跑的贼快~~");
    }

    private void eat() {
        System.out.println("狗吃骨头");
    }

    private String eat(String name) {
        System.out.print("狗吃" + name);
        return "吃的很开心";
    }

    public static void inAddr() {
        System.out.println("在世界上有很多单身狗");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
