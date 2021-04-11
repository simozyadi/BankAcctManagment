package simo.devsid.Business;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import simo.devsid.Utility.PageOperation;

public interface BusinessOperation {

    Boolean deposit(String accountCode,double amount,Long employeeCode);
    Boolean withraw(String accountCode, double amount, Long employeeCode);
    Boolean transfer(String accountCodeSrc,String accountCodeDst,double amount,Long employeeCode);
    PageOperation getOperations(String accountCode, int page,int size);
}
