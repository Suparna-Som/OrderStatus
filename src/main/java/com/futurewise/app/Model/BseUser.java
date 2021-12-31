package com.futurewise.app.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BseUser {
    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getFamilyMemberId() {
        return familyMemberId;
    }

    public void setFamilyMemberId(long familyMemberId) {
        this.familyMemberId = familyMemberId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApiPassword() {
        return apiPassword;
    }

    public void setApiPassword(String apiPassword) {
        this.apiPassword = apiPassword;
    }

    public String getEuin() {
        return euin;
    }

    public void setEuin(String euin) {
        this.euin = euin;
    }

    public String getBrokerCode() {
        return brokerCode;
    }

    public void setBrokerCode(String brokerCode) {
        this.brokerCode = brokerCode;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }

    public Integer getDefaultLogin() {
        return defaultLogin;
    }

    public void setDefaultLogin(Integer defaultLogin) {
        this.defaultLogin = defaultLogin;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public long getTeamMemberSessionId() {
        return teamMemberSessionId;
    }

    public void setTeamMemberSessionId(long teamMemberSessionId) {
        this.teamMemberSessionId = teamMemberSessionId;
    }

    public String getSubBrokerCode() {
        return subBrokerCode;
    }

    public void setSubBrokerCode(String subBrokerCode) {
        this.subBrokerCode = subBrokerCode;
    }

    public String getKeyString() {
        return keyString;
    }

    public void setKeyString(String keyString) {
        this.keyString = keyString;
    }

    public String getSaltString() {
        return saltString;
    }

    public void setSaltString(String saltString) {
        this.saltString = saltString;
    }

    public Integer getOrderSerialNo() {
        return orderSerialNo;
    }

    public void setOrderSerialNo(Integer orderSerialNo) {
        this.orderSerialNo = orderSerialNo;
    }

    public int getInstaIinMode() {
        return instaIinMode;
    }

    public void setInstaIinMode(int instaIinMode) {
        this.instaIinMode = instaIinMode;
    }

    public Long getTpSubBrokerCredentialId() {
        return tpSubBrokerCredentialId;
    }

    public void setTpSubBrokerCredentialId(Long tpSubBrokerCredentialId) {
        this.tpSubBrokerCredentialId = tpSubBrokerCredentialId;
    }

    public long getTpUserCredentialId() {
        return tpUserCredentialId;
    }

    public void setTpUserCredentialId(long tpUserCredentialId) {
        this.tpUserCredentialId = tpUserCredentialId;
    }

    public Integer getTpNseSubBrokerMappingId() {
        return tpNseSubBrokerMappingId;
    }

    public void setTpNseSubBrokerMappingId(Integer tpNseSubBrokerMappingId) {
        this.tpNseSubBrokerMappingId = tpNseSubBrokerMappingId;
    }

    public Integer getTpNseCredentialId() {
        return tpNseCredentialId;
    }

    public void setTpNseCredentialId(Integer tpNseCredentialId) {
        this.tpNseCredentialId = tpNseCredentialId;
    }

    public boolean isOnlyBrokerCred() {
        return onlyBrokerCred;
    }

    public void setOnlyBrokerCred(boolean onlyBrokerCred) {
        this.onlyBrokerCred = onlyBrokerCred;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSearchkey() {
        return searchkey;
    }

    public void setSearchkey(int searchkey) {
        this.searchkey = searchkey;
    }

    public Long getTpNseUserCredFamilyMappingId() {
        return tpNseUserCredFamilyMappingId;
    }

    public void setTpNseUserCredFamilyMappingId(Long tpNseUserCredFamilyMappingId) {
        this.tpNseUserCredFamilyMappingId = tpNseUserCredFamilyMappingId;
    }

    public long getTpUserCredFamilyMappingId() {
        return tpUserCredFamilyMappingId;
    }

    public void setTpUserCredFamilyMappingId(long tpUserCredFamilyMappingId) {
        this.tpUserCredFamilyMappingId = tpUserCredFamilyMappingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private long familyMemberId;
    /*application_id for nse*/
    private String userId;


    private String memberId;

    private String password;

    /*api password*/
    private String apiPassword;

    private String euin;

    private String brokerCode;/*ARN/RIA code*/

    private long advisorId;


    private long adminId;


    /* 1 - Default, 0 - Secondary*/
    private Integer defaultLogin;

    public Integer getAggregatorType() {
        return aggregatorType;
    }

    public void setAggregatorType(Integer aggregatorType) {
        this.aggregatorType = aggregatorType;
    }

    /* 1 - NSE , 2 - BSE*/
    private Integer aggregatorType;

    /*1- ARN, 2 - RIA*/
    private int accountType;

    private long teamMemberSessionId;

    private String subBrokerCode;
    /*varchar 50*/
    @JsonIgnore
    private String keyString;

    /*varchar 30*/
    @JsonIgnore
    private String saltString;

    @JsonIgnore
    private Integer orderSerialNo;

    private int instaIinMode;

    private Long tpSubBrokerCredentialId;

    private long tpUserCredentialId;

    private Integer tpNseSubBrokerMappingId;

    private Integer tpNseCredentialId;

    private boolean onlyBrokerCred;

    private String clientCode;
    private String investorName;
    private int pageIndex;
    private int count;
    private int searchkey;
    private String searchvalue;

    private Long tpNseUserCredFamilyMappingId;

    private long tpUserCredFamilyMappingId;

    private String name;

    public String getSearchvalue() {
        return searchvalue;
    }

    public void setSearchvalue(String searchvalue) {
        this.searchvalue = searchvalue;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }


    private String errorMessage;

    public boolean getOnlyBrokerCred() {
        return onlyBrokerCred;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BseUser{");
        sb.append("clientId=").append(clientId);
        sb.append(", familyMemberId=").append(familyMemberId);
        sb.append(", userId='").append(userId).append('\'');
        sb.append(", memberId='").append(memberId).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", apiPassword='").append(apiPassword).append('\'');
        sb.append(", euin='").append(euin).append('\'');
        sb.append(", brokerCode='").append(brokerCode).append('\'');
        sb.append(", advisorId=").append(advisorId);
        sb.append(", defaultLogin=").append(defaultLogin);
        // sb.append(", investorName=").append(investorName);
        sb.append(", aggregatorType=").append(aggregatorType);
        sb.append(", accountType=").append(accountType);
        sb.append(", teamMemberSessionId=").append(teamMemberSessionId);
        sb.append(", subBrokerCode='").append(subBrokerCode).append('\'');
        sb.append(", keyString='").append(keyString).append('\'');
        sb.append(", saltString='").append(saltString).append('\'');
        sb.append(", orderSerialNo=").append(orderSerialNo);
        sb.append(", tpSubBrokerCredentialId=").append(tpSubBrokerCredentialId);
        sb.append(", tpUserCredentialId=").append(tpUserCredentialId);
        sb.append(", tpNseSubBrokerMappingId=").append(tpNseSubBrokerMappingId);
        sb.append(", tpNseCredentialId=").append(tpNseCredentialId);
        sb.append(", onlyBrokerCred=").append(onlyBrokerCred);
        sb.append(", clientCode='").append(clientCode).append('\'');
        sb.append(", tpNseUserCredFamilyMappingId=").append(tpNseUserCredFamilyMappingId);
        sb.append(", tpUserCredFamilyMappingId=").append(tpUserCredFamilyMappingId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", errorMessage='").append(errorMessage).append('\'');
        sb.append(", id=").append(id);
        sb.append(", createdOn=").append(createdOn);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }
    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }



}
