public class CeillingFanOffCommand implements Command{
    CeillingFan ceillingFan = new CeillingFan();
    @Override
    public void execute() {
        ceillingFan.off();

    }

    public String toString() {
        return "Ceilling Fan Off";
    }
}
