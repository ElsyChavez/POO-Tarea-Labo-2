/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controltienda;

/**
 *
 * @author elsyc
 */

public class Proveedor {
    private String nombre;
    private String telefono;
    private String empresa;

    public Proveedor() {}
    
    public Proveedor(String nombre, String telefono, String empresa) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
    
}
