package edu.narxoz.galactic.task;

import edu.narxoz.galactic.bodies.CelestialBody;
import edu.narxoz.galactic.cargo.Cargo;

public class DeliveryTask {
    private final String id;
    private final CelestialBody from;
    private final CelestialBody to;
    private final Cargo cargo;
    private TaskState state = TaskState.NEW;

    public DeliveryTask(String id, CelestialBody from, CelestialBody to, Cargo cargo) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id is empty");
        if (from == null || to == null) throw new IllegalArgumentException("from/to cannot be null");
        if (cargo == null) throw new IllegalArgumentException("cargo cannot be null");
        this.id = id;
        this.from = from;
        this.to = to;
        this.cargo = cargo;
    }

    public String getId() { return id; }
    public CelestialBody getFrom() { return from; }
    public CelestialBody getTo() { return to; }
    public Cargo getCargo() { return cargo; }

    public TaskState getState() { return state; }
    public void setState(TaskState state) { this.state = state; }

    public double routeDistance() {
        return from.distanceTo(to);
    }
}
