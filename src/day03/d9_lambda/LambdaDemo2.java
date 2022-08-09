package day03.d9_lambda;

/**
 * 使用Lambda标准格式简化匿名内部类代码形式
 * Lambda 转换的目标类型必须是接口
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        Swimming swimming = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳快");
            }
        };
        go(swimming);
        System.out.println("--------------");
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳");
            }
        });
        System.out.println("--------------");
        go(() -> {
            System.out.println("游泳");
        });

        System.out.println("--------------");

        go(() -> System.out.println("超级简化"));

    }

    public static void go(Swimming swimming) {
        System.out.println("开始");
        swimming.swim();
        System.out.println("结束");
    }
}

@FunctionalInterface//函数式接口，里面只能有一个抽象方法
interface Swimming {
    void swim();
}

