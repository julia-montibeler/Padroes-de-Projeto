public class GarageDownCommand implements Command{
    GarageDoor garageDoor = new GarageDoor();
    @Override
    public void execute() {
        garageDoor.off();
    }

    public String toString() {
        return "Garage Door Down";
    }
}
