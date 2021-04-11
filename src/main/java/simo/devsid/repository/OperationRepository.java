package simo.devsid.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import simo.devsid.entities.Acount;
import simo.devsid.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{
     @Query("select o from Operation o where o.acount.accountCode=:x")
     Page<Operation> getOperations(@Param("x") String accountCode, Pageable pageable);

     @Deprecated
     Page<Operation> findByAcount(Acount acount,Pageable pegeable);

}
