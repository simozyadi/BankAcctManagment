package simo.devsid.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import simo.devsid.Utility.PageOperation;
import simo.devsid.entities.*;
import simo.devsid.repository.AcountRepository;
import simo.devsid.repository.EmployeeRepository;
import simo.devsid.repository.OperationRepository;

import java.util.Date;

@Service
public class BusinessOperationImpl implements BusinessOperation{
    @Autowired
    OperationRepository oprRep;
    @Autowired
    AcountRepository    actRep;
    @Autowired
    EmployeeRepository empRep;
    @Override
    @Transactional
    public Boolean deposit(String accountCode, double amount, Long employeeCode) {
        if(amount <=0) return false;

        Employee emp = empRep.findById(employeeCode).get();
        Acount acount = actRep.findById(accountCode).get();

        Operation deposit = new Deposit();
        deposit.setAmount(amount);
        deposit.setAcount(acount);
        deposit.setEmployee(emp);
        deposit.setOperationDate(new Date());
        acount.setBalance(acount.getBalance() +amount);
        oprRep.save(deposit);
        return true;

    }

    @Override
    @Transactional
    public Boolean withraw(String accountCode, double amount, Long employeeCode) {
        Acount acount = actRep.findById(accountCode).get();
        if(acount.getBalance()<amount) throw new RuntimeException("insufficient balance");
        Employee emp = empRep.findById(employeeCode).get();
        Operation withraw = new Withdrawal();
        withraw.setAmount(amount);
        withraw.setAcount(acount);
        withraw.setEmployee(emp);
        withraw.setOperationDate(new Date());
        acount.setBalance(acount.getBalance() -amount);
        oprRep.save(withraw);
        return true;
    }

    @Override
    @Transactional
    public Boolean transfer(String accountCodeSrc, String accountCodeDst, double amount, Long employeeCode) {
        withraw(accountCodeSrc,amount,employeeCode);
        deposit(accountCodeDst,amount,employeeCode);
        return true;
    }

    @Override
    public PageOperation getOperations(String accountCode, int page, int size) {
        Page<Operation> opr = oprRep.getOperations(
                                            accountCode,
                                            PageRequest.of(page,size)
                                            );

        PageOperation pageOperation = new PageOperation();
        pageOperation.setOperations(opr.getContent());
        pageOperation.setOperationsNumberperPage(opr.getNumberOfElements());
        pageOperation.setPage(opr.getNumber());//page
        pageOperation.setTotalPages(opr.getTotalPages());
        pageOperation.setTotalOperations((int) opr.getTotalElements());
    return pageOperation;
    }
}
