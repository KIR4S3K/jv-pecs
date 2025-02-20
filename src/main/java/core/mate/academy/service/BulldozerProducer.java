package core.mate.academy.service;

import java.util.ArrayList;
import java.util.List;
import core.mate.academy.model.Bulldozer;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> list = new ArrayList<>();
        list.add(new Bulldozer());
        list.add(new Bulldozer());
        return list;
    }
}
