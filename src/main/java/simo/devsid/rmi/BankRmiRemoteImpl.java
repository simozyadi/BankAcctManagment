package simo.devsid.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import simo.devsid.Business.BusinessAccount;
import simo.devsid.Business.BusinessOperation;
import simo.devsid.entities.Acount;

import java.rmi.RemoteException;

@Component("bankRmiService")
public class BankRmiRemoteImpl implements BankRmiRemote{
    @Autowired
    BusinessAccount businessAccount;
    @Autowired
    BusinessOperation businessOperation;

    @Override
    public Acount saveAcount(Acount acount) throws RemoteException {
        return businessAccount.saveAcount(acount);
    }

    @Override
    public Acount GetAcount(String accountCode) throws RemoteException {
        return businessAccount.getAcount(accountCode);
    }

    @Override
    public Boolean deposit(String accountCode, double amount, Long employeeCode) throws RemoteException {
        return businessOperation.deposit(accountCode,amount,employeeCode);
    }

    @Override
    public Boolean withraw(String accountCode, double amount, Long employeeCode) throws RemoteException {
        return businessOperation.withraw(accountCode,amount,employeeCode);
    }

    @Override
    public Boolean transfer(String accountCodeSrc, String accountCodeDst, double amount, Long employeeCode) throws RemoteException {
        return businessOperation.transfer(accountCodeSrc,accountCodeDst,amount,employeeCode);
    }
}
