public class LightOnCommand implements Command{
    Light light = new Light();
    @Override
    public void execute() {
        light.on();
    }

    public String toString() {
        return "Light On";
    }
}
