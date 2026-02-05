package edu.narxoz.galactic.dispatcher;

public final class Result {
    private final boolean ok;
    private final String reason;

    public Result(boolean ok, String reason) {
        this.ok = ok;
        this.reason = reason;
    }

    public boolean ok() {
        return ok;
    }

    public String reason() {
        return reason;
    }

    public static Result success() {
        return new Result(true, null);
    }

    public static Result fail(String reason) {
        return new Result(false, (reason == null || reason.isBlank()) ? "Unknown error" : reason);
    }
}
