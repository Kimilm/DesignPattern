package creational.singleton;

import java.io.Serializable;

public class SettingSolution05 implements Serializable {

    private SettingSolution05() {

    }

    // 4번의 해결방안은 매력적이지만 자바에서 허용하는 합법적인 방법을 사용하면 다른 인스턴스가 생성될 여지가 존재한다

    // 1. reflection 을 사용하면 깰 수 있다.
    // 2. 직렬화/역직렬화를 사용하면 깰 수 있다. (implements Serializable) -> 객체를 파일로 저장한다던가

    // 해결방안 05
    // 1. reflection -> 못 막는다
    // 2. 직렬화 / 역직렬화 -> Serializable 내부에 명시적으로 선언되어있지는 않지만 역직렬화 과정에 사용되는 readResolve() 메서드를 오버로딩
    //                  -> 이렇게 되면 역직렬화시 new 를 사용하지 않게 됨

    private static class SettingHolder {
        private static final SettingSolution05 INSTANCE = new SettingSolution05();
    }

    public static SettingSolution05 getInstance() {
        return SettingHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
