package br.com.next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.next.beans.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Integer>{
}
