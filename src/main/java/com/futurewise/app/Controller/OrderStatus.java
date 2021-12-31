package com.futurewise.app.Controller;

import com.futurewise.app.Exception.FuturewiseAppException;
import com.futurewise.app.Model.ResponseBean;
import com.futurewise.app.Service.ReportService;
import com.futurewise.app.Utils.EncryptionUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/refresh")


public class OrderStatus {
    @Autowired
    ReportService reportService;
    @RequestMapping(value = "/transaction/status/get", method = RequestMethod.GET)
    public ResponseBean checkAndUpdateTransactionStatus(@RequestParam String query, @PathVariable String deviceType) throws JsonProcessingException, FuturewiseAppException {
        ResponseBean responseBean = new ResponseBean();
        try {
            String decodedString = EncryptionUtil.base64Decode(query);
            JSONObject jsonObject = new JSONObject(decodedString);
            responseBean.setStatus(HttpStatus.OK.value());
            if (deviceType.equalsIgnoreCase("test")) {
                responseBean.setPayLoad(reportService.checkAndUpdateTransactionStatus1(jsonObject.optLong("id")), false);
            } else {
                responseBean.setPayLoad(reportService.checkAndUpdateTransactionStatus1(jsonObject.optLong("id")), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new FuturewiseAppException(e.getMessage());
        }
        return responseBean;
    }


}
