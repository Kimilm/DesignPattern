package creational.singleton;

public class Settings {

    private static Settings instance;

    // new 키워드를 사용할 수 없게 private 으로 막아둠
    private Settings() {

    }

    // 대신 글로벌한 엑세스가 가능하도록 열어둘게 필요하다

    // 다만 이 방법은 웹과 같은 멀티쓰레드 환경에서 안전하지 않다. -> 왜?
    // 여러 쓰레드에서 최초 if문에 동시에 접근시, instance가 생성 되기 전에 if문을 통과했다면
    // 서로 다른 인스턴스를 반환하게 된다

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }

        return instance;
    }
}
