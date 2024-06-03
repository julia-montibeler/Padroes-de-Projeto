public class LightOffCommand implements Command{
    Light light = new Light();
    @Override
    public void execute() {
        light.off();
    }

    public String toString() {
        return "Light Off";
    }
}
