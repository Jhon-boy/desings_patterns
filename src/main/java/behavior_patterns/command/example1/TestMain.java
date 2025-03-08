package behavior_patterns.command.example1;

public class TestMain {

    public static void main(String[] args) {
        Tv tv = new Tv();
        Lights lights = new Lights();


        Command turnOnTv = new TurnOffTVCommand(tv);
        Command turnOnLights = new TurnOnLightsCommand(lights);
        Command turnOffTv = new TurnOffTVCommand(tv);
        //Command turnOffLights = new TurnOffLightsCommand(lights);

        RemoteControl remoteControl = new RemoteControl();
        //Turn on TV
        remoteControl.setCommand(turnOffTv);
        remoteControl.pressButtom();


        //Turn on Lights
        remoteControl.setCommand(turnOnLights);
    }

}
