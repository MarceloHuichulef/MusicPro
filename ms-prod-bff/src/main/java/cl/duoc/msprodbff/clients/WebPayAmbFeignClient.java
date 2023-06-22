package cl.duoc.msprodbff.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.msprodbff.model.dto.webpay.WebPayTransactionInitRequest;
import cl.duoc.msprodbff.model.dto.webpay.WebPayTransactionInitResponse;

@FeignClient(name = "svc-webpay-amb", url = "http://localhost:8282/webpay-amb")
public interface WebPayAmbFeignClient {
    @PostMapping(path = "/transactions", produces = {"application/json"})
    public WebPayTransactionInitResponse initTransaction(@RequestBody WebPayTransactionInitRequest request);
}