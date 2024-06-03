public class StereoOffCommand implements Command{
    Stereo stereo = new Stereo();
    @Override
    public void execute() {
        stereo.off();
    }

    public String toString() {
        return "Stereo Off";
    }
}
