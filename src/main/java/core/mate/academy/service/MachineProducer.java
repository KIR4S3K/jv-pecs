package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Machine;

public interface MachineProducer<T extends Machine> {
    List<T> get();
}
