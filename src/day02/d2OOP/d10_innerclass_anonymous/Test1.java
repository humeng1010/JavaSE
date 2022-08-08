package day02.d2OOP.d10_innerclass_anonymous;


import day02.d2OOP.d8_interface_implements.Test;

/**
 * 匿名内部类
 * 作用：简化代码的书写，使代码更简洁
 */
public class Test1 {
    public static void main(String[] args) {
//        匿名内部类
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        dog.eat();

        Animal cat = () -> {
            System.out.println("猫吃鱼");
        };
        cat.eat();

        //lambda表达式
        go(() -> System.out.println("hello"));
    }

    public static void go(Animal animal) {
        animal.eat();
    }

}

//class Dog extends Animal {
//
//    @Override
//    public void eat() {
//        System.out.println("狗吃东西");
//    }
//}

interface Animal {
    void eat();
}
