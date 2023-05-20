package com.fesc.SICVM.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fesc.SICVM.models.peticiones.UsuarioCrearRequestModel;
import com.fesc.SICVM.models.respuestas.UsuarioDataRestModel;
import com.fesc.SICVM.services.IUsuarioService;
import com.fesc.SICVM.shared.UsuarioDto;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    IUsuarioService iUsuarioService;

    @GetMapping
    public String leerUsuario(){
        return "valen";
    }
    
    @PostMapping
    public UsuarioDataRestModel crearUsuario(@RequestBody UsuarioCrearRequestModel usuarioCrearRequestModel) {

        UsuarioDto usuarioCrearDto= modelMapper.map(usuarioCrearRequestModel, UsuarioDto.class);

        UsuarioDto usuarioDto= iUsuarioService.crearUsuario(usuarioCrearDto);

        UsuarioDataRestModel usuarioDataRestModel= modelMapper.map(usuarioDto, UsuarioDataRestModel.class);
        
        return usuarioDataRestModel;
    }
}
