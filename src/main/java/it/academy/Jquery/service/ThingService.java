package it.academy.Jquery.service;

import it.academy.Jquery.model.Thing;

import java.util.List;

public interface ThingService {
    Thing getThing(int id);
    List<Thing> getAllThings();
    Thing addThing(Thing t);
}
