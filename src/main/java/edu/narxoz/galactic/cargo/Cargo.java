package edu.narxoz.galactic.cargo;

public class Cargo {
    private final String id;
    private final double weightKg;

    public Cargo(String id, double weightKg) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("id is empty");
        if (weightKg < 0) throw new IllegalArgumentException("weightKg must be >= 0");
        this.id = id;
        this.weightKg = weightKg;
    }

    public String getId() {
        return id;
    }

    public double getWeightKg() {
        return weightKg;
    }
}
