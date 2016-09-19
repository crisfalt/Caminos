/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author CRISFALT
 */
public class Mapa {
    
    private List<Camino> caminos;
    private List<Ciudad> ciudades;
    
    public Mapa() {
        
    }
    
    public void setCaminos( final List<Camino> nuevosCaminos ) {
        this.caminos = nuevosCaminos;
    }
    
    public void setCiudades( final List<Ciudad> nuevasCiudades ) {
        this.ciudades = nuevasCiudades;
    }
    
    public List<Camino> getCaminos() {
        return this.caminos;
    }
    
    public List<Ciudad> getCiudades() {
        return this.ciudades;
    }
    
}
