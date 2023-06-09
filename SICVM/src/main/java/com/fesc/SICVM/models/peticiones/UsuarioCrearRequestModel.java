package com.fesc.SICVM.models.peticiones;

import java.util.Date;

public class UsuarioCrearRequestModel {

    private String nombre;
    private String apellido;
    private String documento;
    private Date fNacimiento;
    private String telefono;
    private String email;
    private String password;
    

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public Date getfNacimiento() {
        return fNacimiento;
    }
    
    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
}
