package edu.narxoz.galactic.dispatcher;

public record Result(boolean ok, String reason) {
    public static Result success() {
        return new Result(true, null);
    }

    public static Result fail(String reason) {
        return new Result(false, (reason == null || reason.isBlank()) ? "Unknown error" : reason);
    }
}
