package creational.singleton;

public class SettingSolution04 {

    private SettingSolution04() {

    }

    // 권장하는 방법중 하나
    // 지금까지 살펴본 이 모든 방법을 깨트릴 수 있는 다양한 코딩방법들이 존재함

    // 해결방법 04: static inner 클래스를 사용하기
    //              -> 멀티 쓰레드 환경에서 안전
    //              -> getInstance()가 호출이 될 때 static inner class 가 로딩이 되고
    //              -> 클래스가 로딩되는 시점에 멤버변수가 초기화되기 때문!
    //              -> 코드가 간결 + Lazy Loading 구현

    private static class SettingHolder {
        private static final SettingSolution04 INSTANCE = new SettingSolution04();
    }

   public static SettingSolution04 getInstance() {
        return SettingHolder.INSTANCE;
    }
}
