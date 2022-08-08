package day03.d1_api_object;

import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("熊大", '男', 2);
        Student student2 = new Student("熊大", '男', 2);
        System.out.println(student1.equals(student2));
        System.out.println(Objects.equals(student1, student2));

    }
}
