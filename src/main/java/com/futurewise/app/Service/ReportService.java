package com.futurewise.app.Service;

import com.futurewise.app.Dao.TpTransactionDao;
import com.futurewise.app.Exception.FuturewiseAppException;
import com.futurewise.app.Model.BseUser;
import com.futurewise.app.Model.OrderDetail;
import com.futurewise.app.Model.TpTransaction;
import com.futurewise.app.Utils.Constants;
import com.futurewise.app.Utils.Validator;
import org.springframework.stereotype.Component;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ReportService {
    BseTransactionStatusService bseTransactionStatusService;
    TpTransactionDao tpTransactionDao;
    public TpTransaction checkAndUpdateTransactionStatus1(long transactionId) throws Exception, FuturewiseAppException {
    TpTransaction tpTransaction = tpTransactionDao.getTpTransaction(transactionId);

        if (Validator.isEmpty(tpTransaction)) {
        throw new BadRequestException("Transaction not found.");
    }
    BseUser requestBean = new BseUser();
        requestBean.setAdvisorId(tpTransaction.getAdvisorId());
        requestBean.setAggregatorType(tpTransaction.getAggregatorType());
        requestBean.setBrokerCode(tpTransaction.getBrokerCode());
        requestBean.setOnlyBrokerCred(true);
    List<BseUser> bseUserList = bseUserService.getUsers(requestBean);

        if (Validator.isEmpty(bseUserList)) {
        throw new FuturewiseAppException("Broker not found.");
    } else {

            if(tpTransaction.getTransactionType().equalsIgnoreCase("SIP") && tpTransaction.getOrderStatusUpdate() == 0) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                long tpStartDate = tpTransaction.getStartDate();
                OffsetDateTime tpstartDate = OffsetDateTime.ofInstant(Instant.ofEpochMilli(tpStartDate), ZoneId.systemDefault());
                System.out.println(tpstartDate);

                LocalDate StatusDate = null;
                String statusFormatteddate = null;
                if (tpstartDate.getDayOfWeek() == DayOfWeek.SATURDAY) {
                    StatusDate = LocalDate.from(tpstartDate.plusDays(2));
                    statusFormatteddate = dtf.format(StatusDate);
                } else if (tpstartDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                    StatusDate = LocalDate.from(tpstartDate.plusDays(1));
                    statusFormatteddate = dtf.format(StatusDate);
                } else {
                    //StatusDate = LocalDate.from(tpstartDate.plusDays(1));
                    StatusDate = LocalDate.from(tpstartDate);
                    statusFormatteddate =  dtf.format(StatusDate);
                }

                if(StatusDate.isBefore(LocalDate.now())){
                    int r = checkPublicholidays(statusFormatteddate);
                    if(r==0){
                        OrderDetail orderDetail = bseTransactionStatusService.checkAndUpdateTransactionStatus1(bseUser, tpTransaction, statusFormatteddate,tpTransaction.getTransactionNumber());
                        tpTransaction = tpTransactionDao.getTpTransaction(transactionId);
                    }
                    else{
                        String message = "PENDING";
                        throw new FuturewiseAppException(message);
                    }
                } else if(StatusDate.isEqual(LocalDate.now())) {
                    int r = checkPublicholidays(statusFormatteddate);
                    if(r==0){
                        OrderDetail orderDetail = bseTransactionStatusService.checkAndUpdateTransactionStatus1(bseUser, tpTransaction, statusFormatteddate,tpTransaction.getTransactionNumber());
                        tpTransaction = tpTransactionDao.getTpTransaction(transactionId);
                    }
                    else{
                        String message = "PENDING";
                        throw new FuturewiseAppException(message);
                    }
                }
                else{
                    String message = "PENDING";
                    throw new FuturewiseAppException(message);
                }
            }
            else{
                OrderDetail orderDetail = bseTransactionStatusService.checkAndUpdateTransactionStatus(bseUser, tpTransaction);
                tpTransaction = tpTransactionDao.getTpTransaction(transactionId);
            }
        }
        return tpTransaction;
    }

    public int checkPublicholidays(String statusFormatteddate) {
        int r = 0;
        for (String i : Constants.PUBLIC_HOLIDAYS_2022) {
            if ((statusFormatteddate.equalsIgnoreCase(i))) {
                r=1;
                break;
            }
            else{
                r=0;
            }
        }
        return r;
    }
}


