package strategy;

public class StrengthWorkout implements WorkoutStrategy {

    private String enthusiast;

    public StrengthWorkout(String enthusiast) {
        this.enthusiast = enthusiast;
        this.executeWorkout();
    }

    @Override
    public void executeWorkout() {
        System.out.println(enthusiast + " modified their workout with strength workout.");
    }
}
