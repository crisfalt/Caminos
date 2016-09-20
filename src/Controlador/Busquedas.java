/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.BusquedaAEstrella;
import Modelo.Mapa;

/**
 *
 * @author CRISFALT
 */
public class Busquedas {
    
    private String ciudadOrigen;
    private String ciudadDestino;
    private BusquedaAEstrella objBusquedaAEstrella;
    private Mapa objMapa;
    
    public Busquedas( final String origen , final String destino , Mapa mapa ) {
        this.ciudadOrigen = origen;
        this.ciudadDestino = destino;
        this.objMapa = mapa;
    }
    
    public void busquedaAEstrella() {
        objBusquedaAEstrella = new BusquedaAEstrella(objMapa.getCiudad(ciudadOrigen),objMapa.getCiudad(ciudadDestino), objMapa);
        objBusquedaAEstrella.iniciarBusqueda();
    }
    
    
    
    
}
