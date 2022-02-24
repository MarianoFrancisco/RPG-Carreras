/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Mariano
 */
public class AlmacenamientoEstadisticas {
    //Parametros a asignar
    private int distanciaRecorrida;
    private double oroGastado;
    private int gasolinaGastada;
    private int gasolinaComprada;
    private String podio;
    //Creamos almacenamientos
    static AlmacenamientoEstadisticas almacenar1;
    static AlmacenamientoEstadisticas almacenar2;
    static AlmacenamientoEstadisticas almacenar3;
    static AlmacenamientoEstadisticas almacenar4;
    static AlmacenamientoEstadisticas almacenar5;
    static AlmacenamientoEstadisticas almacenar6;
    public AlmacenamientoEstadisticas(int distanciaRecorrida,double oroGastado, int gasolinaGastada,int gasolinaComprada, String podio){//Constructor
        this.distanciaRecorrida = distanciaRecorrida;
        this.oroGastado = oroGastado;
        this.gasolinaGastada = gasolinaGastada;
        this.gasolinaComprada= gasolinaComprada;
        this.podio = podio;
    }
    //Set y getter para llamar y cambiar variables

    public int getDistanciaRecorrida() {
        return this.distanciaRecorrida;
    }

    public void setDistanciaRecorrida(int distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public double getOroGastado() {
        return this.oroGastado;
    }

    public void setOroGastado(double oroGastado) {
        this.oroGastado = oroGastado;
    }

    public int getGasolinaGastada() {
        return this.gasolinaGastada;
    }
    public void setGasolinaGastada(int gasolinaGastada) {
        this.gasolinaGastada = gasolinaGastada;
    }

    public int getGasolinaComprada() {
        return this.gasolinaComprada;
    }

    public void setGasolinaComprada(int gasolinaComprada) {
        this.gasolinaComprada = gasolinaComprada;
    }

    public String getPodio() {
        return this.podio;
    }

    public void setPodio(String podio) {
        this.podio = podio;
    }
    public static void CrearEstadisticas(){
        //Almacenamiento de datos para la clase principal de estadistica y reportes
        almacenar1 = new AlmacenamientoEstadisticas(0,0,0,0,"Podio");//Variables iniciales para despues cambiarlas
        almacenar2 = new AlmacenamientoEstadisticas(0,0,0,0,"Podio");
        almacenar3 = new AlmacenamientoEstadisticas(0,0,0,0,"Podio");
        almacenar4 = new AlmacenamientoEstadisticas(0,0,0,0,"Podio");
        almacenar5 = new AlmacenamientoEstadisticas(0,0,0,0,"Podio");
        almacenar6 = new AlmacenamientoEstadisticas(0,0,0,0,"Podio");
    }
}
