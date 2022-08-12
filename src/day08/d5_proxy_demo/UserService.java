package day08.d5_proxy_demo;

public interface UserService {
    String login(String name, String password);

    boolean delete(int id);

    String select(String query);
}
