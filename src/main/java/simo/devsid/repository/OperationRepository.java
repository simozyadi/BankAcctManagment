package simo.devsid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import simo.devsid.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
