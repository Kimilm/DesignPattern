package structural.flyweight.injava;

public class FlyweightInJava {

    // Flyweight이 적용된 자바코드는 사실 찾기 쉽지 않다. 반복되는 도메인을 간추리는데 사용되기 때문
    // 라이브러리나 프레임워크에서는 보통 사용하지 않는다.
    // 스프링에서는 거의 찾을 수가 없으셨다고 한다.
    public static void main(String[] args) {
        // valueOf 메서드의 주석을 잘 읽어보면 값들을 일부 캐싱한다는 것을 알 수 있다. -> flyweight 을 일부 사용중이구나
        // ... -127 ~ 128 범위의 자주 사용되는 값들은 캐싱을 하고 있다 ... 고 나와있음
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);

        // 사실 ==로 비교하면 안 됨. equals로 비교를 해야하지만 동일한 인스턴스를 가지고 있느냐를 보고싶은것이라 이렇게 함
        // true, 캐싱을 하기 때문에 같은 인스턴스
        System.out.println(i1 == i2);

        Integer i3 = Integer.valueOf(10000);
        Integer i4 = Integer.valueOf(10000);

        // 사실 ==로 비교하면 안 됨. equals로 비교를 해야하지만 동일한 인스턴스를 가지고있느냐를 보고싶은것이라 이렇게 함
        // false, 캐싱을 하지 않기 때문에 다른 인스턴스
        System.out.println(i3 == i4);

        // 숫자나 문자열을 비교할때는 ==를 사용하면 큰일날 수 있다는 것을 보여주는 예시
    }
}
