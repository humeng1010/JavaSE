package day04.collection;

import java.util.*;

public class SetDemo1 {
    public static void main(String[] args) {
//        HansSet:无序、不重复、无索引
//        Set<Integer> integers = new HashSet<>();
//        LinkedHashSet:有序、不重复、无索引
//        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
//        TreeSet:排序、不重复、无索引
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(9);
        integers.add(7);
        integers.add(5);
        integers.add(55);
        integers.add(555);
        integers.add(55555);
        integers.add(555556);
        integers.add(5555567);
        integers.add(1);
        System.out.println(integers);
        
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 4, 5, 7, 3, 1, 5, 9, 22);
        list.sort(((o1, o2) -> o2 - o1));
        System.out.println(list);
    }
}
