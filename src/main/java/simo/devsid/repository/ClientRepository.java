package simo.devsid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import simo.devsid.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long>{

}
