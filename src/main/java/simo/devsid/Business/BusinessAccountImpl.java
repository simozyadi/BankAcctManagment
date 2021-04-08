package simo.devsid.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simo.devsid.entities.Acount;
import simo.devsid.repository.AcountRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
@Service
public class BusinessAccountImpl implements  BusinessAccount{
    @Autowired
    AcountRepository rep;

    @Override
    public Acount saveAcount(Acount a) {

        if(a.getCreateDate() == null) {
            Date now = new Date();
            a.setCreateDate(now);
        }
        return rep.save(a);
    }


    @Override
    public List<Acount> getAcounts() {
        return rep.findAll();
    }

    @Override
    public Acount getAcount(String accountCode) {
        return rep.findById(accountCode).get();
    }
}
