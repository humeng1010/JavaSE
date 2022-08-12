package day08.d2_reflect_class;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射测试类
 */
public class TestReflect {

    /**
     * 获取Class类对象
     *
     * @throws ClassNotFoundException
     */
    @org.junit.Test
    public void testClass() throws ClassNotFoundException {
        //        1.Class中的静态方法
        Class<?> c = Class.forName("day08.d2_reflect_class.Student");
        System.out.println(c);
//        2.类.class
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass);
//        3.对象.getClass()
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        System.out.println(aClass);

    }

    /**
     * 获取构造器对象并使用
     *
     * @throws Exception
     */
    @org.junit.Test
    public void testConstructor() throws Exception {
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
//        获取所有
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
//        获取单个构造器
        Constructor<? extends Student> declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, char.class);
        System.out.println(declaredConstructor);

//        暴力反射
        declaredConstructor.setAccessible(true);
//        new实例
        Student student1 = declaredConstructor.newInstance("小红", 22, '女');
        System.out.println(student1);
    }

    /**
     * 获取成员变量对象
     *
     * @throws Exception
     */
    @Test
    public void testFiled() throws Exception {
        Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(student, "小红");
        System.out.println(student);

    }

    /**
     * 反射获取成员方法对象并执行
     */
    @Test
    public void testMethod() throws Exception {
        Dog dog = new Dog();
        Class<? extends Dog> aClass = dog.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("----------------");
        Method inAddr = aClass.getDeclaredMethod("inAddr");
        System.out.println(inAddr);
        inAddr.invoke(dog);

        System.out.println("----------------");
        Method eat = aClass.getDeclaredMethod("eat", String.class);
        eat.setAccessible(true);
        String msg = (String) eat.invoke(dog, "骨头");
        System.out.println(msg);

    }
}
