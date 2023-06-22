package cl.duoc.msprodbff.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msprodbff.clients.WebPayAmbFeignClient;
import cl.duoc.msprodbff.model.dto.CommonHeader;
import cl.duoc.msprodbff.model.dto.CommonResponse;
import cl.duoc.msprodbff.model.dto.webpay.WebPayTransactionInitRequest;
import cl.duoc.msprodbff.model.dto.webpay.WebPayTransactionInitResponse;

@Service
public class VentaService {
    @Autowired
    WebPayAmbFeignClient webPayAmbFeignClient;

    public CommonResponse generarTransaccion(WebPayTransactionInitRequest request){
        CommonResponse commonResponse = new CommonResponse();
        WebPayTransactionInitResponse transactionInitResponse = webPayAmbFeignClient.initTransaction(request);

        CommonHeader commonHeader = new CommonHeader();
        commonHeader.setCode("0");
        commonHeader.setMessage("Transaction created");

        commonResponse.setData(commonHeader);
        commonResponse.setData(transactionInitResponse);
        return commonResponse;
    }
}
