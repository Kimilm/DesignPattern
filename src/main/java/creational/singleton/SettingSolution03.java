package creational.singleton;

public class SettingSolution03 {

    // volatile 키워드를 붙여줘야 완성된다고 할 수 있다.
    private static volatile SettingSolution03 instance;

    private SettingSolution03() {

    }

    // 해결방법 03: double checked locking 사용하기
    // 매번 getInstance 메서드를 사용할때마다 싱크로 처리를 하지 않음 -> 성능 향상
    // instance가 생성되지 않았을 때 다수의 쓰레드가 최초 if문을 통과했다 하더라도 싱크로 블럭에 막혀서 다른 인스턴스가 생성되지 않음
    // 매우 많은 트래픽이 발생하는 사이트는 다수의 쓰레드가 동시에 if문을 통과하는 경우가 잦다.
    // 인스턴스가 필요한 시점에 생성할 수 있다.

    // 다만 왜 변수에 volatile을 달아야 하는지 이해하려면 1.4 이하의 자바 버전에서 자바가 메모리를 다루는 방법까지 이해해야 함
    // volatile 키워드는 1.5부터 동작

    // 코드가 좀 더 복잡해보이는 단점도 존재

   public static SettingSolution03 getInstance() {
        if (instance == null) {
            synchronized (SettingSolution03.class) {
                if (instance == null) {
                    instance = new SettingSolution03();
                }
            }
        }
        return instance;
    }
}
