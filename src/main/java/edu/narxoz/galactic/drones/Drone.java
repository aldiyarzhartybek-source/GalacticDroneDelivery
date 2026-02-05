package edu.narxoz.galactic.drones;

public abstract class Drone {
    private final String id;
    private final double maxLoadKg;
    private DroneStatus status = DroneStatus.IDLE;

    protected Drone(String id, double maxLoadKg) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id is empty");
        if (maxLoadKg <= 0) throw new IllegalArgumentException("maxLoadKg must be > 0");
        this.id = id;
        this.maxLoadKg = maxLoadKg;
    }

    public String getId() { return id; }
    public double getMaxLoadKg() { return maxLoadKg; }

    public DroneStatus getStatus() { return status; }
    public void setStatus(DroneStatus status) { this.status = status; }
}
