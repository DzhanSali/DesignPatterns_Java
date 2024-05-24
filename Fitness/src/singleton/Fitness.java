package singleton;

import observer.Instructor;

public class Fitness {

    private static Fitness fitnessRoom;
    private Instructor instructor;

    private Fitness() {
        instructor = new Instructor();
    }

    public static Fitness useFitnessRoom(){
        if(fitnessRoom == null) {
            fitnessRoom = new Fitness();
        }
        return fitnessRoom;
    }

    public Instructor getInstructor(){
        return instructor;
    }
}
