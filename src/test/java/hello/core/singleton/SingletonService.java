package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
        //생성을 막기위해 자주 쓰임
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");

    }
}
