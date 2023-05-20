package com.fesc.SICVM.data.entidades.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fesc.SICVM.data.entidades.UsuarioEntity;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long> {
    
}
