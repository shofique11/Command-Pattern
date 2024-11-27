//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Command changeChannel = new ChangeTVChannelCommand(tv);
        changeChannel.execute();
        Command tvOn = new TurnOnCommand(tv);
        tvOn.execute();
        Command tvOff = new TurnOffCommand(tv);
        tvOff.execute();
        Fan fan = new Fan();
        Command fanOn = new TurnOnCommand(fan);
        fanOn.execute();
        Command fanOff = new TurnOffCommand(fan);
        fanOff.execute();

    }
}