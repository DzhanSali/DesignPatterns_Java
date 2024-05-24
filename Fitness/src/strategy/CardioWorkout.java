package strategy;

public class CardioWorkout implements WorkoutStrategy {

    private String enthusiast;

    public CardioWorkout(String enthusiast) {
        this.enthusiast = enthusiast;
        this.executeWorkout();
    }

    @Override
    public void executeWorkout() {
        System.out.println(enthusiast + " modified their workout with cardio workout.");
    }
}
