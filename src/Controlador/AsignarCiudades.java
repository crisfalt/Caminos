/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Camino;
import Modelo.Ciudad;

/**
 *
 * @author CRISFALT
 */
public class AsignarCiudades {
    
    private Ciudad objCiudadIN;
    
    public void asignar( final String nombre ) {
        objCiudadIN = new Ciudad(nombre);
    }
    
}
