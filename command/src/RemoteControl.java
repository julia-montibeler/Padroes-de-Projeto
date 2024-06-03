public class RemoteControl {
    Command[] onCommands = new Command[7];
    Command[] offCommands = new Command[7];

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();

    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();

    }

    public String toString() {
        String str = "";
        for (int i = 0; i < onCommands.length; i++) {
            str += "slot "+i+": ";
            str += onCommands[i].toString()+", ";
            str += offCommands[i].toString()+"\n";
        }
        return str;
    }
}
