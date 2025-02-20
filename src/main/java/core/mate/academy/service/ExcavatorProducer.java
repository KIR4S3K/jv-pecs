package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;
import java.util.ArrayList;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator());
        list.add(new Excavator());
        return list;
    }
}
