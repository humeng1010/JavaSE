package day04.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        //多态，list调用的都是左边Collection中的方法
        Collection<String> list = new ArrayList<>();
        //1、添加元素
        list.add("Java");
        list.add("MySQL");
        list.add("Spring");
        list.add("Java");
        System.out.println(list);

        list.forEach(System.out::println);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if ("Java".equals(next)) {
                iterator.remove();
            }
        }
        System.out.println(list);
//        list.removeIf("Java"::equals);

    }
}
