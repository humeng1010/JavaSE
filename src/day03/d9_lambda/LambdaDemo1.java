package day03.d9_lambda;

/**
 * 使用Lambda标准格式简化匿名内部类代码形式
 * Lambda 转换的目标类型必须是接口
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("乌龟跑的很慢");
            }
        };
        animal.run();
//        Animal animal1 = () -> System.out.println("老虎跑的很快");
//        animal1.run();

    }
}

abstract class Animal {
    public abstract void run();
}
