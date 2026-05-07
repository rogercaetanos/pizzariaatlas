package com.itb.inf3an.pizzariaatlas.model.repository;


import com.itb.inf3an.pizzariaatlas.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
