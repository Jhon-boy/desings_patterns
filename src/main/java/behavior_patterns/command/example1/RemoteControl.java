package behavior_patterns.command.example1;

public class RemoteControl {

    private  Command command;

    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButtom(){
        if(command !=null){
            command.execute();
        } else {
            System.out.println("There are not commands registered");
        }
    }

}
