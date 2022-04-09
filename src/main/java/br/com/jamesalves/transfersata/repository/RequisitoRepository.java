package br.com.jamesalves.transfersata.repository;

import br.com.jamesalves.transfersata.model.Requisito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequisitoRepository extends JpaRepository<Requisito, Long> {
}