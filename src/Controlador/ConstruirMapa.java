/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Camino;
import Modelo.Ciudad;
import Modelo.Mapa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CRISFALT
 */
public class ConstruirMapa {
    
    private Mapa objMapa;
    private List<Camino> caminos;
    private List<Ciudad> ciudades;
    private Camino objCamino;
    private Ciudad objCiudad;
    private Ciudad objCiudadA;
    private Ciudad objCiudadB;
    private int cantCiudades;
    private int cantCaminos;
    
//    public void setCantCiudades( final int cantidad ) {
//        this.cantCiudades = cantidad;
//    }
//    
//    public void setCantCaminos( final int cantidad ) {
//        this.cantCaminos = cantidad;
//    }
    
    public ConstruirMapa() {
        objMapa = new Mapa();
        ciudades = new ArrayList<Ciudad>();
        caminos = new ArrayList<Camino>();
    }
    
    public void agregarCiudad( final String nombre ) {
        objCiudad = new Ciudad( nombre );
        ciudades.add(objCiudad);
    }
    
    public void agregarCamino( final String nombreA , final String nombreB , final int distancia ) {
        for( int i = 0 ; i < ciudades.size() ; i ++ ) {
            if( ciudades.get(i).getNombre().equals(nombreA) ) {
                objCiudadA=ciudades.get(i);
//                System.out.println("encontro");
            }
            if( ciudades.get(i).getNombre().equals(nombreB) ) {
//                System.out.println("encontro");
                objCiudadB=ciudades.get(i);
            }
        }
        objCamino = new Camino( distancia , objCiudadA , objCiudadB);
        caminos.add(objCamino);
    }
    
    public void definir() {
        objMapa.setCaminos(caminos);
        objMapa.setCiudades(ciudades);
    }
    
    public Mapa getMapa() {
        return objMapa;
    }
    
    public void imprimir() {
        for( int i = 0;i < objMapa.getCiudades().size() ; i++ ) {
            System.out.println(objMapa.getCiudades().get(i).getNombre().toString());
        }
        for( int j = 0; j < objMapa.getCaminos().size() ; j++ ) {
            System.out.println("Nodo I : " + objMapa.getCaminos().get(j).getCiudadA().getNombre().toString());
            System.out.println("Nodo F : " + objMapa.getCaminos().get(j).getCiudadB().getNombre().toString());
            System.out.println("distancia : " + objMapa.getCaminos().get(j).getDistancia());
        }
    }
    
}

