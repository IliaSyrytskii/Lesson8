package Hospital.doctors;

public class Therapeutic extends Doctor{

    private final Position position;

    public Therapeutic() {
        this.position = Position.Therapeutic;
    }

    @Override
    public void working() {
        System.out.println(position + " is working.");
    }
}
