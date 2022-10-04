package br.rpinfo.challenge.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.rpinfo.challenge.user.model.ServiceOrder;

//Repositório do objeto ServiceOrder
@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Integer>{
	
}
