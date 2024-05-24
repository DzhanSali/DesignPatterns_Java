package observer;

public interface PlanObserver {

    void update();
    void setPlan(PlanSubscription planSubscription);
}
