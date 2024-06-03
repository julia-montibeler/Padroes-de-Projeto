public class RemoteLoader {
    static RemoteControl remoteControl;
    static Command lightOnRoom= new LightOnCommand();
    static Command lightOffRoom = new LightOffCommand();
    static Command lightOnKitchen = new LightOnCommand();
    static Command lightOffKitchen = new LightOffCommand();
    static Command ceillingFanHigh = new CeillingFanHighCommand();
    static Command ceillingFanOff = new CeillingFanOffCommand();
    static Command garageDoorOpen = new GarageUpCommand();
    static Command garageDoorClose = new GarageDownCommand();
    static Command stereoOn = new StereoOnWithCDCommand();
    static Command stereoOff = new StereoOffCommand();
    static Command noCommand = new NoCommand();

    public static void main(String[] args) {
        remoteControl = new RemoteControl();

        remoteControl.setCommand(0, lightOnRoom, lightOffRoom);
        remoteControl.setCommand(1, lightOnKitchen, lightOffKitchen);
        remoteControl.setCommand(2, ceillingFanHigh, ceillingFanOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, stereoOn, stereoOff);
        remoteControl.setCommand(5, noCommand, noCommand);
        remoteControl.setCommand(6, noCommand, noCommand);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(4);
    }
}
