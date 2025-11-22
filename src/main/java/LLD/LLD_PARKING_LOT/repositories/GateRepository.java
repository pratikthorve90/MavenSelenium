package LLD.LLD_PARKING_LOT.repositories;

import LLD.LLD_PARKING_LOT.models.Gate;

import javax.swing.text.html.Option;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {

    // ALL queries that perform operation on Gate table belong here.
    private Map<Long,Gate> gates = new TreeMap<>();

    public Optional<Gate> findGateById(Long id){
        // Return Gate for the provided Gate ID
        if(gates.containsKey(id)){
            return Optional.of(gates.get(id));
        }
        return Optional.empty();
    }

}
