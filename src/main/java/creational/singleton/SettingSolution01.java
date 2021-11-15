package creational.singleton;

public class SettingSolution01 {

    private static SettingSolution01 instance;

    private SettingSolution01() {

    }

    // 해결방법 01: synchronized 키워드를 사용한다. -> 여러 쓰레드의 동시 접근을 막음
    // 단점: getInstance 를 호출할때마다 동기화 처리 작업이 수행되어 성능에 불이득이 생김

    public static synchronized SettingSolution01 getInstance() {
        if (instance == null) {
            instance = new SettingSolution01();
        }

        return instance;
    }
}
