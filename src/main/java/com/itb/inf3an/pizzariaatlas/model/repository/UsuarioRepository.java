package com.itb.inf3an.pizzariaatlas.model.repository;


import com.itb.inf3an.pizzariaatlas.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


}
