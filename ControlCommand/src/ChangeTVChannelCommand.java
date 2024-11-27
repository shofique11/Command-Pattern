public class ChangeTVChannelCommand implements Command{
    private TV tv;
    public ChangeTVChannelCommand(TV tv)
    {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
