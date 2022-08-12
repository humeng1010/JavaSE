package day08.d4_proxy;

/**
 * 明星类 必须实现接口
 */
public class Star implements Skill {
    private String name;

    public Star() {
    }

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(this.name + "开始跳舞");
    }

    @Override
    public void sing() {
        System.out.println(this.name + "开始唱歌");
    }
}
