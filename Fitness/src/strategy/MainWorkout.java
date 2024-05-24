package strategy;

import decorator.Workout;

public class MainWorkout implements Workout {

    private String workoutName;
    private String workoutDuration;

    public MainWorkout(String workoutName, String workoutDuration) {
        this.workoutName = workoutName;
        this.workoutDuration = workoutDuration;
    }

    @Override
    public void workout() {
        System.out.println(workoutName + " for " + workoutDuration);
    }
}
