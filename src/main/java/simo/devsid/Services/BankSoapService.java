package simo.devsid.Services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import simo.devsid.Business.BusinessAccount;
import simo.devsid.Business.BusinessOperation;
import simo.devsid.Utility.PageOperation;
import simo.devsid.entities.Acount;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Component
public class BankSoapService {

    @Autowired
    BusinessAccount businessAccount;
    @Autowired
    BusinessOperation businessOperation;
    @WebMethod
    public Acount getAcount(@WebParam(name = "accountCode") String accountCode) {
        System.out.println(accountCode);
        System.out.println(businessAccount.getAcount(accountCode));
        return businessAccount.getAcount(accountCode);
    }

    @WebMethod
    public Boolean deposit(@WebParam(name = "accountCode") String accountCode,
                           @WebParam(name = "amount") double amount,
                           @WebParam(name = "employeeCode")  Long employeeCode) {
        return businessOperation.deposit(accountCode, amount, employeeCode);
    }

    @WebMethod
    public Boolean withraw(@WebParam(name = "accountCode") String accountCode,
                           @WebParam(name = "amount") double amount,
                           @WebParam(name = "employeeCode")  Long employeeCode)  {
        return businessOperation.withraw(accountCode, amount, employeeCode);
    }

    @WebMethod
    public Boolean transfer(@WebParam(name = "accountCodeSrc") String accountCodeSrc,
                            @WebParam(name = "accountCodeDst") String accountCodeDst,
                            @WebParam(name = "amount") double amount,
                            @WebParam(name = "employeeCode") Long employeeCode) {
        return businessOperation.transfer(accountCodeSrc, accountCodeDst, amount, employeeCode);
    }

    @WebMethod
    public PageOperation getOperations(@WebParam(name = "accountCode") String accountCode,
                                       @WebParam(name = "page") int page,
                                       @WebParam(name = "size") int size) {
        return businessOperation.getOperations(accountCode, page, size);
    }


}
