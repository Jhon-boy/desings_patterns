package behavior_patterns.observer.example1;

import java.util.ArrayList;
import java.util.List;


/***
 * Class implements suscriptors whit observer and notify when the state changes
 * */
public class YouTobeChanel  implements Subject {

    List<Observer> suscriptors = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        suscriptors.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        suscriptors.remove(observer);
    }


    @Override
    public void notifyObservers(String message) {
        for (Observer observer: suscriptors)
            observer.update(message);
    }

    public  void uploadVideo(String title){
        System.out.println("Uploading videooo.....");
        notifyObservers("New Video: " + title);
    }

}
