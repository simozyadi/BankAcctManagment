package simo.devsid.Business;

import simo.devsid.entities.Acount;

import java.util.List;

public interface BusinessAccount {
    Acount saveAcount(Acount a);
    List<Acount> getAcounts();
    Acount getAcount( String accountCode);
}
