package creational.singleton.in_java;

public class RuntimeExample {
    public static void main(String[] args) {
        // 이렇게는 생성할 수 없음
        //runtime = new Runtime();

        // Eager Init 이기에 ThreadSafe
        // 자바 어플리케이션이 실행되고있는 환경, 문맥 정보

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
    }
}
