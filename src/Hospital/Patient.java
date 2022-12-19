package Hospital;

import Hospital.doctors.Dentist;
import Hospital.doctors.Position;
import Hospital.doctors.Surgeon;
import Hospital.doctors.Therapeutic;

public class Patient {
    private final Plan plan;


    public Patient(Position position) {
        this.plan = new Plan(position);
    }

    public void chooseDoctor() {
        switch (plan.getPosition()) {
            case Dentist -> {
                System.out.println(plan);
                Dentist dentist = new Dentist();
                dentist.working();
            }
            case Surgeon -> {
                System.out.println(plan);
                Surgeon surgeon = new Surgeon();
                surgeon.working();
            }
            case Therapeutic -> {
                System.out.println(plan);
                Therapeutic therapeutic = new Therapeutic();
                therapeutic.working();
            }
        }
    }
}
