package io.github.mpeapp.repository;

import io.github.mpeapp.model.Pais;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaisRepository extends CrudRepository<Pais, Long> {

    List<Pais> findBySigla(String sigla);
    List<Pais> findByNome(String nome);

}
