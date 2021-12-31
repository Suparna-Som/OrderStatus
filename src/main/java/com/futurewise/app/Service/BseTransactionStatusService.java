package com.futurewise.app.Service;

import com.futurewise.app.Dao.TpTransactionDao;
import com.futurewise.app.Model.BseUser;
import com.futurewise.app.Model.OrderDetail;
import com.futurewise.app.Model.TpTransaction;
import com.futurewise.app.Utils.Constants;
import com.futurewise.app.config.SOAPConnector;
import com.futurewise.app.starmfservice.ObjectFactory;
import com.futurewise.app.starmfservice.OrderDetails;
import com.futurewise.app.starmfservice.OrderRequest;
import com.futurewise.app.Utils.OrderStatus;
import com.futurewise.app.Utils.Validator;

import java.util.ArrayList;
import java.util.List;

public class BseTransactionStatusService {
    TpTransactionDao tpTransactionDao;
    public OrderDetail checkAndUpdateTransactionStatus1(BseUser bseUser, TpTransaction tpTransaction , String Date, String TpTransactionNumber) throws Exception {
//        List<OrderDetail> orderDetailList = updateTransactionStatus(bseUser, DateUtils.getBseDateFormat(tpTransaction.getOrderDate()),  DateUtils.getBseDateFormat(tpTransaction.getOrderDate()), null, tpTransaction.getTransactionNumber());
        List<OrderDetail> orderDetailList = updateTransactionStatus1(bseUser, Date, Date, "P");

        if (Validator.isEmpty(orderDetailList)) {
            return null;
        } else {
            //  for (OrderDetail orderDetail : orderDetailList) {
            OrderDetail orderDetail = new OrderDetail();
            for (int i = 0; i < orderDetailList.size(); i++) {
                orderDetail = orderDetailList.get(i);
                System.out.println(orderDetail.getSipRegnNo());
                if (orderDetail.getSipRegnNo().equalsIgnoreCase(tpTransaction.getTransactionNumber())) {
                    tpTransactionDao.updateTransactionStatus1(orderDetail.getSipRegnNo(), orderDetail.getOrderStatusEnum().getValue(), orderDetail.getOrderStatusEnum().getOrderStatus(), orderDetail.getOrderRemarks(), orderDetail.getOrderNumber(), orderDetail.getClientCode());
                    break;
                }

            }
            return orderDetail;
        }
    }
    ObjectFactory objectFactory;
    SOAPConnector soapConnector;
    public List<OrderDetail> updateTransactionStatus1(BseUser bseUser, String startDate, String endDate,
                                                      String transactionType) throws Exception {
//        BseUserTokenModel bseUserTokenModel = bseUserService.getLoginPasswordTokenForStartMfService(bseUser);
        OrderStatus orderStatus = objectFactory.createOrderStatus();
//        startDate = "13/04/2021";
//        endDate = "20/04/2021";
        OrderRequest orderRequest = objectFactory.createOrderRequest();
        orderRequest.setUserId(objectFactory.createOrderRequestUserId(bseUser.getUserId()));
        orderRequest.setMemberCode(objectFactory.createOrderRequestMemberCode(bseUser.getMemberId()));
        orderRequest.setPassword(objectFactory.createOrderRequestPassword(bseUser.getPassword()));
        orderRequest.setFromDate(objectFactory.createOrderRequestFromDate(startDate));
        orderRequest.setToDate(objectFactory.createOrderRequestToDate(endDate));
//        orderRequest.setClientCode(objectFactory.createOrderRequestClientCode("WC10000145"));

        orderRequest.setOrderType(objectFactory.createOrderRequestOrderType("ALL"));/*All/NRM/SIP/XSIP/ISIP/STP/SWP*/
        orderRequest.setSubOrderType(objectFactory.createOrderRequestSubOrderType("ALL"));/*All/NRM/SPOR/SWITCH*/
        orderRequest.setOrderStatus(objectFactory.createOrderRequestOrderStatus("ALL"));/*All/VALID/INVALID*/
        orderRequest.setSettType(objectFactory.createOrderRequestSettType("ALL"));/*ALL/L0/L1/OTHERS*/
        orderRequest.setTransType(objectFactory.createOrderRequestTransType(transactionType));
        orderRequest.setOrderNo(objectFactory.createOrderRequestOrderNo(""));
        orderStatus.setParam(objectFactory.createOrderStatusParam(orderRequest));
        Object response = soapConnector.callWebService(Constants.START_MF_GET_ORDER_STATUS, orderStatus);
        if (response != null && response instanceof OrderStatusResponse) {
            OrderStatusResponse orderStatusResponse = (OrderStatusResponse) response;
            String statusCode = orderStatusResponse.getOrderStatusResult().getValue().getStatus().getValue();
            if (statusCode.equalsIgnoreCase("100")) {
                List<OrderDetail> outputList = new ArrayList<>();
                List<OrderDetails> orderDetailsList = orderStatusResponse.getOrderStatusResult().getValue().getOrderDetails().getValue().getOrderDetails();
                for (OrderDetails orderDetails : orderDetailsList) {
                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setOrderNumber(orderDetails.getOrderNumber().getValue());
                    orderDetail.setOrderStatus(orderDetails.getOrderStatus().getValue());
                    orderDetail.setAllUnits(orderDetails.getALLUnits().getValue());

//
                    orderDetail.setAmount(orderDetails.getAmount().getValue());
                    orderDetail.setBuySell(orderDetails.getBuySell().getValue());
                    orderDetail.setClientCode(orderDetails.getClientCode().getValue());
                    orderDetail.setDate(orderDetails.getDate().getValue());
                    orderDetail.setBuySellType(orderDetails.getBuySellType().getValue());
                    orderDetail.setClientName(orderDetails.getClientName().getValue());
                    orderDetail.setDpc(orderDetails.getDPC().getValue());
                    orderDetail.setDpFolioNo(orderDetails.getDPFolioNo().getValue());
                    orderDetail.setDpTrans(orderDetails.getDPTrans().getValue());
                    orderDetail.setEuin(orderDetails.getEUIN().getValue());
                    orderDetail.setEuinDecl(orderDetails.getEUINDecl().getValue());
                    orderDetail.setEntryBy(orderDetails.getEntryBy().getValue());
                    orderDetail.setFirstOrder(orderDetails.getFirstOrder().getValue());
                    orderDetail.setFolioNo(orderDetails.getFolioNo().getValue());
                    orderDetail.setIsin(orderDetails.getISIN().getValue());
                    orderDetail.setInternalRefNo(orderDetails.getInternalRefNo().getValue());
                    orderDetail.setKycFlag(orderDetails.getKYCFlag().getValue());
                    orderDetail.setMinRedeemFlag(orderDetails.getMINRedeemFlag().getValue());
                    orderDetail.setMemberCode(orderDetails.getMemberCode().getValue());
                    orderDetail.setMemberRemarks(orderDetails.getMemberRemarks().getValue());
                    orderDetail.setOrderNumber(orderDetails.getOrderNumber().getValue());
                    orderDetail.setOrderRemarks(orderDetails.getOrderRemarks().getValue());
                    orderDetail.setOrderType(orderDetails.getOrderType().getValue());

                    orderDetail.setSipRegnDate(orderDetails.getSIPRegnDate().getValue());
                    orderDetail.setSipRegnNo(orderDetails.getSIPRegnNo().getValue());
                    orderDetail.setSchemeCode(orderDetails.getSchemeCode().getValue());
                    orderDetail.setSchemeName(orderDetails.getSchemeName().getValue());

                    orderDetail.setSettNo(orderDetails.getSettNo().getValue());
                    orderDetail.setSettType(orderDetails.getSettType().getValue());
                    orderDetail.setSubBrCode(orderDetails.getSubBrCode().getValue());
                    orderDetail.setSubBrokerARNCode(orderDetails.getSubBrokerARNCode().getValue());

                    orderDetail.setSubOrderType(orderDetails.getSubOrderType().getValue());
                    orderDetail.setTime(orderDetails.getTime().getValue());
                    orderDetail.setUnits(orderDetails.getUnits().getValue());
                    outputList.add(orderDetail);
                    com.futurewise.app.enums.OrderStatus orderStatusEnum = com.futurewise.app.enums.OrderStatus.UNKNOWN;
                    if (orderDetail.getOrderStatus().equalsIgnoreCase("VALID")) {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.PENDING_AUTHORIZATION;
                    } else {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.REJECTED;
                    }
                    if (orderDetail.getOrderRemarks().equalsIgnoreCase("PENDING")) {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.PENDING_RTA;
                    } else if (orderDetail.getOrderRemarks().equalsIgnoreCase("OTP Authorised")) {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.OTP_AUTHORISED;
                    } else if (orderDetail.getOrderRemarks().equalsIgnoreCase("COMPLETE")) {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.SUCCESS;
                    } else if (orderDetail.getOrderRemarks().equalsIgnoreCase("SENT TO RTA FOR VALIDATION")) {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.SUBMITTED_RTA;
                    } else if (orderDetail.getOrderRemarks().equalsIgnoreCase("ALLOTMENT DONE")) {
                        orderStatusEnum = com.futurewise.app.enums.OrderStatus.SUCCESS;
                    }
//
                    orderDetail.setOrderStatusEnum(orderStatusEnum);
//                    orderDetails.
//                    logger.debug(orderId + "   " + orderStatusValue);
                }
                return outputList;
            } else {
                String message = orderStatusResponse.getOrderStatusResult().getValue().getMessage().getValue();
                throw new FuturewiseAppException(message);

            }
            //            arrayOfOrderDetails.getOrderDetails();
        }
//        orderRequest.setT eyJpZCI6NjcyfQ

        return null;
    }

}
