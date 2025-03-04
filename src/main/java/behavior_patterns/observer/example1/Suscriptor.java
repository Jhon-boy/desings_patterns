package behavior_patterns.observer.example1;


/**
 *  The suscriptor will get notifications
 * */
public class Suscriptor implements Observer {
    private String message;

    public Suscriptor(String message) {
        this.message = message;
    }

    @Override
    public void update(String message){
        System.out.println("Suscriptor recibió el mensaje: " + this.message);
    }

}
