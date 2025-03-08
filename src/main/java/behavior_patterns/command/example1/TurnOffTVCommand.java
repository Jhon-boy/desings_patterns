package behavior_patterns.command.example1;

public class TurnOffTVCommand implements Command{
    private Tv tv;


    public TurnOffTVCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
