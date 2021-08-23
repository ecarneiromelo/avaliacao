package com.avalicao.repository;

import com.avalicao.domain.ProdutoCosif;
import com.avalicao.util.SelectItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CosifRepository extends JpaRepository<ProdutoCosif, String> {

    @Query("select new com.avalicao.util.SelectItem(p.cosif, p.classificacao) from ProdutoCosif p where p.produto.id = :id")
    List<SelectItem> findAllByProdutoId(@Param("id") String id);
}
