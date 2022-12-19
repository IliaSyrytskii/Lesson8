package Hospital.doctors;

public class Surgeon extends Doctor {
    private final Position position;

    public Surgeon() {
        this.position = Position.Surgeon;
    }


    @Override
    public void working() {
        System.out.println(position + " is working.");

    }
}
