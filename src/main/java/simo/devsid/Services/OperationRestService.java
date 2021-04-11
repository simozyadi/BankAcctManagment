package simo.devsid.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import simo.devsid.Business.BusinessOperation;
import simo.devsid.Utility.PageOperation;

@RestController
public class OperationRestService {
    @Autowired
    private BusinessOperation businessOperation;

    @RequestMapping(value = "/operations",method = RequestMethod.GET)
    public PageOperation getOperations(@RequestParam String accountCode,
                                       @RequestParam int page,
                                       @RequestParam int size) {
        return businessOperation.getOperations(accountCode, page, size);
    }

    @RequestMapping(value = "/deposit",method = RequestMethod.PUT)
    public Boolean deposit(@RequestParam String accountCode,
                           @RequestParam double amount,
                           @RequestParam Long employeeCode) {
        return businessOperation.deposit(accountCode, amount, employeeCode);
    }
    @RequestMapping(value = "/withraw",method = RequestMethod.PUT)
    public Boolean withraw(@RequestParam String accountCode,
                           @RequestParam double amount,
                           @RequestParam Long employeeCode) {
        return businessOperation.withraw(accountCode, amount, employeeCode);
    }
    @RequestMapping(value = "/transfer",method = RequestMethod.PUT)
    public Boolean transfer(@RequestParam String accountCodeSrc,
                            @RequestParam String accountCodeDst,
                            @RequestParam double amount,
                            @RequestParam Long employeeCode) {
        return businessOperation.transfer(accountCodeSrc, accountCodeDst, amount, employeeCode);
    }


}
