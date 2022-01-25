package br.com.next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.next.beans.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
}
