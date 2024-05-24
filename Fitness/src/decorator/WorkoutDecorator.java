package decorator;

public abstract class WorkoutDecorator implements Workout {

    protected Workout decoratedWorkout;

    public WorkoutDecorator(Workout workout) {
        this.decoratedWorkout = workout;
    }

    public void workout() {
        decoratedWorkout.workout();
    }
}
