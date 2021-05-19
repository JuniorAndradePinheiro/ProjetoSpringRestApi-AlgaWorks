package com.algaworks.algalog.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algawoks.algalog.domain.model.Cliente;

//herdando  da interface JPA Repository. Está sendo informado o tipo da entidade que será gerenciada por esse repositorio e o tipo do ID(no caso é? "Cliente, Long")
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
