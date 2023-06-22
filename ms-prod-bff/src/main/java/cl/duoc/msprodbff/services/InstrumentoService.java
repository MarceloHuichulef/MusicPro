package cl.duoc.msprodbff.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.duoc.msprodbff.clients.InstrumentsFeignClient;
import cl.duoc.msprodbff.model.dto.Instrumento;

@Service
public class InstrumentoService {
    @Autowired
    InstrumentsFeignClient instrumentsFeignClient;

    public List<Instrumento> getAll(){
        return instrumentsFeignClient.getAll();
    }
    public Instrumento add(Instrumento instrumento){
        return instrumentsFeignClient.add(instrumento);
    }
}
