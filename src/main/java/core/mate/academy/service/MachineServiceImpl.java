package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;

import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    private final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckProducer = new TruckProducer();

    @Override
    public <T extends Machine> List<T> getAll(Class<T> type) {
        if (Bulldozer.class.equals(type)) {
            return (List<T>) bulldozerProducer.get();
        } else if (Excavator.class.equals(type)) {
            return (List<T>) excavatorProducer.get();
        } else if (Truck.class.equals(type)) {
            return (List<T>) truckProducer.get();
        }
        throw new IllegalArgumentException("Unknown machine type: " + type);
    }

    @Override
    public <T extends Machine> void fill(List<T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
