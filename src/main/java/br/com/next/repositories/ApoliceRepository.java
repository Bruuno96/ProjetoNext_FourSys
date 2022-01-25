package br.com.next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.next.beans.Apolice;

@Repository
public interface ApoliceRepository extends JpaRepository<Apolice, Long>{
}
