public class GarageUpCommand implements Command{
    GarageDoor garageDoor = new GarageDoor();
    @Override
    public void execute() {
        garageDoor.on();
    }

    public String toString() {
        return "Garage Door Up";
    }
}
