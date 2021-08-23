package com.avalicao.repository;

import com.avalicao.domain.Produto;
import com.avalicao.util.SelectItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {

    @Query("select new com.avalicao.util.SelectItem(p.id, p.descricao) from Produto p")
    List<SelectItem> findAllSeletItem();

}
