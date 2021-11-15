package creational.singleton;

public class SettingSolution02 {

    private static final SettingSolution02 INSTANCE = new SettingSolution02();

    private SettingSolution02() {

    }

    // 해결방법 02: private static final Settings INSTANCE = new Settings(); 라고 처음부터 선언해버리기
    //              -> 이 경우 메서드에 synchronized 를 붙이지 않아도 된다 if(instance == null) 블록도 제거 just return
    //              -> eager initialization, 이른 초기화 방식
    //              -> 클래스가 로딩되는 시점에 초기화가 되기 때문에 (static) 쓰레드 세이프
    // 단점: 미리 만든다는 그 자체가 단점이 될 수 있음, 인스턴스 생성에 많은 리소스가 소요되는 경우 만들어두고 안 쓰면 손해

    public static synchronized SettingSolution02 getInstance() {
        return INSTANCE;
    }
}
