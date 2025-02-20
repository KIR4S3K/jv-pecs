package core.mate.academy;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MachineService machineService = new MachineServiceImpl();

        List<Bulldozer> bulldozers = machineService.getAll(Bulldozer.class);
        machineService.startWorking(bulldozers);

        List<Excavator> excavators = machineService.getAll(Excavator.class);
        machineService.startWorking(excavators);

        List<Truck> trucks = machineService.getAll(Truck.class);
        machineService.startWorking(trucks);

        machineService.fill(bulldozers, new Bulldozer());
        machineService.startWorking(bulldozers);
    }
}
