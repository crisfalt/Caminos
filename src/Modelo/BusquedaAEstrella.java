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
public class BusquedaAEstrella {
    
    private List<Camino> caminos;
    private List<Ciudad> ciudades;
    private Mapa objMapa;
    private Ciudad cOrigen;
    private Ciudad cDestino;
    private Ciudad origenRuta;
    private List<String> rutas;
    private List<Integer> pesoRuta;
    
    public BusquedaAEstrella( final Ciudad origen , final Ciudad destino , final Mapa mapaIn ) {
        this.cOrigen = origen;
        this.cDestino = destino;
        this.origenRuta = cOrigen;
        this.objMapa = mapaIn;
        caminos = objMapa.getCaminos();
        ciudades = objMapa.getCiudades();
    }
    
    public void iniciarBusqueda() {
        List<Camino> copia = caminos;
        int acumulado = 0;
        for( int i = 0 ; i < caminos.size() ; i++ ) {
            //for( int j = 0 ; j < copia.size() ; j++ ) {
                if( caminos.get(i).getCiudadA().equals(origenRuta) ) {
                    if( caminos.get(i).getCiudadB().equals(cDestino) ) {
                        acumulado += caminos.get(i).getDistancia();
                    }
                    else {
                        acumulado += caminos.get(i).getDistancia();
                        origenRuta = caminos.get(i).getCiudadB();
//                        for( int j = 0 ; j < copia.size() ; j++ ) {
//                            
//                        }
                    }
                }
            //}
        }
        System.out.println( "Acumulado : " + acumulado );
    }
    
    
    
    
}
