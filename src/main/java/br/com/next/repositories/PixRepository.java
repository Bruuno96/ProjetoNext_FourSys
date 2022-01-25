package br.com.next.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.next.beans.Pix;

@Repository
public interface PixRepository extends JpaRepository<Pix, Integer>{
}
