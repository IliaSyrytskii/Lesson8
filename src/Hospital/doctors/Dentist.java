package Hospital.doctors;

public class Dentist extends Doctor {
    private final Position position;

    public Dentist() {
        this.position = Position.Dentist;
    }

    @Override
    public void working() {
        System.out.println(position + " is working.");

    }
}
