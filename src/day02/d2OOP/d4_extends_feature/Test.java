package day02.d2OOP.d4_extends_feature;


import java.util.Arrays;

/**
 *
 */
public class Test {
    public static void main(String[] args) throws Exception {
//        Class<Animal> animalClassClass = Animal.class;
//        Animal animal = animalClassClass.newInstance();
//        Method method = animalClassClass.getDeclaredMethod("eat");
//        System.out.println(method);
//        method.setAccessible(true);
//        method.invoke(animal);
        Tiger tiger = new Tiger();
        tiger.eat(1, 2, 3, 4);

    }
}

class Animal {
    public void eat(int num, int... a) {
        System.out.println("动物正在吃东西" + num + Arrays.toString(a));
    }

    
}

class Tiger extends Animal {

}