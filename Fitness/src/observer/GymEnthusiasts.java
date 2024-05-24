package observer;

import strategy.WorkoutStrategy;

public class GymEnthusiasts implements PlanObserver {

    private PlanSubscription plan;
    private String name;
    private WorkoutStrategy workoutStrategy;
    private boolean notified = false;

    public GymEnthusiasts(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Trainees modify their workouts
    public void setWorkoutStrategy(WorkoutStrategy strategy) {
        this.workoutStrategy = strategy;
    }

    @Override
    public void update() {
        if(!notified){
            System.out.println(this.getName() + " was subscribed to: " + this.plan.getUpdate()
                    + " by their instructor.");
            notified = true;
        }
        else{
            System.out.println(this.getName() + " was subscribed to new workout plan: ");
        }
        if (workoutStrategy != null) {
            workoutStrategy.executeWorkout();
        }
    }

    @Override
    public void setPlan(PlanSubscription planSubscription) {
        this.plan = planSubscription;
    }
}
