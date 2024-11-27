public class CommandLightOFF implements Command{
    private Light light;
    public CommandLightOFF(Light light){
         this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
