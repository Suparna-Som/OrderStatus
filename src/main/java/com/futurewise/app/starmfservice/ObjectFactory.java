
package com.futurewise.app.starmfservice;

import com.futurewise.app.servicei.ObjectFactoryI;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.futurewise.app.bse.wsdl.starmfservice package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@Service(value = "ObjectFactoryStarMf")
@XmlRegistry
public class ObjectFactory implements ObjectFactoryI {

    private final static QName _MFAPIRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MFAPIRequest");
    private final static QName _PasswordRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "PasswordRequest");
    private final static QName _ProvOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ProvOrderDetails");
    private final static QName _AOFPanSearchResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AOFPanSearchResponse");
    private final static QName _AllotmentStatementRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllotmentStatementRequest");
    private final static QName _AllotmentStatementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllotmentStatementResponse");
    private final static QName _MandateDetailsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateDetailsResponse");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _RedemptionStatementRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RedemptionStatementRequest");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ArrayOfMandateDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfMandateDetails");
    private final static QName _OrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderRequest");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ArrayOfAllotmentDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfAllotmentDetails");
    private final static QName _EMandateAuthURLRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EMandateAuthURLRequest");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ArrayOfChildOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfChildOrderDetails");
    private final static QName _ChildOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ChildOrderDetails");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ArrayOfRedemptionDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfRedemptionDetails");
    private final static QName _RedemptionDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RedemptionDetails");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _OrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderDetails");
    private final static QName _AOFPanSearchRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AOFPanSearchRequest");
    private final static QName _ArrayOfOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfOrderDetails");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _MandateDetailsRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateDetailsRequest");
    private final static QName _ChildOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ChildOrderResponse");
    private final static QName _Response_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Response");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfProvOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ArrayOfProvOrderDetails");
    private final static QName _ImageResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ImageResponseStatus");
    private final static QName _MandateDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateDetails");
    private final static QName _EMandateAuthURLResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EMandateAuthURLResponse");
    private final static QName _ChildOrderRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ChildOrderRequest");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _OrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderResponse");
    private final static QName _ProvOrderResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ProvOrderResponse");
    private final static QName _ImageUploadStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ImageUploadStatus");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _RedemptionStatementResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RedemptionStatementResponse");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _AllotmentDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllotmentDetails");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _EMandateAuthURLResponseEMandateAuthURLResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "EMandateAuthURLResult");
    private final static QName _AllotmentStatementResponseAllotmentStatementResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "AllotmentStatementResult");
    private final static QName _EMandateAuthURLParam_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "Param");
    private final static QName _ProvOrderResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Status");
    private final static QName _ProvOrderResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Message");
    private final static QName _ProvOrderResponseProvOrderDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "provOrderDetails");
    private final static QName _ChildOrderRequestRegnNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RegnNo");
    private final static QName _ChildOrderRequestClientCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ClientCode");
    private final static QName _ChildOrderRequestSystematicPlanType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SystematicPlanType");
    private final static QName _ChildOrderRequestEncryptedPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EncryptedPassword");
    private final static QName _ChildOrderRequestDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Date");
    private final static QName _ChildOrderRequestMemberCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MemberCode");
    private final static QName _EMandateAuthURLRequestMandateID_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateID");
    private final static QName _EMandateAuthURLRequestUserId_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "UserId");
    private final static QName _EMandateAuthURLRequestPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Password");
    private final static QName _MFAPIMobileResponseMFAPIMobileResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "MFAPIMobileResult");
    private final static QName _GetAccessTokenResponseGetAccessTokenResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "GetAccessTokenResult");
    private final static QName _ChildOrderDetailsResponseChildOrderDetailsResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "ChildOrderDetailsResult");
    private final static QName _ChildOrderDetails2ClientName_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ClientName");
    private final static QName _ChildOrderDetails2OrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderType");
    private final static QName _ChildOrderDetails2FirstOrderTodayFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "FirstOrderTodayFlag");
    private final static QName _ChildOrderDetails2SchemeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SchemeName");
    private final static QName _ChildOrderDetails2SubBrokerCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SubBrokerCode");
    private final static QName _ChildOrderDetails2SubBrokerARNCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SubBrokerARNCode");
    private final static QName _ChildOrderDetails2SubOrderType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SubOrderType");
    private final static QName _ChildOrderDetails2EUINFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EUINFlag");
    private final static QName _ChildOrderDetails2EUINNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EUINNumber");
    private final static QName _ChildOrderDetails2KYCFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "KYCFlag");
    private final static QName _ChildOrderDetails2Amount_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Amount");
    private final static QName _ChildOrderDetails2RTASchemeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RTASchemeCode");
    private final static QName _ChildOrderDetails2BuySellType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BuySellType");
    private final static QName _ChildOrderDetails2Quantity_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Quantity");
    private final static QName _ChildOrderDetails2BuySell_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BuySell");
    private final static QName _ChildOrderDetails2DPTxnType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "DPTxnType");
    private final static QName _ChildOrderDetails2OrderNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderNumber");
    private final static QName _ChildOrderDetails2FolioNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "FolioNo");
    private final static QName _ChildOrderDetails2BSESchemeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BSESchemeCode");
    private final static QName _ChildOrderDetails2IntRefNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "IntRefNo");
    private final static QName _AllotmentDetailsSettNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SettNo");
    private final static QName _AllotmentDetailsEUIN_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EUIN");
    private final static QName _AllotmentDetailsDPTrans_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "DPTrans");
    private final static QName _AllotmentDetailsBeneficiaryId_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BeneficiaryId");
    private final static QName _AllotmentDetailsBranchCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BranchCode");
    private final static QName _AllotmentDetailsDPCFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "DPCFlag");
    private final static QName _AllotmentDetailsEUINDecl_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EUINDecl");
    private final static QName _AllotmentDetailsSIPRegnDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SIPRegnDate");
    private final static QName _AllotmentDetailsAllottedNav_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllottedNav");
    private final static QName _AllotmentDetailsISIN_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ISIN");
    private final static QName _AllotmentDetailsOrderDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderDate");
    private final static QName _AllotmentDetailsSIPRegnNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SIPRegnNo");
    private final static QName _AllotmentDetailsSTT_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "STT");
    private final static QName _AllotmentDetailsInternalRefNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "InternalRefNo");
    private final static QName _AllotmentDetailsRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Remarks");
    private final static QName _AllotmentDetailsQty_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Qty");
    private final static QName _AllotmentDetailsSchemeCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SchemeCode");
    private final static QName _AllotmentDetailsValidFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ValidFlag");
    private final static QName _AllotmentDetailsSettType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SettType");
    private final static QName _AllotmentDetailsSubBrCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "SubBrCode");
    private final static QName _AllotmentDetailsAllottedAmt_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllottedAmt");
    private final static QName _AllotmentDetailsOrderNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderNo");
    private final static QName _AllotmentDetailsReportDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ReportDate");
    private final static QName _AllotmentDetailsAllottedUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "AllottedUnit");
    private final static QName _AllotmentDetailsRTATransNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RTATransNo");
    private final static QName _ResponseResponseString_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ResponseString");
    private final static QName _ResponseFiller_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Filler");
    private final static QName _MFAPIRequestParam_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "param");
    private final static QName _MFAPIRequestFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Flag");
    private final static QName _GetPasswordUserId_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "UserId");
    private final static QName _GetPasswordMemberId_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "MemberId");
    private final static QName _GetPasswordPassKey_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "PassKey");
    private final static QName _GetPasswordPassword_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "Password");
    private final static QName _OrderDetailsMINRedeemFlag_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MINRedeemFlag");
    private final static QName _OrderDetailsDPC_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "DPC");
    private final static QName _OrderDetailsALLUnits_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ALLUnits");
    private final static QName _OrderDetailsUnits_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Units");
    private final static QName _OrderDetailsMemberRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MemberRemarks");
    private final static QName _OrderDetailsDPFolioNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "DPFolioNo");
    private final static QName _OrderDetailsEntryBy_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "EntryBy");
    private final static QName _OrderDetailsOrderStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderStatus");
    private final static QName _OrderDetailsOrderRemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "OrderRemarks");
    private final static QName _OrderDetailsFirstOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "FirstOrder");
    private final static QName _OrderDetailsTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Time");
    private final static QName _AOFPanSearchResponse2ImageUploadStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "imageUploadStatus");
    private final static QName _AOFPanSearchResponse2BSERemarks_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BSERemarks");
    private final static QName _AOFPanSearchResponse2ImageResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "imageResponseStatus");
    private final static QName _AOFPanSearchResponse2PAN_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "PAN");
    private final static QName _OrderStatusResponseOrderStatusResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "OrderStatusResult");
    private final static QName _MandateDetails2BankBranch_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BankBranch");
    private final static QName _MandateDetails2CollectionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "CollectionType");
    private final static QName _MandateDetails2UMRNNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "UMRNNo");
    private final static QName _MandateDetails2BankAccNo_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BankAccNo");
    private final static QName _MandateDetails2BankName_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BankName");
    private final static QName _MandateDetails2MandateType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateType");
    private final static QName _MandateDetails2UploadDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "UploadDate");
    private final static QName _MandateDetails2ApprovedDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ApprovedDate");
    private final static QName _MandateDetails2MandateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MandateId");
    private final static QName _MandateDetails2RegnDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RegnDate");
    private final static QName _GetPasswordMobileResponseGetPasswordMobileResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "GetPasswordMobileResult");
    private final static QName _PasswordRequestMemberId_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "MemberId");
    private final static QName _PasswordRequestPassKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "PassKey");
    private final static QName _PasswordRequestRequestType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "RequestType");
    private final static QName _GetPasswordResponseGetPasswordResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "getPasswordResult");
    private final static QName _ProvOrderStatusResponseProvOrderStatusResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "ProvOrderStatusResult");
    private final static QName _RedemptionStatementResponseRedemptionStatementResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "RedemptionStatementResult");
    private final static QName _ImageResponseStatusBSELMNDRRFD_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BSELMNDR_RFD");
    private final static QName _ImageResponseStatusBSENONDRRFI_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BSENONDR_RFI");
    private final static QName _ImageResponseStatusBSELMNDPMFD_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BSELMNDP_MFD");
    private final static QName _ImageResponseStatusBSENONDPMFI_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "BSENONDP_MFI");
    private final static QName _RedemptionDetailsAmt_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Amt");
    private final static QName _RedemptionDetailsNav_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Nav");
    private final static QName _RedemptionDetailsUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Unit");
    private final static QName _GetPasswordForChildOrderResponseGetPasswordForChildOrderResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "GetPasswordForChildOrderResult");
    private final static QName _OrderRequestFromDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "FromDate");
    private final static QName _OrderRequestToDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "ToDate");
    private final static QName _OrderRequestFiller1_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Filler1");
    private final static QName _OrderRequestFiller3_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Filler3");
    private final static QName _OrderRequestFiller2_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "Filler2");
    private final static QName _OrderRequestTransType_QNAME = new QName("http://schemas.datacontract.org/2004/07/StarMFWebService", "TransType");
    private final static QName _MandateDetailsResponseMandateDetailsResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "MandateDetailsResult");
    private final static QName _MFAPIParam_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "param");
    private final static QName _MFAPIFlag_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "Flag");
    private final static QName _MFAPIEncryptedPassword_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "EncryptedPassword");
    private final static QName _AOFPanSearchResponseAOFPanSearchResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "AOFPanSearchResult");
    private final static QName _MFAPIResponseMFAPIResult_QNAME = new QName("http://www.bsestarmf.in/2016/01/", "MFAPIResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.futurewise.app.bse.wsdl.starmfservice
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EMandateAuthURLResponse }
     */
    public EMandateAuthURLResponse createEMandateAuthURLResponse() {
        return new EMandateAuthURLResponse();
    }

    /**
     * Create an instance of {@link AllotmentStatementResponse }
     */
    public AllotmentStatementResponse createAllotmentStatementResponse() {
        return new AllotmentStatementResponse();
    }

    /**
     * Create an instance of {@link EMandateAuthURL }
     */
    public EMandateAuthURL createEMandateAuthURL() {
        return new EMandateAuthURL();
    }

    /**
     * Create an instance of {@link ProvOrderResponse }
     */
    public ProvOrderResponse createProvOrderResponse() {
        return new ProvOrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfChildOrderDetails }
     */
    public ArrayOfChildOrderDetails createArrayOfChildOrderDetails() {
        return new ArrayOfChildOrderDetails();
    }

    /**
     * Create an instance of {@link ChildOrderRequest }
     */
    public ChildOrderRequest createChildOrderRequest() {
        return new ChildOrderRequest();
    }

    /**
     * Create an instance of {@link AOFPanSearch }
     */
    public AOFPanSearch createAOFPanSearch() {
        return new AOFPanSearch();
    }

    /**
     * Create an instance of {@link ArrayOfRedemptionDetails }
     */
    public ArrayOfRedemptionDetails createArrayOfRedemptionDetails() {
        return new ArrayOfRedemptionDetails();
    }

    /**
     * Create an instance of {@link EMandateAuthURLRequest }
     */
    public EMandateAuthURLRequest createEMandateAuthURLRequest() {
        return new EMandateAuthURLRequest();
    }

    /**
     * Create an instance of {@link AllotmentStatement }
     */
    public AllotmentStatement createAllotmentStatement() {
        return new AllotmentStatement();
    }

    /**
     * Create an instance of {@link MFAPIMobileResponse }
     */
    public MFAPIMobileResponse createMFAPIMobileResponse() {
        return new MFAPIMobileResponse();
    }

    /**
     * Create an instance of {@link GetAccessTokenResponse }
     */
    public GetAccessTokenResponse createGetAccessTokenResponse() {
        return new GetAccessTokenResponse();
    }

    /**
     * Create an instance of {@link ChildOrderDetails }
     */
    public ChildOrderDetails createChildOrderDetails() {
        return new ChildOrderDetails();
    }

    /**
     * Create an instance of {@link ChildOrderDetailsResponse }
     */
    public ChildOrderDetailsResponse createChildOrderDetailsResponse() {
        return new ChildOrderDetailsResponse();
    }

    /**
     * Create an instance of {@link ChildOrderDetails2 }
     */
    public ChildOrderDetails2 createChildOrderDetails2() {
        return new ChildOrderDetails2();
    }

    /**
     * Create an instance of {@link AllotmentDetails }
     */
    public AllotmentDetails createAllotmentDetails() {
        return new AllotmentDetails();
    }

    /**
     * Create an instance of {@link Response }
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link MFAPIRequest }
     */
    public MFAPIRequest createMFAPIRequest() {
        return new MFAPIRequest();
    }

    /**
     * Create an instance of {@link ProvOrderStatus }
     */
    public ProvOrderStatus createProvOrderStatus() {
        return new ProvOrderStatus();
    }

    /**
     * Create an instance of {@link ArrayOfProvOrderDetails }
     */
    public ArrayOfProvOrderDetails createArrayOfProvOrderDetails() {
        return new ArrayOfProvOrderDetails();
    }

    /**
     * Create an instance of {@link GetPassword }
     */
    public GetPassword createGetPassword() {
        return new GetPassword();
    }

    /**
     * Create an instance of {@link AOFPanSearchResponse2 }
     */
    public AOFPanSearchResponse2 createAOFPanSearchResponse2() {
        return new AOFPanSearchResponse2();
    }

    /**
     * Create an instance of {@link OrderDetails }
     */
    public OrderDetails createOrderDetails() {
        return new OrderDetails();
    }

    /**
     * Create an instance of {@link OrderStatus }
     */
    public OrderStatus createOrderStatus() {
        return new OrderStatus();
    }

    /**
     * Create an instance of {@link AOFPanSearchRequest }
     */
    public AOFPanSearchRequest createAOFPanSearchRequest() {
        return new AOFPanSearchRequest();
    }

    /**
     * Create an instance of {@link OrderStatusResponse }
     */
    public OrderStatusResponse createOrderStatusResponse() {
        return new OrderStatusResponse();
    }

    /**
     * Create an instance of {@link MandateDetails2 }
     */
    public MandateDetails2 createMandateDetails2() {
        return new MandateDetails2();
    }

    /**
     * Create an instance of {@link GetPasswordMobileResponse }
     */
    public GetPasswordMobileResponse createGetPasswordMobileResponse() {
        return new GetPasswordMobileResponse();
    }

    /**
     * Create an instance of {@link OrderResponse }
     */
    public OrderResponse createOrderResponse() {
        return new OrderResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAllotmentDetails }
     */
    public ArrayOfAllotmentDetails createArrayOfAllotmentDetails() {
        return new ArrayOfAllotmentDetails();
    }

    /**
     * Create an instance of {@link PasswordRequest }
     */
    public PasswordRequest createPasswordRequest() {
        return new PasswordRequest();
    }

    /**
     * Create an instance of {@link MFAPIMobile }
     */
    public MFAPIMobile createMFAPIMobile() {
        return new MFAPIMobile();
    }

    /**
     * Create an instance of {@link GetPasswordResponse }
     */
    public GetPasswordResponse createGetPasswordResponse() {
        return new GetPasswordResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMandateDetails }
     */
    public ArrayOfMandateDetails createArrayOfMandateDetails() {
        return new ArrayOfMandateDetails();
    }

    /**
     * Create an instance of {@link ProvOrderStatusResponse }
     */
    public ProvOrderStatusResponse createProvOrderStatusResponse() {
        return new ProvOrderStatusResponse();
    }

    /**
     * Create an instance of {@link ProvOrderDetails }
     */
    public ProvOrderDetails createProvOrderDetails() {
        return new ProvOrderDetails();
    }

    /**
     * Create an instance of {@link ChildOrderResponse }
     */
    public ChildOrderResponse createChildOrderResponse() {
        return new ChildOrderResponse();
    }

    /**
     * Create an instance of {@link RedemptionStatementResponse }
     */
    public RedemptionStatementResponse createRedemptionStatementResponse() {
        return new RedemptionStatementResponse();
    }

    /**
     * Create an instance of {@link ImageResponseStatus }
     */
    public ImageResponseStatus createImageResponseStatus() {
        return new ImageResponseStatus();
    }

    /**
     * Create an instance of {@link GetAccessToken }
     */
    public GetAccessToken createGetAccessToken() {
        return new GetAccessToken();
    }

    /**
     * Create an instance of {@link RedemptionDetails }
     */
    public RedemptionDetails createRedemptionDetails() {
        return new RedemptionDetails();
    }

    /**
     * Create an instance of {@link GetPasswordForChildOrderResponse }
     */
    public GetPasswordForChildOrderResponse createGetPasswordForChildOrderResponse() {
        return new GetPasswordForChildOrderResponse();
    }

    /**
     * Create an instance of {@link OrderRequest }
     */
    public OrderRequest createOrderRequest() {
        return new OrderRequest();
    }

    /**
     * Create an instance of {@link MandateDetails }
     */
    public MandateDetails createMandateDetails() {
        return new MandateDetails();
    }

    /**
     * Create an instance of {@link AllotmentStatementResponse2 }
     */
    public AllotmentStatementResponse2 createAllotmentStatementResponse2() {
        return new AllotmentStatementResponse2();
    }

    /**
     * Create an instance of {@link RedemptionStatement }
     */
    public RedemptionStatement createRedemptionStatement() {
        return new RedemptionStatement();
    }

    /**
     * Create an instance of {@link AllotmentStatementRequest }
     */
    public AllotmentStatementRequest createAllotmentStatementRequest() {
        return new AllotmentStatementRequest();
    }

    /**
     * Create an instance of {@link EMandateAuthURLResponse2 }
     */
    public EMandateAuthURLResponse2 createEMandateAuthURLResponse2() {
        return new EMandateAuthURLResponse2();
    }

    /**
     * Create an instance of {@link MandateDetailsResponse }
     */
    public MandateDetailsResponse createMandateDetailsResponse() {
        return new MandateDetailsResponse();
    }

    /**
     * Create an instance of {@link MandateDetailsRequest }
     */
    public MandateDetailsRequest createMandateDetailsRequest() {
        return new MandateDetailsRequest();
    }

    /**
     * Create an instance of {@link RedemptionStatementResponse2 }
     */
    public RedemptionStatementResponse2 createRedemptionStatementResponse2() {
        return new RedemptionStatementResponse2();
    }

    /**
     * Create an instance of {@link MFAPI }
     */
    public MFAPI createMFAPI() {
        return new MFAPI();
    }

    /**
     * Create an instance of {@link ArrayOfOrderDetails }
     */
    public ArrayOfOrderDetails createArrayOfOrderDetails() {
        return new ArrayOfOrderDetails();
    }

    /**
     * Create an instance of {@link MandateDetailsResponse2 }
     */
    public MandateDetailsResponse2 createMandateDetailsResponse2() {
        return new MandateDetailsResponse2();
    }

    /**
     * Create an instance of {@link AOFPanSearchResponse }
     */
    public AOFPanSearchResponse createAOFPanSearchResponse() {
        return new AOFPanSearchResponse();
    }

    /**
     * Create an instance of {@link MFAPIResponse }
     */
    public MFAPIResponse createMFAPIResponse() {
        return new MFAPIResponse();
    }

    /**
     * Create an instance of {@link ImageUploadStatus }
     */
    public ImageUploadStatus createImageUploadStatus() {
        return new ImageUploadStatus();
    }

    /**
     * Create an instance of {@link GetPasswordMobile }
     */
    public GetPasswordMobile createGetPasswordMobile() {
        return new GetPasswordMobile();
    }

    /**
     * Create an instance of {@link RedemptionStatementRequest }
     */
    public RedemptionStatementRequest createRedemptionStatementRequest() {
        return new RedemptionStatementRequest();
    }

    /**
     * Create an instance of {@link GetPasswordForChildOrder }
     */
    public GetPasswordForChildOrder createGetPasswordForChildOrder() {
        return new GetPasswordForChildOrder();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFAPIRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MFAPIRequest")
    public JAXBElement<MFAPIRequest> createMFAPIRequest(MFAPIRequest value) {
        return new JAXBElement<MFAPIRequest>(_MFAPIRequest_QNAME, MFAPIRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "PasswordRequest")
    public JAXBElement<PasswordRequest> createPasswordRequest(PasswordRequest value) {
        return new JAXBElement<PasswordRequest>(_PasswordRequest_QNAME, PasswordRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ProvOrderDetails")
    public JAXBElement<ProvOrderDetails> createProvOrderDetails(ProvOrderDetails value) {
        return new JAXBElement<ProvOrderDetails>(_ProvOrderDetails_QNAME, ProvOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AOFPanSearchResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AOFPanSearchResponse")
    public JAXBElement<AOFPanSearchResponse2> createAOFPanSearchResponse(AOFPanSearchResponse2 value) {
        return new JAXBElement<AOFPanSearchResponse2>(_AOFPanSearchResponse_QNAME, AOFPanSearchResponse2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentStatementRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentStatementRequest")
    public JAXBElement<AllotmentStatementRequest> createAllotmentStatementRequest(AllotmentStatementRequest value) {
        return new JAXBElement<AllotmentStatementRequest>(_AllotmentStatementRequest_QNAME, AllotmentStatementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentStatementResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentStatementResponse")
    public JAXBElement<AllotmentStatementResponse2> createAllotmentStatementResponse(AllotmentStatementResponse2 value) {
        return new JAXBElement<AllotmentStatementResponse2>(_AllotmentStatementResponse_QNAME, AllotmentStatementResponse2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetailsResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetailsResponse")
    public JAXBElement<MandateDetailsResponse2> createMandateDetailsResponse(MandateDetailsResponse2 value) {
        return new JAXBElement<MandateDetailsResponse2>(_MandateDetailsResponse_QNAME, MandateDetailsResponse2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionStatementRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionStatementRequest")
    public JAXBElement<RedemptionStatementRequest> createRedemptionStatementRequest(RedemptionStatementRequest value) {
        return new JAXBElement<RedemptionStatementRequest>(_RedemptionStatementRequest_QNAME, RedemptionStatementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMandateDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfMandateDetails")
    public JAXBElement<ArrayOfMandateDetails> createArrayOfMandateDetails(ArrayOfMandateDetails value) {
        return new JAXBElement<ArrayOfMandateDetails>(_ArrayOfMandateDetails_QNAME, ArrayOfMandateDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderRequest")
    public JAXBElement<OrderRequest> createOrderRequest(OrderRequest value) {
        return new JAXBElement<OrderRequest>(_OrderRequest_QNAME, OrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllotmentDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfAllotmentDetails")
    public JAXBElement<ArrayOfAllotmentDetails> createArrayOfAllotmentDetails(ArrayOfAllotmentDetails value) {
        return new JAXBElement<ArrayOfAllotmentDetails>(_ArrayOfAllotmentDetails_QNAME, ArrayOfAllotmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMandateAuthURLRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EMandateAuthURLRequest")
    public JAXBElement<EMandateAuthURLRequest> createEMandateAuthURLRequest(EMandateAuthURLRequest value) {
        return new JAXBElement<EMandateAuthURLRequest>(_EMandateAuthURLRequest_QNAME, EMandateAuthURLRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChildOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfChildOrderDetails")
    public JAXBElement<ArrayOfChildOrderDetails> createArrayOfChildOrderDetails(ArrayOfChildOrderDetails value) {
        return new JAXBElement<ArrayOfChildOrderDetails>(_ArrayOfChildOrderDetails_QNAME, ArrayOfChildOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderDetails2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderDetails")
    public JAXBElement<ChildOrderDetails2> createChildOrderDetails(ChildOrderDetails2 value) {
        return new JAXBElement<ChildOrderDetails2>(_ChildOrderDetails_QNAME, ChildOrderDetails2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRedemptionDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfRedemptionDetails")
    public JAXBElement<ArrayOfRedemptionDetails> createArrayOfRedemptionDetails(ArrayOfRedemptionDetails value) {
        return new JAXBElement<ArrayOfRedemptionDetails>(_ArrayOfRedemptionDetails_QNAME, ArrayOfRedemptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionDetails")
    public JAXBElement<RedemptionDetails> createRedemptionDetails(RedemptionDetails value) {
        return new JAXBElement<RedemptionDetails>(_RedemptionDetails_QNAME, RedemptionDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderDetails")
    public JAXBElement<OrderDetails> createOrderDetails(OrderDetails value) {
        return new JAXBElement<OrderDetails>(_OrderDetails_QNAME, OrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AOFPanSearchRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AOFPanSearchRequest")
    public JAXBElement<AOFPanSearchRequest> createAOFPanSearchRequest(AOFPanSearchRequest value) {
        return new JAXBElement<AOFPanSearchRequest>(_AOFPanSearchRequest_QNAME, AOFPanSearchRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfOrderDetails")
    public JAXBElement<ArrayOfOrderDetails> createArrayOfOrderDetails(ArrayOfOrderDetails value) {
        return new JAXBElement<ArrayOfOrderDetails>(_ArrayOfOrderDetails_QNAME, ArrayOfOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetailsRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetailsRequest")
    public JAXBElement<MandateDetailsRequest> createMandateDetailsRequest(MandateDetailsRequest value) {
        return new JAXBElement<MandateDetailsRequest>(_MandateDetailsRequest_QNAME, MandateDetailsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderResponse")
    public JAXBElement<ChildOrderResponse> createChildOrderResponse(ChildOrderResponse value) {
        return new JAXBElement<ChildOrderResponse>(_ChildOrderResponse_QNAME, ChildOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Response")
    public JAXBElement<Response> createResponse(Response value) {
        return new JAXBElement<Response>(_Response_QNAME, Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProvOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ArrayOfProvOrderDetails")
    public JAXBElement<ArrayOfProvOrderDetails> createArrayOfProvOrderDetails(ArrayOfProvOrderDetails value) {
        return new JAXBElement<ArrayOfProvOrderDetails>(_ArrayOfProvOrderDetails_QNAME, ArrayOfProvOrderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageResponseStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ImageResponseStatus")
    public JAXBElement<ImageResponseStatus> createImageResponseStatus(ImageResponseStatus value) {
        return new JAXBElement<ImageResponseStatus>(_ImageResponseStatus_QNAME, ImageResponseStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetails2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetails")
    public JAXBElement<MandateDetails2> createMandateDetails(MandateDetails2 value) {
        return new JAXBElement<MandateDetails2>(_MandateDetails_QNAME, MandateDetails2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMandateAuthURLResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EMandateAuthURLResponse")
    public JAXBElement<EMandateAuthURLResponse2> createEMandateAuthURLResponse(EMandateAuthURLResponse2 value) {
        return new JAXBElement<EMandateAuthURLResponse2>(_EMandateAuthURLResponse_QNAME, EMandateAuthURLResponse2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderRequest")
    public JAXBElement<ChildOrderRequest> createChildOrderRequest(ChildOrderRequest value) {
        return new JAXBElement<ChildOrderRequest>(_ChildOrderRequest_QNAME, ChildOrderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderResponse")
    public JAXBElement<OrderResponse> createOrderResponse(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderResponse_QNAME, OrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvOrderResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ProvOrderResponse")
    public JAXBElement<ProvOrderResponse> createProvOrderResponse(ProvOrderResponse value) {
        return new JAXBElement<ProvOrderResponse>(_ProvOrderResponse_QNAME, ProvOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageUploadStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ImageUploadStatus")
    public JAXBElement<ImageUploadStatus> createImageUploadStatus(ImageUploadStatus value) {
        return new JAXBElement<ImageUploadStatus>(_ImageUploadStatus_QNAME, ImageUploadStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionStatementResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionStatementResponse")
    public JAXBElement<RedemptionStatementResponse2> createRedemptionStatementResponse(RedemptionStatementResponse2 value) {
        return new JAXBElement<RedemptionStatementResponse2>(_RedemptionStatementResponse_QNAME, RedemptionStatementResponse2.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentDetails")
    public JAXBElement<AllotmentDetails> createAllotmentDetails(AllotmentDetails value) {
        return new JAXBElement<AllotmentDetails>(_AllotmentDetails_QNAME, AllotmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMandateAuthURLResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "EMandateAuthURLResult", scope = EMandateAuthURLResponse.class)
    public JAXBElement<EMandateAuthURLResponse2> createEMandateAuthURLResponseEMandateAuthURLResult(EMandateAuthURLResponse2 value) {
        return new JAXBElement<EMandateAuthURLResponse2>(_EMandateAuthURLResponseEMandateAuthURLResult_QNAME, EMandateAuthURLResponse2.class, EMandateAuthURLResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentStatementResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "AllotmentStatementResult", scope = AllotmentStatementResponse.class)
    public JAXBElement<AllotmentStatementResponse2> createAllotmentStatementResponseAllotmentStatementResult(AllotmentStatementResponse2 value) {
        return new JAXBElement<AllotmentStatementResponse2>(_AllotmentStatementResponseAllotmentStatementResult_QNAME, AllotmentStatementResponse2.class, AllotmentStatementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EMandateAuthURLRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = EMandateAuthURL.class)
    public JAXBElement<EMandateAuthURLRequest> createEMandateAuthURLParam(EMandateAuthURLRequest value) {
        return new JAXBElement<EMandateAuthURLRequest>(_EMandateAuthURLParam_QNAME, EMandateAuthURLRequest.class, EMandateAuthURL.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = ProvOrderResponse.class)
    public JAXBElement<String> createProvOrderResponseStatus(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, ProvOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Message", scope = ProvOrderResponse.class)
    public JAXBElement<String> createProvOrderResponseMessage(String value) {
        return new JAXBElement<String>(_ProvOrderResponseMessage_QNAME, String.class, ProvOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProvOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "provOrderDetails", scope = ProvOrderResponse.class)
    public JAXBElement<ArrayOfProvOrderDetails> createProvOrderResponseProvOrderDetails(ArrayOfProvOrderDetails value) {
        return new JAXBElement<ArrayOfProvOrderDetails>(_ProvOrderResponseProvOrderDetails_QNAME, ArrayOfProvOrderDetails.class, ProvOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RegnNo", scope = ChildOrderRequest.class)
    public JAXBElement<String> createChildOrderRequestRegnNo(String value) {
        return new JAXBElement<String>(_ChildOrderRequestRegnNo_QNAME, String.class, ChildOrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = ChildOrderRequest.class)
    public JAXBElement<String> createChildOrderRequestClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, ChildOrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SystematicPlanType", scope = ChildOrderRequest.class)
    public JAXBElement<String> createChildOrderRequestSystematicPlanType(String value) {
        return new JAXBElement<String>(_ChildOrderRequestSystematicPlanType_QNAME, String.class, ChildOrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EncryptedPassword", scope = ChildOrderRequest.class)
    public JAXBElement<String> createChildOrderRequestEncryptedPassword(String value) {
        return new JAXBElement<String>(_ChildOrderRequestEncryptedPassword_QNAME, String.class, ChildOrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Date", scope = ChildOrderRequest.class)
    public JAXBElement<String> createChildOrderRequestDate(String value) {
        return new JAXBElement<String>(_ChildOrderRequestDate_QNAME, String.class, ChildOrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = ChildOrderRequest.class)
    public JAXBElement<String> createChildOrderRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, ChildOrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AOFPanSearchRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = AOFPanSearch.class)
    public JAXBElement<AOFPanSearchRequest> createAOFPanSearchParam(AOFPanSearchRequest value) {
        return new JAXBElement<AOFPanSearchRequest>(_EMandateAuthURLParam_QNAME, AOFPanSearchRequest.class, AOFPanSearch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllotmentStatementRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = AllotmentStatement.class)
    public JAXBElement<AllotmentStatementRequest> createAllotmentStatementParam(AllotmentStatementRequest value) {
        return new JAXBElement<AllotmentStatementRequest>(_EMandateAuthURLParam_QNAME, AllotmentStatementRequest.class, AllotmentStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateID", scope = EMandateAuthURLRequest.class)
    public JAXBElement<String> createEMandateAuthURLRequestMandateID(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestMandateID_QNAME, String.class, EMandateAuthURLRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = EMandateAuthURLRequest.class)
    public JAXBElement<String> createEMandateAuthURLRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, EMandateAuthURLRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = EMandateAuthURLRequest.class)
    public JAXBElement<String> createEMandateAuthURLRequestClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, EMandateAuthURLRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = EMandateAuthURLRequest.class)
    public JAXBElement<String> createEMandateAuthURLRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, EMandateAuthURLRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Password", scope = EMandateAuthURLRequest.class)
    public JAXBElement<String> createEMandateAuthURLRequestPassword(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestPassword_QNAME, String.class, EMandateAuthURLRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "MFAPIMobileResult", scope = MFAPIMobileResponse.class)
    public JAXBElement<Response> createMFAPIMobileResponseMFAPIMobileResult(Response value) {
        return new JAXBElement<Response>(_MFAPIMobileResponseMFAPIMobileResult_QNAME, Response.class, MFAPIMobileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "GetAccessTokenResult", scope = GetAccessTokenResponse.class)
    public JAXBElement<Response> createGetAccessTokenResponseGetAccessTokenResult(Response value) {
        return new JAXBElement<Response>(_GetAccessTokenResponseGetAccessTokenResult_QNAME, Response.class, GetAccessTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = ChildOrderDetails.class)
    public JAXBElement<ChildOrderRequest> createChildOrderDetailsParam(ChildOrderRequest value) {
        return new JAXBElement<ChildOrderRequest>(_EMandateAuthURLParam_QNAME, ChildOrderRequest.class, ChildOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChildOrderResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "ChildOrderDetailsResult", scope = ChildOrderDetailsResponse.class)
    public JAXBElement<ChildOrderResponse> createChildOrderDetailsResponseChildOrderDetailsResult(ChildOrderResponse value) {
        return new JAXBElement<ChildOrderResponse>(_ChildOrderDetailsResponseChildOrderDetailsResult_QNAME, ChildOrderResponse.class, ChildOrderDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientName", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2ClientName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2ClientName_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2OrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FirstOrderTodayFlag", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2FirstOrderTodayFlag(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2FirstOrderTodayFlag_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2ClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeName", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2SchemeName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SchemeName_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrokerCode", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2SubBrokerCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubBrokerCode_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrokerARNCode", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2SubBrokerARNCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubBrokerARNCode_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2MemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2SubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUINFlag", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2EUINFlag(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2EUINFlag_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUINNumber", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2EUINNumber(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2EUINNumber_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "KYCFlag", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2KYCFlag(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2KYCFlag_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amount", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2Amount(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Amount_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RTASchemeCode", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2RTASchemeCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2RTASchemeCode_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BuySellType", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2BuySellType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BuySellType_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Quantity", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2Quantity(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Quantity_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BuySell", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2BuySell(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BuySell_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPTxnType", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2DPTxnType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2DPTxnType_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNumber", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2OrderNumber(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderNumber_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FolioNo", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2FolioNo(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2FolioNo_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSESchemeCode", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2BSESchemeCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BSESchemeCode_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "IntRefNo", scope = ChildOrderDetails2.class)
    public JAXBElement<String> createChildOrderDetails2IntRefNo(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2IntRefNo_QNAME, String.class, ChildOrderDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettNo", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSettNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettNo_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUIN", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsEUIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsEUIN_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPTrans", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsDPTrans(String value) {
        return new JAXBElement<String>(_AllotmentDetailsDPTrans_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BeneficiaryId", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsBeneficiaryId(String value) {
        return new JAXBElement<String>(_AllotmentDetailsBeneficiaryId_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BranchCode", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsBranchCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsBranchCode_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPCFlag", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsDPCFlag(String value) {
        return new JAXBElement<String>(_AllotmentDetailsDPCFlag_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUINDecl", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsEUINDecl(String value) {
        return new JAXBElement<String>(_AllotmentDetailsEUINDecl_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SIPRegnDate", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSIPRegnDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSIPRegnDate_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllottedNav", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsAllottedNav(String value) {
        return new JAXBElement<String>(_AllotmentDetailsAllottedNav_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amount", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsAmount(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Amount_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FolioNo", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsFolioNo(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2FolioNo_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ISIN", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsISIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsISIN_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderDate", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsOrderDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderDate_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SIPRegnNo", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSIPRegnNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSIPRegnNo_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientName", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsClientName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2ClientName_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "STT", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSTT(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSTT_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "InternalRefNo", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsInternalRefNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsInternalRefNo_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Remarks", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsRemarks(String value) {
        return new JAXBElement<String>(_AllotmentDetailsRemarks_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Qty", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsQty(String value) {
        return new JAXBElement<String>(_AllotmentDetailsQty_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeCode", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSchemeCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSchemeCode_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ValidFlag", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsValidFlag(String value) {
        return new JAXBElement<String>(_AllotmentDetailsValidFlag_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrCode", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsSubBrCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSubBrCode_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "KYCFlag", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsKYCFlag(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2KYCFlag_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RTASchemeCode", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsRTASchemeCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2RTASchemeCode_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllottedAmt", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsAllottedAmt(String value) {
        return new JAXBElement<String>(_AllotmentDetailsAllottedAmt_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNo", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsOrderNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderNo_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ReportDate", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsReportDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsReportDate_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllottedUnit", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsAllottedUnit(String value) {
        return new JAXBElement<String>(_AllotmentDetailsAllottedUnit_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RTATransNo", scope = AllotmentDetails.class)
    public JAXBElement<String> createAllotmentDetailsRTATransNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsRTATransNo_QNAME, String.class, AllotmentDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = Response.class)
    public JAXBElement<String> createResponseStatus(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ResponseString", scope = Response.class)
    public JAXBElement<String> createResponseResponseString(String value) {
        return new JAXBElement<String>(_ResponseResponseString_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler", scope = Response.class)
    public JAXBElement<String> createResponseFiller(String value) {
        return new JAXBElement<String>(_ResponseFiller_QNAME, String.class, Response.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "param", scope = MFAPIRequest.class)
    public JAXBElement<String> createMFAPIRequestParam(String value) {
        return new JAXBElement<String>(_MFAPIRequestParam_QNAME, String.class, MFAPIRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = MFAPIRequest.class)
    public JAXBElement<String> createMFAPIRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, MFAPIRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EncryptedPassword", scope = MFAPIRequest.class)
    public JAXBElement<String> createMFAPIRequestEncryptedPassword(String value) {
        return new JAXBElement<String>(_ChildOrderRequestEncryptedPassword_QNAME, String.class, MFAPIRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Flag", scope = MFAPIRequest.class)
    public JAXBElement<String> createMFAPIRequestFlag(String value) {
        return new JAXBElement<String>(_MFAPIRequestFlag_QNAME, String.class, MFAPIRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = ProvOrderStatus.class)
    public JAXBElement<OrderRequest> createProvOrderStatusParam(OrderRequest value) {
        return new JAXBElement<OrderRequest>(_EMandateAuthURLParam_QNAME, OrderRequest.class, ProvOrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "UserId", scope = GetPassword.class)
    public JAXBElement<String> createGetPasswordUserId(String value) {
        return new JAXBElement<String>(_GetPasswordUserId_QNAME, String.class, GetPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "MemberId", scope = GetPassword.class)
    public JAXBElement<String> createGetPasswordMemberId(String value) {
        return new JAXBElement<String>(_GetPasswordMemberId_QNAME, String.class, GetPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "PassKey", scope = GetPassword.class)
    public JAXBElement<String> createGetPasswordPassKey(String value) {
        return new JAXBElement<String>(_GetPasswordPassKey_QNAME, String.class, GetPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Password", scope = GetPassword.class)
    public JAXBElement<String> createGetPasswordPassword(String value) {
        return new JAXBElement<String>(_GetPasswordPassword_QNAME, String.class, GetPassword.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MINRedeemFlag", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsMINRedeemFlag(String value) {
        return new JAXBElement<String>(_OrderDetailsMINRedeemFlag_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettNo", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSettNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettNo_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUIN", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsEUIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsEUIN_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPC", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsDPC(String value) {
        return new JAXBElement<String>(_OrderDetailsDPC_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ALLUnits", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsALLUnits(String value) {
        return new JAXBElement<String>(_OrderDetailsALLUnits_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeName", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSchemeName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SchemeName_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPTrans", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsDPTrans(String value) {
        return new JAXBElement<String>(_AllotmentDetailsDPTrans_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUINDecl", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsEUINDecl(String value) {
        return new JAXBElement<String>(_AllotmentDetailsEUINDecl_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SIPRegnDate", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSIPRegnDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSIPRegnDate_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amount", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsAmount(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Amount_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BuySellType", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsBuySellType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BuySellType_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FolioNo", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsFolioNo(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2FolioNo_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ISIN", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsISIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsISIN_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Date", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsDate(String value) {
        return new JAXBElement<String>(_ChildOrderRequestDate_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Units", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsUnits(String value) {
        return new JAXBElement<String>(_OrderDetailsUnits_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SIPRegnNo", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSIPRegnNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSIPRegnNo_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberRemarks", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsMemberRemarks(String value) {
        return new JAXBElement<String>(_OrderDetailsMemberRemarks_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientName", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsClientName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2ClientName_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPFolioNo", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsDPFolioNo(String value) {
        return new JAXBElement<String>(_OrderDetailsDPFolioNo_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EntryBy", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsEntryBy(String value) {
        return new JAXBElement<String>(_OrderDetailsEntryBy_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderStatus", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsOrderStatus(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderStatus_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "InternalRefNo", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsInternalRefNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsInternalRefNo_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeCode", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSchemeCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSchemeCode_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrokerARNCode", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSubBrokerARNCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubBrokerARNCode_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrCode", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsSubBrCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSubBrCode_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderRemarks", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsOrderRemarks(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderRemarks_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "KYCFlag", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsKYCFlag(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2KYCFlag_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FirstOrder", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsFirstOrder(String value) {
        return new JAXBElement<String>(_OrderDetailsFirstOrder_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BuySell", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsBuySell(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BuySell_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNumber", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsOrderNumber(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderNumber_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Time", scope = OrderDetails.class)
    public JAXBElement<String> createOrderDetailsTime(String value) {
        return new JAXBElement<String>(_OrderDetailsTime_QNAME, String.class, OrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = AOFPanSearchResponse2.class)
    public JAXBElement<String> createAOFPanSearchResponse2Status(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, AOFPanSearchResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageUploadStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "imageUploadStatus", scope = AOFPanSearchResponse2.class)
    public JAXBElement<ImageUploadStatus> createAOFPanSearchResponse2ImageUploadStatus(ImageUploadStatus value) {
        return new JAXBElement<ImageUploadStatus>(_AOFPanSearchResponse2ImageUploadStatus_QNAME, ImageUploadStatus.class, AOFPanSearchResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSERemarks", scope = AOFPanSearchResponse2.class)
    public JAXBElement<String> createAOFPanSearchResponse2BSERemarks(String value) {
        return new JAXBElement<String>(_AOFPanSearchResponse2BSERemarks_QNAME, String.class, AOFPanSearchResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImageResponseStatus }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "imageResponseStatus", scope = AOFPanSearchResponse2.class)
    public JAXBElement<ImageResponseStatus> createAOFPanSearchResponse2ImageResponseStatus(ImageResponseStatus value) {
        return new JAXBElement<ImageResponseStatus>(_AOFPanSearchResponse2ImageResponseStatus_QNAME, ImageResponseStatus.class, AOFPanSearchResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "PAN", scope = AOFPanSearchResponse2.class)
    public JAXBElement<String> createAOFPanSearchResponse2PAN(String value) {
        return new JAXBElement<String>(_AOFPanSearchResponse2PAN_QNAME, String.class, AOFPanSearchResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = OrderStatus.class)
    public JAXBElement<OrderRequest> createOrderStatusParam(OrderRequest value) {
        return new JAXBElement<OrderRequest>(_EMandateAuthURLParam_QNAME, OrderRequest.class, OrderStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = AOFPanSearchRequest.class)
    public JAXBElement<String> createAOFPanSearchRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, AOFPanSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "PAN", scope = AOFPanSearchRequest.class)
    public JAXBElement<String> createAOFPanSearchRequestPAN(String value) {
        return new JAXBElement<String>(_AOFPanSearchResponse2PAN_QNAME, String.class, AOFPanSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = AOFPanSearchRequest.class)
    public JAXBElement<String> createAOFPanSearchRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, AOFPanSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Password", scope = AOFPanSearchRequest.class)
    public JAXBElement<String> createAOFPanSearchRequestPassword(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestPassword_QNAME, String.class, AOFPanSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "OrderStatusResult", scope = OrderStatusResponse.class)
    public JAXBElement<OrderResponse> createOrderStatusResponseOrderStatusResult(OrderResponse value) {
        return new JAXBElement<OrderResponse>(_OrderStatusResponseOrderStatusResult_QNAME, OrderResponse.class, OrderStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientName", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2ClientName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2ClientName_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BankBranch", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2BankBranch(String value) {
        return new JAXBElement<String>(_MandateDetails2BankBranch_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Remarks", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2Remarks(String value) {
        return new JAXBElement<String>(_AllotmentDetailsRemarks_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "CollectionType", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2CollectionType(String value) {
        return new JAXBElement<String>(_MandateDetails2CollectionType_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2ClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UMRNNo", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2UMRNNo(String value) {
        return new JAXBElement<String>(_MandateDetails2UMRNNo_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BankAccNo", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2BankAccNo(String value) {
        return new JAXBElement<String>(_MandateDetails2BankAccNo_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2MemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BankName", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2BankName(String value) {
        return new JAXBElement<String>(_MandateDetails2BankName_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2Status(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateType", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2MandateType(String value) {
        return new JAXBElement<String>(_MandateDetails2MandateType_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UploadDate", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2UploadDate(String value) {
        return new JAXBElement<String>(_MandateDetails2UploadDate_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ApprovedDate", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2ApprovedDate(String value) {
        return new JAXBElement<String>(_MandateDetails2ApprovedDate_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateId", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2MandateId(String value) {
        return new JAXBElement<String>(_MandateDetails2MandateId_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amount", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2Amount(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Amount_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RegnDate", scope = MandateDetails2.class)
    public JAXBElement<String> createMandateDetails2RegnDate(String value) {
        return new JAXBElement<String>(_MandateDetails2RegnDate_QNAME, String.class, MandateDetails2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "GetPasswordMobileResult", scope = GetPasswordMobileResponse.class)
    public JAXBElement<Response> createGetPasswordMobileResponseGetPasswordMobileResult(Response value) {
        return new JAXBElement<Response>(_GetPasswordMobileResponseGetPasswordMobileResult_QNAME, Response.class, GetPasswordMobileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseStatus(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Message", scope = OrderResponse.class)
    public JAXBElement<String> createOrderResponseMessage(String value) {
        return new JAXBElement<String>(_ProvOrderResponseMessage_QNAME, String.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderDetails", scope = OrderResponse.class)
    public JAXBElement<ArrayOfOrderDetails> createOrderResponseOrderDetails(ArrayOfOrderDetails value) {
        return new JAXBElement<ArrayOfOrderDetails>(_OrderDetails_QNAME, ArrayOfOrderDetails.class, OrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberId", scope = PasswordRequest.class)
    public JAXBElement<String> createPasswordRequestMemberId(String value) {
        return new JAXBElement<String>(_PasswordRequestMemberId_QNAME, String.class, PasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = PasswordRequest.class)
    public JAXBElement<String> createPasswordRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, PasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "PassKey", scope = PasswordRequest.class)
    public JAXBElement<String> createPasswordRequestPassKey(String value) {
        return new JAXBElement<String>(_PasswordRequestPassKey_QNAME, String.class, PasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Password", scope = PasswordRequest.class)
    public JAXBElement<String> createPasswordRequestPassword(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestPassword_QNAME, String.class, PasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RequestType", scope = PasswordRequest.class)
    public JAXBElement<String> createPasswordRequestRequestType(String value) {
        return new JAXBElement<String>(_PasswordRequestRequestType_QNAME, String.class, PasswordRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MFAPIRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = MFAPIMobile.class)
    public JAXBElement<MFAPIRequest> createMFAPIMobileParam(MFAPIRequest value) {
        return new JAXBElement<MFAPIRequest>(_EMandateAuthURLParam_QNAME, MFAPIRequest.class, MFAPIMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "getPasswordResult", scope = GetPasswordResponse.class)
    public JAXBElement<String> createGetPasswordResponseGetPasswordResult(String value) {
        return new JAXBElement<String>(_GetPasswordResponseGetPasswordResult_QNAME, String.class, GetPasswordResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProvOrderResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "ProvOrderStatusResult", scope = ProvOrderStatusResponse.class)
    public JAXBElement<ProvOrderResponse> createProvOrderStatusResponseProvOrderStatusResult(ProvOrderResponse value) {
        return new JAXBElement<ProvOrderResponse>(_ProvOrderStatusResponseProvOrderStatusResult_QNAME, ProvOrderResponse.class, ProvOrderStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MINRedeemFlag", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsMINRedeemFlag(String value) {
        return new JAXBElement<String>(_OrderDetailsMINRedeemFlag_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettNo", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSettNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettNo_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUIN", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsEUIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsEUIN_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPC", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsDPC(String value) {
        return new JAXBElement<String>(_OrderDetailsDPC_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ALLUnits", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsALLUnits(String value) {
        return new JAXBElement<String>(_OrderDetailsALLUnits_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeName", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSchemeName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SchemeName_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPTrans", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsDPTrans(String value) {
        return new JAXBElement<String>(_AllotmentDetailsDPTrans_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EUINDecl", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsEUINDecl(String value) {
        return new JAXBElement<String>(_AllotmentDetailsEUINDecl_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SIPRegnDate", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSIPRegnDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSIPRegnDate_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amount", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsAmount(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Amount_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BuySellType", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsBuySellType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BuySellType_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FolioNo", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsFolioNo(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2FolioNo_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ISIN", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsISIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsISIN_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Date", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsDate(String value) {
        return new JAXBElement<String>(_ChildOrderRequestDate_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Units", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsUnits(String value) {
        return new JAXBElement<String>(_OrderDetailsUnits_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SIPRegnNo", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSIPRegnNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSIPRegnNo_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberRemarks", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsMemberRemarks(String value) {
        return new JAXBElement<String>(_OrderDetailsMemberRemarks_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientName", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsClientName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2ClientName_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPFolioNo", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsDPFolioNo(String value) {
        return new JAXBElement<String>(_OrderDetailsDPFolioNo_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EntryBy", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsEntryBy(String value) {
        return new JAXBElement<String>(_OrderDetailsEntryBy_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderStatus", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsOrderStatus(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderStatus_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "InternalRefNo", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsInternalRefNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsInternalRefNo_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeCode", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSchemeCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSchemeCode_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrokerARNCode", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSubBrokerARNCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubBrokerARNCode_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubBrCode", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsSubBrCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSubBrCode_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderRemarks", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsOrderRemarks(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderRemarks_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "KYCFlag", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsKYCFlag(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2KYCFlag_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FirstOrder", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsFirstOrder(String value) {
        return new JAXBElement<String>(_OrderDetailsFirstOrder_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BuySell", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsBuySell(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2BuySell_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNumber", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsOrderNumber(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderNumber_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Time", scope = ProvOrderDetails.class)
    public JAXBElement<String> createProvOrderDetailsTime(String value) {
        return new JAXBElement<String>(_OrderDetailsTime_QNAME, String.class, ProvOrderDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionStatementResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "RedemptionStatementResult", scope = RedemptionStatementResponse.class)
    public JAXBElement<RedemptionStatementResponse2> createRedemptionStatementResponseRedemptionStatementResult(RedemptionStatementResponse2 value) {
        return new JAXBElement<RedemptionStatementResponse2>(_RedemptionStatementResponseRedemptionStatementResult_QNAME, RedemptionStatementResponse2.class, RedemptionStatementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = ChildOrderResponse.class)
    public JAXBElement<String> createChildOrderResponseStatus(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, ChildOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Message", scope = ChildOrderResponse.class)
    public JAXBElement<String> createChildOrderResponseMessage(String value) {
        return new JAXBElement<String>(_ProvOrderResponseMessage_QNAME, String.class, ChildOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChildOrderDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ChildOrderDetails", scope = ChildOrderResponse.class)
    public JAXBElement<ArrayOfChildOrderDetails> createChildOrderResponseChildOrderDetails(ArrayOfChildOrderDetails value) {
        return new JAXBElement<ArrayOfChildOrderDetails>(_ChildOrderDetails_QNAME, ArrayOfChildOrderDetails.class, ChildOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSELMNDR_RFD", scope = ImageResponseStatus.class)
    public JAXBElement<String> createImageResponseStatusBSELMNDRRFD(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSELMNDRRFD_QNAME, String.class, ImageResponseStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSENONDR_RFI", scope = ImageResponseStatus.class)
    public JAXBElement<String> createImageResponseStatusBSENONDRRFI(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSENONDRRFI_QNAME, String.class, ImageResponseStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSELMNDP_MFD", scope = ImageResponseStatus.class)
    public JAXBElement<String> createImageResponseStatusBSELMNDPMFD(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSELMNDPMFD_QNAME, String.class, ImageResponseStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSENONDP_MFI", scope = ImageResponseStatus.class)
    public JAXBElement<String> createImageResponseStatusBSENONDPMFI(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSENONDPMFI_QNAME, String.class, ImageResponseStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = GetAccessToken.class)
    public JAXBElement<PasswordRequest> createGetAccessTokenParam(PasswordRequest value) {
        return new JAXBElement<PasswordRequest>(_EMandateAuthURLParam_QNAME, PasswordRequest.class, GetAccessToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettNo", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsSettNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettNo_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPTrans", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsDPTrans(String value) {
        return new JAXBElement<String>(_AllotmentDetailsDPTrans_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BeneficiaryId", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsBeneficiaryId(String value) {
        return new JAXBElement<String>(_AllotmentDetailsBeneficiaryId_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BranchCode", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsBranchCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsBranchCode_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "DPCFlag", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsDPCFlag(String value) {
        return new JAXBElement<String>(_AllotmentDetailsDPCFlag_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amount", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsAmount(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2Amount_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Amt", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsAmt(String value) {
        return new JAXBElement<String>(_RedemptionDetailsAmt_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FolioNo", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsFolioNo(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2FolioNo_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ISIN", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsISIN(String value) {
        return new JAXBElement<String>(_AllotmentDetailsISIN_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderDate", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsOrderDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderDate_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientName", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsClientName(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2ClientName_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "STT", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsSTT(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSTT_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Remarks", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsRemarks(String value) {
        return new JAXBElement<String>(_AllotmentDetailsRemarks_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Qty", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsQty(String value) {
        return new JAXBElement<String>(_AllotmentDetailsQty_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SchemeCode", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsSchemeCode(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSchemeCode_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ValidFlag", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsValidFlag(String value) {
        return new JAXBElement<String>(_AllotmentDetailsValidFlag_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Nav", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsNav(String value) {
        return new JAXBElement<String>(_RedemptionDetailsNav_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RTASchemeCode", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsRTASchemeCode(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2RTASchemeCode_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNo", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsOrderNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderNo_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ReportDate", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsReportDate(String value) {
        return new JAXBElement<String>(_AllotmentDetailsReportDate_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Unit", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsUnit(String value) {
        return new JAXBElement<String>(_RedemptionDetailsUnit_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RTATransNo", scope = RedemptionDetails.class)
    public JAXBElement<String> createRedemptionDetailsRTATransNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsRTATransNo_QNAME, String.class, RedemptionDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "GetPasswordForChildOrderResult", scope = GetPasswordForChildOrderResponse.class)
    public JAXBElement<Response> createGetPasswordForChildOrderResponseGetPasswordForChildOrderResult(Response value) {
        return new JAXBElement<Response>(_GetPasswordForChildOrderResponseGetPasswordForChildOrderResult_QNAME, Response.class, GetPasswordForChildOrderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderStatus", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestOrderStatus(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderStatus_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FromDate", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestFromDate(String value) {
        return new JAXBElement<String>(_OrderRequestFromDate_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ToDate", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestToDate(String value) {
        return new JAXBElement<String>(_OrderRequestToDate_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Password", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestPassword(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestPassword_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler1", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestFiller1(String value) {
        return new JAXBElement<String>(_OrderRequestFiller1_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler3", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestFiller3(String value) {
        return new JAXBElement<String>(_OrderRequestFiller3_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler2", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestFiller2(String value) {
        return new JAXBElement<String>(_OrderRequestFiller2_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNo", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestOrderNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderNo_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "TransType", scope = OrderRequest.class)
    public JAXBElement<String> createOrderRequestTransType(String value) {
        return new JAXBElement<String>(_OrderRequestTransType_QNAME, String.class, OrderRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetailsRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = MandateDetails.class)
    public JAXBElement<MandateDetailsRequest> createMandateDetailsParam(MandateDetailsRequest value) {
        return new JAXBElement<MandateDetailsRequest>(_EMandateAuthURLParam_QNAME, MandateDetailsRequest.class, MandateDetails.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionStatementRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = RedemptionStatement.class)
    public JAXBElement<RedemptionStatementRequest> createRedemptionStatementParam(RedemptionStatementRequest value) {
        return new JAXBElement<RedemptionStatementRequest>(_EMandateAuthURLParam_QNAME, RedemptionStatementRequest.class, RedemptionStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = AllotmentStatementResponse2.class)
    public JAXBElement<String> createAllotmentStatementResponse2Status(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, AllotmentStatementResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Message", scope = AllotmentStatementResponse2.class)
    public JAXBElement<String> createAllotmentStatementResponse2Message(String value) {
        return new JAXBElement<String>(_ProvOrderResponseMessage_QNAME, String.class, AllotmentStatementResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAllotmentDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "AllotmentDetails", scope = AllotmentStatementResponse2.class)
    public JAXBElement<ArrayOfAllotmentDetails> createAllotmentStatementResponse2AllotmentDetails(ArrayOfAllotmentDetails value) {
        return new JAXBElement<ArrayOfAllotmentDetails>(_AllotmentDetails_QNAME, ArrayOfAllotmentDetails.class, AllotmentStatementResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderStatus", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestOrderStatus(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderStatus_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FromDate", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestFromDate(String value) {
        return new JAXBElement<String>(_OrderRequestFromDate_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ToDate", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestToDate(String value) {
        return new JAXBElement<String>(_OrderRequestToDate_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Password", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestPassword(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestPassword_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler1", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestFiller1(String value) {
        return new JAXBElement<String>(_OrderRequestFiller1_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler3", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestFiller3(String value) {
        return new JAXBElement<String>(_OrderRequestFiller3_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler2", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestFiller2(String value) {
        return new JAXBElement<String>(_OrderRequestFiller2_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNo", scope = AllotmentStatementRequest.class)
    public JAXBElement<String> createAllotmentStatementRequestOrderNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderNo_QNAME, String.class, AllotmentStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = EMandateAuthURLResponse2.class)
    public JAXBElement<String> createEMandateAuthURLResponse2Status(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, EMandateAuthURLResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ResponseString", scope = EMandateAuthURLResponse2.class)
    public JAXBElement<String> createEMandateAuthURLResponse2ResponseString(String value) {
        return new JAXBElement<String>(_ResponseResponseString_QNAME, String.class, EMandateAuthURLResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler", scope = EMandateAuthURLResponse2.class)
    public JAXBElement<String> createEMandateAuthURLResponse2Filler(String value) {
        return new JAXBElement<String>(_ResponseFiller_QNAME, String.class, EMandateAuthURLResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateDetailsResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "MandateDetailsResult", scope = MandateDetailsResponse.class)
    public JAXBElement<MandateDetailsResponse2> createMandateDetailsResponseMandateDetailsResult(MandateDetailsResponse2 value) {
        return new JAXBElement<MandateDetailsResponse2>(_MandateDetailsResponseMandateDetailsResult_QNAME, MandateDetailsResponse2.class, MandateDetailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateId", scope = MandateDetailsRequest.class)
    public JAXBElement<String> createMandateDetailsRequestMandateId(String value) {
        return new JAXBElement<String>(_MandateDetails2MandateId_QNAME, String.class, MandateDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = MandateDetailsRequest.class)
    public JAXBElement<String> createMandateDetailsRequestClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, MandateDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FromDate", scope = MandateDetailsRequest.class)
    public JAXBElement<String> createMandateDetailsRequestFromDate(String value) {
        return new JAXBElement<String>(_OrderRequestFromDate_QNAME, String.class, MandateDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ToDate", scope = MandateDetailsRequest.class)
    public JAXBElement<String> createMandateDetailsRequestToDate(String value) {
        return new JAXBElement<String>(_OrderRequestToDate_QNAME, String.class, MandateDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "EncryptedPassword", scope = MandateDetailsRequest.class)
    public JAXBElement<String> createMandateDetailsRequestEncryptedPassword(String value) {
        return new JAXBElement<String>(_ChildOrderRequestEncryptedPassword_QNAME, String.class, MandateDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = MandateDetailsRequest.class)
    public JAXBElement<String> createMandateDetailsRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, MandateDetailsRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = RedemptionStatementResponse2.class)
    public JAXBElement<String> createRedemptionStatementResponse2Status(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, RedemptionStatementResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Message", scope = RedemptionStatementResponse2.class)
    public JAXBElement<String> createRedemptionStatementResponse2Message(String value) {
        return new JAXBElement<String>(_ProvOrderResponseMessage_QNAME, String.class, RedemptionStatementResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRedemptionDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "RedemptionDetails", scope = RedemptionStatementResponse2.class)
    public JAXBElement<ArrayOfRedemptionDetails> createRedemptionStatementResponse2RedemptionDetails(ArrayOfRedemptionDetails value) {
        return new JAXBElement<ArrayOfRedemptionDetails>(_RedemptionDetails_QNAME, ArrayOfRedemptionDetails.class, RedemptionStatementResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "param", scope = MFAPI.class)
    public JAXBElement<String> createMFAPIParam(String value) {
        return new JAXBElement<String>(_MFAPIParam_QNAME, String.class, MFAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "UserId", scope = MFAPI.class)
    public JAXBElement<String> createMFAPIUserId(String value) {
        return new JAXBElement<String>(_GetPasswordUserId_QNAME, String.class, MFAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Flag", scope = MFAPI.class)
    public JAXBElement<String> createMFAPIFlag(String value) {
        return new JAXBElement<String>(_MFAPIFlag_QNAME, String.class, MFAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "EncryptedPassword", scope = MFAPI.class)
    public JAXBElement<String> createMFAPIEncryptedPassword(String value) {
        return new JAXBElement<String>(_MFAPIEncryptedPassword_QNAME, String.class, MFAPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Status", scope = MandateDetailsResponse2.class)
    public JAXBElement<String> createMandateDetailsResponse2Status(String value) {
        return new JAXBElement<String>(_ProvOrderResponseStatus_QNAME, String.class, MandateDetailsResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Message", scope = MandateDetailsResponse2.class)
    public JAXBElement<String> createMandateDetailsResponse2Message(String value) {
        return new JAXBElement<String>(_ProvOrderResponseMessage_QNAME, String.class, MandateDetailsResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMandateDetails }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MandateDetails", scope = MandateDetailsResponse2.class)
    public JAXBElement<ArrayOfMandateDetails> createMandateDetailsResponse2MandateDetails(ArrayOfMandateDetails value) {
        return new JAXBElement<ArrayOfMandateDetails>(_MandateDetails_QNAME, ArrayOfMandateDetails.class, MandateDetailsResponse2.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AOFPanSearchResponse2 }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "AOFPanSearchResult", scope = AOFPanSearchResponse.class)
    public JAXBElement<AOFPanSearchResponse2> createAOFPanSearchResponseAOFPanSearchResult(AOFPanSearchResponse2 value) {
        return new JAXBElement<AOFPanSearchResponse2>(_AOFPanSearchResponseAOFPanSearchResult_QNAME, AOFPanSearchResponse2.class, AOFPanSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "MFAPIResult", scope = MFAPIResponse.class)
    public JAXBElement<String> createMFAPIResponseMFAPIResult(String value) {
        return new JAXBElement<String>(_MFAPIResponseMFAPIResult_QNAME, String.class, MFAPIResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSELMNDR_RFD", scope = ImageUploadStatus.class)
    public JAXBElement<String> createImageUploadStatusBSELMNDRRFD(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSELMNDRRFD_QNAME, String.class, ImageUploadStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSENONDR_RFI", scope = ImageUploadStatus.class)
    public JAXBElement<String> createImageUploadStatusBSENONDRRFI(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSENONDRRFI_QNAME, String.class, ImageUploadStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSELMNDP_MFD", scope = ImageUploadStatus.class)
    public JAXBElement<String> createImageUploadStatusBSELMNDPMFD(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSELMNDPMFD_QNAME, String.class, ImageUploadStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "BSENONDP_MFI", scope = ImageUploadStatus.class)
    public JAXBElement<String> createImageUploadStatusBSENONDPMFI(String value) {
        return new JAXBElement<String>(_ImageResponseStatusBSENONDPMFI_QNAME, String.class, ImageUploadStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = GetPasswordMobile.class)
    public JAXBElement<PasswordRequest> createGetPasswordMobileParam(PasswordRequest value) {
        return new JAXBElement<PasswordRequest>(_EMandateAuthURLParam_QNAME, PasswordRequest.class, GetPasswordMobile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderStatus", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestOrderStatus(String value) {
        return new JAXBElement<String>(_OrderDetailsOrderStatus_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderType", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2OrderType_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "UserId", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestUserId(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestUserId_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ClientCode", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestClientCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestClientCode_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "FromDate", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestFromDate(String value) {
        return new JAXBElement<String>(_OrderRequestFromDate_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "ToDate", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestToDate(String value) {
        return new JAXBElement<String>(_OrderRequestToDate_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "MemberCode", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestMemberCode(String value) {
        return new JAXBElement<String>(_ChildOrderRequestMemberCode_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SubOrderType", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestSubOrderType(String value) {
        return new JAXBElement<String>(_ChildOrderDetails2SubOrderType_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Password", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestPassword(String value) {
        return new JAXBElement<String>(_EMandateAuthURLRequestPassword_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "SettType", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestSettType(String value) {
        return new JAXBElement<String>(_AllotmentDetailsSettType_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler1", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestFiller1(String value) {
        return new JAXBElement<String>(_OrderRequestFiller1_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler3", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestFiller3(String value) {
        return new JAXBElement<String>(_OrderRequestFiller3_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "Filler2", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestFiller2(String value) {
        return new JAXBElement<String>(_OrderRequestFiller2_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/StarMFWebService", name = "OrderNo", scope = RedemptionStatementRequest.class)
    public JAXBElement<String> createRedemptionStatementRequestOrderNo(String value) {
        return new JAXBElement<String>(_AllotmentDetailsOrderNo_QNAME, String.class, RedemptionStatementRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PasswordRequest }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.bsestarmf.in/2016/01/", name = "Param", scope = GetPasswordForChildOrder.class)
    public JAXBElement<PasswordRequest> createGetPasswordForChildOrderParam(PasswordRequest value) {
        return new JAXBElement<PasswordRequest>(_EMandateAuthURLParam_QNAME, PasswordRequest.class, GetPasswordForChildOrder.class, value);
    }

}
