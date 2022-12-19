package Hospital;

import Hospital.doctors.Position;

public class Main {
    public static void main (String[] args) {
        Patient patient1 = new Patient(Position.Dentist);
        patient1.chooseDoctor();
        System.out.println();

        Patient patient2 = new Patient(Position.Surgeon);
        patient2.chooseDoctor();
        System.out.println();

        Patient patient3 = new Patient(Position.Therapeutic);
        patient3.chooseDoctor();
    }
}
