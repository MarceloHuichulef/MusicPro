package cl.duoc.msprodbff.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.msprodbff.model.dto.Instrumento;

@Component

@FeignClient(name = "svc-instruments", url = "http://localhost:8181/instrumentos")
public interface InstrumentsFeignClient {
    @GetMapping(path = "/instrumento", produces = {"application/json"})
    public List<Instrumento> getAll();

    @PostMapping(path = "/instrumento", consumes = {"application/json"}, produces = {"application/json"})
    public Instrumento add(@RequestBody Instrumento instrumento);
}
