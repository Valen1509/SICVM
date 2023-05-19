package com.fesc.SICVM.data.repositorios;

import com.fesc.SICVM.data.entidades.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;


public interface IUsuarioRepository extends CrudRepository<UsuarioEntity, Long> {

}
