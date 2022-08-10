package day05;

import java.io.Serializable;

/**
 * 对象如果要序列化必须要实现Serializable接口
 */
public class Student implements Serializable {
    //    申请序列化的版本号
    //    序列化的版本号必须和反序列化的版本号必须一致才不会出错
    private static final long serialVersionUID = 1;
    
    private String name;
    //    transient修饰的成员变量不参与序列化，可以防止敏感信息暴露
    private transient Integer age;
    private Character gender;

    public Student() {
    }

    public Student(String name, Integer age, Character gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
