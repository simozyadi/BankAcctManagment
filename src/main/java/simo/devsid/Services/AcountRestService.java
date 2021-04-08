package simo.devsid.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import simo.devsid.Business.BusinessAccount;
import simo.devsid.entities.Acount;

import java.util.List;

@RestController
public class AcountRestService {


    @Autowired
    BusinessAccount businessAcount;

    @RequestMapping(value = "/acounts/{code}", method = RequestMethod.GET)
    public Acount getAcount(@PathVariable String code) {
        return businessAcount.getAcount(code);
    }
    @RequestMapping(value = "/acounts",method = RequestMethod.POST)
    public Acount saveAcount(@RequestBody Acount a) {
        return businessAcount.saveAcount(a);
    }

    /*@RequestMapping(value="/Acounts",method = RequestMethod.GET)
    public List<Acount> getAcounts() {
        return businessAcount.getAcounts();
    } */

}
