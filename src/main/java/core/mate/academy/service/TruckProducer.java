package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;
import core.mate.academy.model.Truck;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> list = new ArrayList<>();
        list.add(new Truck());
        list.add(new Truck());
        return list;
    }
}
