package observer;

public interface PlanSubscription {

    void subscribe(PlanObserver planObserver);
    void unsubscribe(PlanObserver planObserver);
    void notifyObservers();
    String getUpdate();
}
