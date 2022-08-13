package day09.FactoryPattern;

public class FactoryPattern {
    /**
     * 定义一个方法，创建对象返回
     *
     * @param info
     * @return
     */
    public static Computer createComputer(String info) {
        switch (info) {
            case "Mac":
                Computer computer1 = new Mac();
                computer1.setName("MacBook Air");
                computer1.setPrice(9999);
                return computer1;
            case "Huawei":
                Computer computer2 = new Huawei();
                computer2.setName("华为");
                computer2.setPrice(9980);
                return computer2;
            default:
                return null;
        }
    }
}
