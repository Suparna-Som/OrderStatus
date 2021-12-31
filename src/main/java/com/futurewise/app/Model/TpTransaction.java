package com.futurewise.app.Model;

import java.util.List;

public class TpTransaction {
    private int advisorId;
    private long familyMemberId;
    private long clientId;
    private String uniqueNo;
    private String transactionNumber;
    private String clientName;
    private String folio;
    private String schemeCode;
    private String schemeName;
    private Float amount;
    private Float quantity;
    private String amtUnitType;
    private String paymentLink;
    private Integer status;
    private String statusDesc;
    private String transactionType;
    private String subTransactionType;
    private String targetSchemeCode;
    private String targetProductName;
    private String clientCode;
    private long orderDate;
    private String returnMessage;
    private String serviceMessage;
    private Integer aggregatorType;
    private String brokerCode;
    private long startDate;
    private long endDate;
    private String holdingNature;
    private boolean perpetualFlag;
    private String euin;
    private long transactionInitiationTime;
    private String bankName;
    private String bankAccountType;
    private String bankAccountNumber;
    private String paymentMode;
    private String umrn;
    private String frequency;
    private int noOfInstallments;

    private String bankLogoUrl;
    private int orderStatusUpdate;

    public int getOrderStatusUpdate() {
        return orderStatusUpdate;
    }

    public void setOrderStatusUpdate(int orderStatusUpdate) {
        this.orderStatusUpdate = orderStatusUpdate;
    }

    /**
     * Extras
     */

    private long tpUserCredentialId;
    private int limit = 0;
    private List<Long> advisorIds;
    private List<Long> clientIds;

    public int getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(int advisorId) {
        this.advisorId = advisorId;
    }

    public long getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(long familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


    public String getBankLogoUrl() { return bankLogoUrl; }

    public void setBankLogoUrl(String bankLogoUrl) { this.bankLogoUrl = bankLogoUrl; }


    public String getUniqueNo() {
        return uniqueNo;
    }

    public void setUniqueNo(String uniqueNo) {
        this.uniqueNo = uniqueNo;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getSchemeCode() {
        return schemeCode;
    }

    public void setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public String getAmtUnitType() {
        return amtUnitType;
    }

    public void setAmtUnitType(String amtUnitType) {
        this.amtUnitType = amtUnitType;
    }

    public String getPaymentLink() {
        return paymentLink;
    }

    public void setPaymentLink(String paymentLink) {
        this.paymentLink = paymentLink;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getSubTransactionType() {
        return subTransactionType;
    }

    public void setSubTransactionType(String subTransactionType) {
        this.subTransactionType = subTransactionType;
    }

    public String getTargetSchemeCode() {
        return targetSchemeCode;
    }

    public void setTargetSchemeCode(String targetSchemeCode) {
        this.targetSchemeCode = targetSchemeCode;
    }

    public String getTargetProductName() {
        return targetProductName;
    }

    public void setTargetProductName(String targetProductName) {
        this.targetProductName = targetProductName;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getServiceMessage() {
        return serviceMessage;
    }

    public void setServiceMessage(String serviceMessage) {
        this.serviceMessage = serviceMessage;
    }

    public Integer getAggregatorType() {
        return aggregatorType;
    }

    public void setAggregatorType(Integer aggregatorType) {
        this.aggregatorType = aggregatorType;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

    public long getTpUserCredentialId() {
        return tpUserCredentialId;
    }

    public String getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode;
    }

    public void setTpUserCredentialId(long tpUserCredentialId) {
        this.tpUserCredentialId = tpUserCredentialId;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public String getHoldingNature() {
        return holdingNature;
    }

    public void setHoldingNature(String holdingNature) {
        this.holdingNature = holdingNature;
    }

    public String getEuin() {
        return euin;
    }

    public void setEuin(String euin) {
        this.euin = euin;
    }

    public long getTransactionInitiationTime() {
        return transactionInitiationTime;
    }

    public void setTransactionInitiationTime(long transactionInitiationTime) {
        this.transactionInitiationTime = transactionInitiationTime;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getUmrn() {
        return umrn;
    }

    public void setUmrn(String umrn) {
        this.umrn = umrn;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getNoOfInstallments() {
        return noOfInstallments;
    }

    public void setNoOfInstallments(int noOfInstallments) {
        this.noOfInstallments = noOfInstallments;
    }

    public boolean isPerpetualFlag() {
        return perpetualFlag;
    }

    public void setPerpetualFlag(boolean perpetualFlag) {
        this.perpetualFlag = perpetualFlag;
    }

    public List<Long> getAdvisorIds() {
        return advisorIds;
    }

    public void setAdvisorIds(List<Long> advisorIds) {
        this.advisorIds = advisorIds;
    }

    public List<Long> getClientIds() {
        return clientIds;
    }

    public void setClientIds(List<Long> clientIds) {
        this.clientIds = clientIds;
    }
}
