package br.com.jamesalves.transfersata.repository;

import br.com.jamesalves.transfersata.model.Exame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExameDAO extends JpaRepository<Exame, Long> {

}