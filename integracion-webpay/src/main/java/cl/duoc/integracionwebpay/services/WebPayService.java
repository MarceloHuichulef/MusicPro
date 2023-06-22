package cl.duoc.integracionwebpay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cl.duoc.integracionwebpay.clients.WebPayFeignClient;
import cl.duoc.integracionwebpay.model.dto.WebPayTransactionInitRequest;
import cl.duoc.integracionwebpay.model.dto.WebPayTransactionInitResponse;


@Service
public class WebPayService {
    @Autowired
    WebPayFeignClient WebPayFeignClient;

    @Value("${webpay.headers.api-key-id}")
    private String webPayApiKeyId;

    @Value("${webpay-headers.api-key-secret}")
    private String webPayApiKeySecret;

    public WebPayTransactionInitResponse initTransaction(WebPayTransactionInitRequest request){
        return WebPayFeignClient.initTransaction(webPayApiKeyId, webPayApiKeySecret, request);
    }
}
