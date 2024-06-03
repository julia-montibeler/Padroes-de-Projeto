public class StereoOnWithCDCommand implements Command{
    Stereo stereo = new Stereo();
    @Override
    public void execute() {
        stereo.on();
    }

    public String toString() {
        return "Stereo On";
    }
}
