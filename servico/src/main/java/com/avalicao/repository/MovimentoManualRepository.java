package com.avalicao.repository;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.MovimentoManualId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, MovimentoManualId> {

    @Query("SELECT m.numLancamento FROM MovimentoManual m where m.datMes = :datMes and m.datAno = :datAno")
    Optional<Long> getNumLancamento(Integer datMes, Integer datAno);

}
