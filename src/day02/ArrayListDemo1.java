package day02;

import java.util.ArrayList;

/**
 * 删除集合中80分一下的分数
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<>();
        scores.add(90.0);
        scores.add(77.0);
        scores.add(79.0);
        scores.add(76.0);
        scores.add(66.0);
        scores.add(82.0);
//        对于集合元素 逆序删除可以避免删除时漏删
        for (int i = scores.size() - 1; i >= 0; i--) {
            if (scores.get(i) < 80) {
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
