/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.AsignarCaminos;
import Controlador.AsignarCiudades;
import Modelo.Camino;
import Modelo.Ciudad;
import java.util.Scanner;

/**
 *
 * @author CRISFALT
 */
public class IGUMapa {
    
//    private Camino objCaminoIN;
//    private Ciudad objCiudadIN;
    private Scanner entradaUsuario;
    private AsignarCaminos objCaminoIN;
    private AsignarCiudades objCiudadIN;
    
    // Variables
    private int cantCiudades;
    private int cantCaminos;
    private String nombreA;
    private String nombreB;
    private int distancia;

    
    public IGUMapa() {
        entradaUsuario = new Scanner(System.in);
        cantCiudades = 0;
        cantCaminos = 0;
    }
    
    public void show() {
        System.out.println("Cantidad de ciudades : ");
        cantCiudades = entradaUsuario.nextInt();
        for( int i = 0 ; i < cantCiudades ; i++ ) {
            objCiudadIN = new AsignarCiudades();
            System.out.println("Nombre Ciudad " + (i+1)+ " : ");
            objCiudadIN.asignar(entradaUsuario.next());//asignamos las ciudades
        }
        System.out.println("Cantidad de caminos : ");
        cantCaminos = entradaUsuario.nextInt();
        for( int i = 0 ; i < cantCaminos ; i++ ) {
            objCaminoIN = new AsignarCaminos();
            System.out.println("Ciudad A : " );
            nombreA = entradaUsuario.next();
            System.out.println("Ciudad B : " );
            nombreB = entradaUsuario.next();
            System.out.println("Distancia : " );
            distancia = entradaUsuario.nextInt();
            objCaminoIN.asignar(distancia,nombreA,nombreB);//asignamos los caminos
        }
    }
    
}