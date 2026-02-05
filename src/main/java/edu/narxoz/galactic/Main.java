package edu.narxoz.galactic;

import edu.narxoz.galactic.bodies.Planet;

public class Main {
    public static void main(String[] args) {
        Planet a = new Planet("A", 0, 0);
        Planet b = new Planet("B", 3, 4);
        System.out.println(a.distanceTo(b));
    }
}
