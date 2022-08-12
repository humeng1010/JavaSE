package day08.d3_annotation;

/**
 * 自定义注解
 */
public @interface MyBook {
    //    public String name();//默认公开
    String name() default "JAVA";

    String[] authors() default "json";

    double price() default 99.0;

    double value();
}
