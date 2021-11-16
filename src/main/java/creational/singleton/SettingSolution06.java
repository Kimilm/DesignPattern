package creational.singleton;

public enum SettingSolution06 {

    // 1. reflection 이렇게까지 싱글콘을 깨고 싶다면 그러려니 하고 넘길 수도 있겠지만 이마저도 해결하는 방법이 있다.

    // 해결방안 06 enum
    // 자바의 enum에서는 다양한 프로퍼티, 메서드를 정의할 수 있다.
    // reflection으로 뚫을 수 없는 코드가 됨
    // enum 은 reflection으로 건드릴 수 없게 코드가 막혀있다.

    // 단점 : 미리 생성한다.
    //      -> 생성시 리소스가 크지 않다면 가장 안전한 방법

    // 직렬화 / 역직렬화에도 안전하다
    // enum 이 Serializable 을 이미 구현하고 있음, 별다른 장치를 추가하지 않더라도 동일한 직렬화 / 역직렬화를 보장함

    INSTANCE;

    // 기본이 private,
    // 생성자도 정의할 수 있다.
    private SettingSolution06() {

    }

    // 프로퍼티
    private Integer number;

    // 메서드
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
