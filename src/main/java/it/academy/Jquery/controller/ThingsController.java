package it.academy.Jquery.controller;


import it.academy.Jquery.model.Thing;
import it.academy.Jquery.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ThingsController {
    @Autowired
    ThingService thingService;

    @GetMapping("/{id}")
    public Thing getThingById(@PathVariable int id) {
        return thingService.getThing(id);
    }

    @GetMapping("/all")
    public List<Thing> getAll() {
        return thingService.getAllThings();
    }

    @CrossOrigingii
    @PostMapping
    public Thing createThing(@RequestBody Thing t) {
        return thingService.addThing(t);
    }

}