package it.academy.Jquery.service;

import it.academy.Jquery.model.Thing;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ThingServiceImpl implements ThingService {
    private static List<Thing> things = new ArrayList<>();

    static {
        things.add(new Thing(1, "Bishkek"));
        things.add(new Thing(2, "Almaty"));
        things.add(new Thing(3, "Nur-Sultan"));
    }

    @Override
    public Thing getThing(int id) {
        return things.stream()
                .filter(t -> t.getId() == id)
                .findFirst().get();
    }

    @Override
    public List<Thing> getAllThings() {
        return things;
    }

    @Override
    public Thing addThing(Thing t) {
        things.add(t);
        return t;
    }
}
