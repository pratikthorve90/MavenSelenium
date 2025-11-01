package DesignPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private Map<String, Prototype> prototypes = new HashMap<>();

    public void add(String name, Prototype prototype) {
        prototypes.put(name, prototype);
    }

    public Prototype get(String name) {
        Prototype prototype = prototypes.get(name);
        return prototype != null ? prototype.clone() : null;
    }
}
