package simo.devsid.Business;

public interface BusinessOperation {

    Boolean deposit(String accountCode,double amount,Long employeeCode);
    Boolean withraw(String accountCode, double amount, Long employeeCode);
    Boolean transfer(String accountCodeSrc,String accountCodeDst,double amount,Long employeeCode);
}
