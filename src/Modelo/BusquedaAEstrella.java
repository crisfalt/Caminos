/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
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
        rutas = new ArrayList<String>();
        pesoRuta = new ArrayList<Integer>();
        caminos = objMapa.getCaminos();
        ciudades = objMapa.getCiudades();
    }
    
    public List<Ciudad> getVecinos( final Ciudad ciudadBuscar ,  String rutaIn ) {
        List<Ciudad> encontrados  = new ArrayList<Ciudad>();
        for( int i = 0 ; i < caminos.size() ; i++ ) {
            if( caminos.get(i).getCiudadA().equals(ciudadBuscar) ) {
                encontrados.add(caminos.get(i).getCiudadB());
                rutaIn+=caminos.get(i).getCiudadB().getNombre().toString();
            }
        }
        return encontrados;
    }
    
    public void sumarRuta( final int peso ) {
        
    }
        
    
    public void iniciarBusqueda() {
            String ruta = cOrigen.getNombre();
            int acumulado = 0;
            for( int i = 0 ; i < caminos.size() ; i++ ) {
                    if( caminos.get(i).getCiudadA().equals(origenRuta) ) {
                        if( caminos.get(i).getCiudadB().equals(cDestino) ) {
                            acumulado += caminos.get(i).getDistancia();
                            ruta+=caminos.get(i).getCiudadB().getNombre();
                        }
                        else {
                            acumulado += caminos.get(i).getDistancia();
                            ruta+=caminos.get(i).getCiudadB().getNombre();
                            origenRuta = caminos.get(i).getCiudadB();
                        }
                    }
            }

            System.out.println( "Ruta : " + ruta );
            System.out.println( "Acumulado : " + acumulado );

    }
    
    
    
    
}
