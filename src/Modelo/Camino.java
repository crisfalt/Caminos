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
public class Camino {
    
    private int distancia;
    private Ciudad objCiudadA;
    private Ciudad objCiudadB;
    
    public Camino( final int distancia, final Ciudad ciudadA, final Ciudad ciudadB ) {
        this.distancia = distancia;
        this.objCiudadA = ciudadA;
        this.objCiudadB = ciudadB;
    }
    
    public int getDistancia() {
        return distancia;
    }
    
    public Ciudad getCiudadA() {
        return objCiudadA;
    }
    
    public Ciudad getCiudadB() {
        return objCiudadB;
    }
 
    public void setDistancia( final int nuevaDistancia ) {
        this.distancia = nuevaDistancia;
    }
    
    public void setCiudadA( final Ciudad nuevaCiudadA ) {
        this.objCiudadA = nuevaCiudadA;
    }
    
    public void setCiudadB( final Ciudad nuevaCiudadB ) {
        this.objCiudadB = nuevaCiudadB;
    }
    
}
