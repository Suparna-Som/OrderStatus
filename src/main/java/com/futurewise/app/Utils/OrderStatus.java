package com.futurewise.app.Utils;

import com.futurewise.app.starmfservice.OrderRequest;

import javax.xml.bind.JAXBElement;

public enum OrderStatus {
        UNKNOWN("UNKNOWN", 0),
        FAILURE("FAILURE", 1),
        /**
         * PAYMENT NOT INITIATED FOR GIVEN ORDER
         */
        PENDING_AUTHORIZATION("PENDING AUTHORIZATION", 2),
        OTP_AUTHORISED("OTP AUTHORISED", 3),
        PENDING_RTA("Pending submission to AMC", 4),

        /**
         * AWAITING FOR FUNDS CONFIRMATION (Mode)
         */
        SUBMITTED_RTA("Order submitted to AMC", 5),

        PROCESSED_RTA("Order processed", 6),

        REJECTED("Transaction rejected", 7),
        /**
         * APPROVED (Mode)
         */
        SUCCESS("SUCCESS", 8);
        private String orderStatus;
        private int value;

        OrderStatus(String orderStatus, int value) {
            this.orderStatus = orderStatus;
            this.value = value;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public int getValue() {
            return value;
        }

        public void setParam(JAXBElement<OrderRequest> orderStatusParam) {
        }
    }
