package creational.builder.injava;

import lombok.Builder;

@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int days;

    public static void main(String[] args) {
        // @Builder 어노테이션으로 자동 생성된 빌더
        // 롬복이 어떻게 동작하는지, 어노테이션 프로세서가 뭐고 컴파일할때 어떻게 동작하는지가 궁금하다면 더 자바 코드를 조작하는 다양한 방법 강의를 수강하라고 하신다
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .nights(2)
                .days(3)
                .build();
    }
}
