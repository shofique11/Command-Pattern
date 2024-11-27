// Concrete Command to turn on the light
public class CommandLightON implements Command{
    private Light light;

    public CommandLightON(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
      light.turnOn();
    }
    @Override
    public void undo() {
        light.turnOff();
    }
}
