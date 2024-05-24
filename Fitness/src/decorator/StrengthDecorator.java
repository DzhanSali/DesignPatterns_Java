package decorator;

public class StrengthDecorator extends WorkoutDecorator{

    public StrengthDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void workout() {
        super.workout();
        System.out.println("Trainee adding new strength training exercises.");
    }
}
