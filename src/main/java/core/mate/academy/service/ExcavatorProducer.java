package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;
import core.mate.academy.model.Excavator;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(new Excavator());
        list.add(new Excavator());
        return list;
    }
}
