package behavior_patterns.command.example1;

public class TurnOnLightsCommand implements Command {
    private Lights lights;

    public TurnOnLightsCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.turnOn();
    }
}
