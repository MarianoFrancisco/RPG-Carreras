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
public class Pista {
    //Creamos variable
    private String casillas;
    private int coeficienteDePista;
    static Pista pistaTierra;
    static Pista pistaArena;
    static Pista pistaConcreto;
    static Pista pistaVacia;
    static Pista pistaSeleccionada[] =new Pista[1];//Creamos un almacenamiento para pista
    public Pista(String casillas,int coeficienteDePista){//Constructor de pista
        this.casillas = casillas;
        this.coeficienteDePista = coeficienteDePista;
    }
    //Get y set para llamar variables  
    public String getCasillas() {
        return this.casillas;
    }

    public void setCasillas(String casillas) {
        this.casillas = casillas;
    }

    public int getCoeficienteDePista() {
        return this.coeficienteDePista;
    }

    public void setCoeficienteDePista(int coeficienteDePista) {
        this.coeficienteDePista = coeficienteDePista;
    }
    public static void pistasTotales(){
        //Creamos variables de colores 
        String rojoLineas="\u001B[31m";
        String fondoMorado="\u001B[45m";
        String fondoBlanco= "\u001B[47m";
        String amarilloFondo = "\u001B[43m";
        //Imprimimos las pistas, manualmente para verse más bonitas
        pistaTierra = new Pista("\n"
                + fondoBlanco+rojoLineas+"_____________________________________________________________\n"
                + fondoBlanco+rojoLineas+"                                                             \n"
                + fondoBlanco+rojoLineas+"-------------------------------------------------------------\n"
                + fondoBlanco+rojoLineas+"_____________________________________________________________\n"
                + fondoBlanco+rojoLineas+"                                                             ",4);
        pistaArena = new Pista("\n"
                + amarilloFondo+rojoLineas+"_____________________________________________________________\n"
                + amarilloFondo+rojoLineas+"                                                             \n"
                + amarilloFondo+rojoLineas+"-------------------------------------------------------------\n"
                + amarilloFondo+rojoLineas+"_____________________________________________________________\n"
                + amarilloFondo+rojoLineas+"                                                             ",2);
        pistaConcreto = new Pista("\n"
                + fondoMorado+rojoLineas+"_____________________________________________________________\n"
                + fondoMorado+rojoLineas+"                                                             \n"
                + fondoMorado+rojoLineas+"-------------------------------------------------------------\n"
                + fondoMorado+rojoLineas+"_____________________________________________________________\n"
                + fondoMorado+rojoLineas+"                                                             ",6);
        pistaVacia = new Pista("Pista aún no seleccionada",0);//Asiganmos valores
        
    }
}
