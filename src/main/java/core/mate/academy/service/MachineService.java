package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Machine;

public interface MachineService<T extends Machine> {
    <T extends Machine> List<T> getAll(Class<T> type);
    <T extends Machine> void fill(List<T> machines, T value);
    void startWorking(List<? extends Machine> machines);
}
