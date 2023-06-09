package cl.duoc.integracionwebpay.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cl.duoc.integracionwebpay.model.dto.WebPayTransactionInitRequest;
import cl.duoc.integracionwebpay.model.dto.WebPayTransactionInitResponse;

@FeignClient(name = "svc-webpay", url = "https://webpay3gint.transbank.cl")
public interface WebPayFeignClient {
    @PostMapping(path = "/rswebpaytransaction/api/webpay/v1.2/transactions", produces = { "application/json" })
    public WebPayTransactionInitResponse initTransaction(@RequestHeader("Tbk-Api-Key-Id") String apiKeyId,
        @RequestHeader("Tbk-Api-Key-Secret") String apiKeySecret,
        @RequestBody WebPayTransactionInitRequest request);
}
