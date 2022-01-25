package br.com.next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.next.beans.Seguro;

@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Long>{
}
