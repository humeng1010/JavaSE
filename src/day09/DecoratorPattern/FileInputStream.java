package day09.DecoratorPattern;

import java.util.Arrays;

public class FileInputStream extends InputStream {
    @Override
    public int read() {
        System.out.println("低性能读取了一个字节a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0] = 97;
        buffer[1] = 98;
        buffer[2] = 99;
        System.out.println("低性能的读取了" + Arrays.toString(buffer));
        return 3;
    }
}
