package day08.d3_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMyTest {
    @MyTest
    public void test1() {
        System.out.println("test1");
    }

    //    @MyTest
    public void test2() {
        System.out.println("test2");
    }

    @MyTest
    public void test3() {
        System.out.println("test3");
    }

    public static void main(String[] args) throws Exception {
        Class<TestMyTest> testMyTestClass = TestMyTest.class;
        Method[] declaredMethods = testMyTestClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.isAnnotationPresent(MyTest.class)) {
                declaredMethod.invoke(new TestMyTest());
            }
        }
    }

}
