package task1;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<MotorTransport> motorTransports = new ArrayDeque<>();

    private void add(MotorTransport motorTransport) {
        motorTransports.offer(motorTransport);
    }

    public void addCar(Car car) {
        add(car);
    }

    public void addTruck(Truck truck) {
        add(truck);
    }

    public void service() {
        if (!motorTransports.isEmpty()) {
            MotorTransport motorTransport = motorTransports.poll();
            boolean result = motorTransport.service();
            if (!result) {
                motorTransport.repair();
            }
        }
    }
}
