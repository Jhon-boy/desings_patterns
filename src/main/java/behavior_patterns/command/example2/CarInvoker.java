package behavior_patterns.command.example2;

import java.util.Stack;

public class CarInvoker {

    private Stack<Command> history = new Stack<>();

    public  void executeCommand(Command command){
        command.execute();
        history.push(command);
    }

    public void undoLastCommand(){
        if(!history.isEmpty()){
          Command lastCommand = history.pop();
          lastCommand.undo();
        } else{
            System.out.println("There are not any commands");
        }
    }
}
