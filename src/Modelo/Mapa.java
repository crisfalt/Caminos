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
    
    public Camino getCamino( final String nodoA , final String nodoB ) {
        Camino caminoEncontrado = new Camino();
        for( int i = 0 ; i < caminos.size() ; i++ ) {
            if( caminos.get(i).getCiudadA().getNombre().equals(nodoA) && caminos.get(i).getCiudadB().getNombre().equals(nodoB) ) {
                caminoEncontrado = caminos.get(i);
            }
        }
        return caminoEncontrado;
    }
    
    public Ciudad getCiudad( final String nombre ) {
        Ciudad ciudad = new Ciudad();
        for( int i = 0 ; i < ciudades.size() ; i++ ) {
            if( ciudades.get(i).getNombre().equals(nombre) ) {
                ciudad = ciudades.get(i);
            }
        }
        return ciudad;
    }
    
    
}
