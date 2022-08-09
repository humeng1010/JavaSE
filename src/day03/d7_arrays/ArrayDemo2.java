package day03.d7_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 自定义数组排序规则Comparator比较器
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        Integer[] ages = {20, 18, 30, 11, 21, 55, 33};
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
//
        Arrays.sort(ages, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(ages));

//        学生数组对象
        Student[] students = {
                new Student("1", 20, 189.0),
                new Student("2", 22, 185.0),
                new Student("3", 19, 177.0),
                new Student("4", 21, 182.0)
        };
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                比较浮点型可以这样写
                return Double.compare(o1.getHeight(), o2.getHeight());
            }
        });
        System.out.println(Arrays.toString(students));


//        学生集合对象
        List<Student> list = new ArrayList<>();
        list.add(new Student("1", 20, 189.0));
        list.add(new Student("2", 22, 185.0));
        list.add(new Student("3", 19, 177.0));
        list.add(new Student("4", 21, 182.0));
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);
    }
}
