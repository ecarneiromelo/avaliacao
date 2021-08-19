package com.avalicao.repository;

import com.avalicao.domain.MovimentoManual;
import com.avalicao.domain.MovimentoManualId;
import com.avalicao.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
