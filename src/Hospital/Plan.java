package Hospital;
import Hospital.doctors.Position;

public class Plan {
    private Position position;

    public Plan(Position position) {
        this.position = position;
    }


    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    @Override
    public String toString() {
        return "You need to visit" + position;
    }

}
