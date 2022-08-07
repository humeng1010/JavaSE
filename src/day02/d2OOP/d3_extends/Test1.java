package day02.d2OOP.d3_extends;

public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("小李");
        student.setAge(22);
        student.setSchoolName("大肥羊学校");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchoolName());
    }
}
