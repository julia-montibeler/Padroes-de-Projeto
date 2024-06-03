public class CeillingFanHighCommand implements Command{
    CeillingFan ceillingFan = new CeillingFan();
    @Override
    public void execute() {
        if (ceillingFan.getSpeed() == 0) {
            ceillingFan.lowSpeed();
        }
        if (ceillingFan.getSpeed() == 1) {
            ceillingFan.mediumSpeed();
        }
        if (ceillingFan.getSpeed() == 2) {
            ceillingFan.highSpeed();
        }
        if (ceillingFan.getSpeed() == 3) {
            ceillingFan.lowSpeed();
        }
    }

    public String toString() {
        return "Ceilling Fan On";
    }
}
