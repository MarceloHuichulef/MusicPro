package cl.duoc.integracionwebpay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.integracionwebpay.model.dto.WebPayTransactionInitRequest;
import cl.duoc.integracionwebpay.model.dto.WebPayTransactionInitResponse;
import cl.duoc.integracionwebpay.services.WebPayService;

@RestController
@RequestMapping("/webpay-amb")
public class WebPayController {
    @Autowired
    WebPayService webPayService;

    @PostMapping(path = "/transactions", produces = { "application/json" })
    public WebPayTransactionInitResponse initTransaction(@RequestBody WebPayTransactionInitRequest request){
        return webPayService.initTransaction(request);
    }
}
