package decorator;

public class CardioDecorator extends WorkoutDecorator{

    public CardioDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void workout() {
        super.workout();
        System.out.println("Trainee adding new cardio exercises.");
    }
}
