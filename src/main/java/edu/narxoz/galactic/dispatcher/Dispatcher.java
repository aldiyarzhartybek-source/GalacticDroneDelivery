package edu.narxoz.galactic.dispatcher;

import edu.narxoz.galactic.drones.Drone;
import edu.narxoz.galactic.drones.DroneStatus;
import edu.narxoz.galactic.task.DeliveryTask;
import edu.narxoz.galactic.task.TaskState;

public class Dispatcher {

    public Result assign(Drone drone, DeliveryTask task) {
        if (drone == null) return Result.fail("Drone is null");
        if (task == null) return Result.fail("Task is null");

        if (drone.getStatus() != DroneStatus.IDLE) {
            task.setState(TaskState.FAILED);
            return Result.fail("Drone is not IDLE");
        }

        if (task.getCargo().getWeightKg() > drone.getMaxLoadKg()) {
            task.setState(TaskState.FAILED);
            return Result.fail("Cargo is too heavy for this drone");
        }

        // назначили
        drone.setStatus(DroneStatus.BUSY);
        task.setState(TaskState.IN_PROGRESS);
        return Result.success();
    }

    public void complete(Drone drone, DeliveryTask task) {
        if (drone == null || task == null) return;
        task.setState(TaskState.DONE);
        drone.setStatus(DroneStatus.IDLE);
    }
}
