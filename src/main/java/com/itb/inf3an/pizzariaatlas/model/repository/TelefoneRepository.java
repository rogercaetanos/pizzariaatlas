package com.itb.inf3an.pizzariaatlas.model.repository;

import com.itb.inf3bn.pizzariaboamassa.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {


}
