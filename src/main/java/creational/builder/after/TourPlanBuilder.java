package creational.builder.after;

import java.time.LocalDate;

public interface TourPlanBuilder {
    // to method chaining
    default TourPlanBuilder newInstance() {
        return null;
    }

    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    // finish
    // validation등의 처리가 가능
    TourPlan getPlan();
}
