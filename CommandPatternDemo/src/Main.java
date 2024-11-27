//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Command lightOn = new CommandLightON(livingRoomLight);
        Command lightOff = new CommandLightOFF(livingRoomLight);
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOn);
        remoteControl.pressButton();

        remoteControl.pressUndo();
        // Undo the action
        remoteControl.setCommand(lightOff);
        remoteControl.pressUndo();
    }
}