/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author CRISFALT
 */
public class Ciudad {
    
    private String nombre;
    
    public Ciudad() {
        nombre = "";
    }
    
    public Ciudad( final String nombre ) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre( final String nuevoNombre ) {
        this.nombre = nuevoNombre;
    }
    
//    public Ciudad getCiudad( final String nombre ) {
//        
//    }
    
}
