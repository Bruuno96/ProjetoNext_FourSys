package br.com.next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.next.beans.Cliente;
import br.com.next.beans.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer>{
	
	
	 @Query("select c from Conta c where c.numeroConta = ?1")
	 Conta findByNumberAccount(String conta);
	 
	 @Query("select c from Conta c where c.cliente")
	 Conta findAccountByClient(String cliente);
}