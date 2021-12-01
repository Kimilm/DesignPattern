package creational.builder.before;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlan shortTrip = new TourPlan();
        shortTrip.setTitle("오레곤 롱비치 여행");
        shortTrip.setStartDate(LocalDate.of(2021, 7, 15));

        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("칸쿤 여행");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2020, 12, 9));
        tourPlan.setWhereToStay("리조트");

        tourPlan.addPlan(0, "체크인 이후 짐 풀기");
        tourPlan.addPlan(0, "저녁 식사");
        tourPlan.addPlan(1, "조식 뷔페에서 식사");
        tourPlan.addPlan(1, "해변가 산책");
        tourPlan.addPlan(1, "점심은 수영장 근처 음식점에서 먹기");
        tourPlan.addPlan(1, "리조트 수영장에서 놀기");
        tourPlan.addPlan(1, "저녁은 BBQ 식당에서 스테이크");
        tourPlan.addPlan(2, "조식 뷔페에서 식사");
        tourPlan.addPlan(2, "체크아웃");

        /**
         * 단점
         * 1. 일관된 프로세스가 없다
         * 2. days와 nights는 같이 세팅되어야 하는데 강제할 수 없다 -> 객체(인스턴스)가 불완전하게 생성될 여지가 있다.
         * 3. 다양한 파라미터를 지원하는 생성자를 만들고 싶을 때 -> 생성자를 만드는 방법이 장황해진다.
         *
         * 빌더 패턴을 적용하면
         * 장점
         * 1. 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만들 수 있다.
         * 2. (복잡한) 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.
         * 3. 구현체와 인터페이스로 분리하면 확장에 용이하다.
         * 4. 디렉터를 사용하여 구현하게 되면 반복되는 빌더 호출 스택을 빌더 내부에 숨겨두고 클라이언트는 디렉터를 통해 간단하게 인스턴스를 받아서 사용할 수 있다.
         */
    }
}
