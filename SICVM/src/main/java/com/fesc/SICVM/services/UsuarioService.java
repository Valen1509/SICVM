package com.fesc.SICVM.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fesc.SICVM.data.entidades.UsuarioEntity;
import com.fesc.SICVM.data.entidades.repositorios.IUsuarioRepository;
import com.fesc.SICVM.shared.UsuarioDto;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioRepository iUsuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UsuarioDto crearUsuario(UsuarioDto usuarioCrearDto){
        
        UsuarioEntity usuarioEntityDto= modelMapper.map(usuarioCrearDto, UsuarioEntity.class);
        usuarioEntityDto.setIdUsuario(UUID.randomUUID().toString());
        usuarioEntityDto.setPasswordEncripatda(bCryptPasswordEncoder.encode(usuarioCrearDto.getPassword()));

        UsuarioEntity usuarioEntity= iUsuarioRepository.save(usuarioEntityDto);
        
        UsuarioDto usuarioDto= modelMapper.map(usuarioEntity, UsuarioDto.class);

        return usuarioDto;
    }
    
}
