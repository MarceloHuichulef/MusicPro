package cl.duoc.msprodbff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msprodbff.model.dto.CommonResponse;
import cl.duoc.msprodbff.model.dto.webpay.WebPayTransactionInitRequest;
import cl.duoc.msprodbff.services.VentaService;

@RestController
@RequestMapping("/ventas-bff")
public class VentaController {
    @Autowired
    VentaService ventaService;

    @PostMapping(path = "/crear-transaccion", consumes = {"application/json"}, produces = {"application/json"})
    public CommonResponse add(@RequestBody WebPayTransactionInitRequest request){
        return ventaService.generarTransaccion(request);
    }
}
