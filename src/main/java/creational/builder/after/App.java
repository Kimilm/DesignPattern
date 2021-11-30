package creational.builder.after;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // 디렉터 사용 전
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();

        TourPlan longBeachPlan = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();

        // 디렉터 사용 후
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan cancunTrip = director.cancunTrip();
        TourPlan longBeachTrip = director.longBeachTrip();
    }
}
