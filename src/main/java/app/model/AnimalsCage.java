package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    @Autowired
    private Timer timer;
    public Timer getTimer() {
        return timer;
    }

    @Autowired
    @Qualifier ("dog")
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");

        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }
}
