package day05;

/**
 * 自定义编译时异常
 */
public class MyException extends Exception {
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
