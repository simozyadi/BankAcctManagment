package simo.devsid.rmi;

import simo.devsid.entities.Acount;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankRmiRemote  extends Remote {
    Acount saveAcount(Acount acount) throws RemoteException;
    Acount GetAcount(String accountCode) throws RemoteException;
    Boolean deposit(String accountCode,double amount,Long employeeCode ) throws RemoteException;
    Boolean withraw(String accountCode,double amount,Long employeeCode ) throws RemoteException;
    Boolean transfer(String accountCodeSrc,String accountCodeDst,double amount,Long employeeCode) throws RemoteException;
}
