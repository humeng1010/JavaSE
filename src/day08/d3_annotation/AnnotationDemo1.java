package day08.d3_annotation;

/**
 * 学会自定义注解
 */
@MyBook(name = "JAVASE", authors = {"小黑", "小白"}, price = 99.8, value = 100)
public class AnnotationDemo1 {
    @MyBook(11.33)
    private AnnotationDemo1() {

    }
}
