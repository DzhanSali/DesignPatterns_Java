import observer.GymEnthusiasts;
import observer.Instructor;
import singleton.Fitness;
import decorator.*;
import strategy.CardioWorkout;
import strategy.MainWorkout;
import strategy.StrengthWorkout;

public class ProjectEntryPoint {

    public static void main(String[] args) {

        Fitness fitnessProgramme = Fitness.useFitnessRoom();

        //Use the Singleton class
        Instructor instructor = fitnessProgramme.getInstructor();

        //Pesho and Kolio walk into a gym...
        GymEnthusiasts pesho = new GymEnthusiasts("Pesho");
        GymEnthusiasts kolio = new GymEnthusiasts("Kolio");

        //The instructor can subscribe trainees and then notify them
        instructor.subscribe(pesho);
        instructor.subscribe(kolio);

        instructor.setWorkoutPlan("upper body workout", "20 minutes");

        //Trainees modify their own workouts
        pesho.setWorkoutStrategy(new CardioWorkout(pesho.getName()));
        kolio.setWorkoutStrategy(new StrengthWorkout(kolio.getName()));

        //Modifying trainees' current workout plan
        Workout mainWorkout = new MainWorkout("Standard Workout", "30 minutes");
        Workout cardioWorkout = new CardioDecorator(mainWorkout);
        Workout fullWorkout = new StrengthDecorator(cardioWorkout);

        //Overwrite their existing workout plans
        pesho.setWorkoutStrategy(fullWorkout::workout);
        kolio.setWorkoutStrategy(fullWorkout::workout);

        //And notify them about the new changes
        instructor.notifyObservers();
    }
}
