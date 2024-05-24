package observer;

import java.util.ArrayList;
import java.util.List;

public class Instructor implements PlanSubscription {

    private List<PlanObserver> planObserverList;
    private String workoutName;
    private String workoutDuration;

    public Instructor() {
        this.planObserverList = new ArrayList<>();
    }

    @Override
    public void subscribe(PlanObserver planObserver) {
        this.planObserverList.add(planObserver);
        planObserver.setPlan(this);
    }

    @Override
    public void unsubscribe(PlanObserver planObserver) {
        this.planObserverList.remove(planObserver);
        planObserver.setPlan(null);
    }

    @Override
    public void notifyObservers() {
        for(PlanObserver planObserver : this.planObserverList){
            planObserver.update();
        }
    }

    @Override
    public String getUpdate() {
        return workoutName;
    }

    public void setWorkoutPlan(String workoutName, String workoutDuration) {
        this.workoutName = workoutName;
        this.workoutDuration = workoutDuration;
        this.notifyObservers();
    }
}
