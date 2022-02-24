package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Rivales {
    static Scanner entrada = new Scanner(System.in);//entrada de datos
    private String nombre;
    static Rivales rivalVacio;//Crear rival vacio
    //Crear rivales
    static Rivales rivales1;
    static Rivales rivales2;
    static Rivales rivales3;
    static Rivales rivales4;
    static Rivales rivales5;
    static Rivales seleccionRivales[] = new Rivales[6];//alamacenamiento de rivales
    public Rivales(String nombre) {//constructor jugador
    this.nombre = nombre;
    }

    public String getNombre(){//recibir nombre
        return this.nombre;
    }
    public void setNombre(String nombre){//cambiar nombre
        this.nombre = nombre;
    }
    public static void crearRivales(){//Crear nombre rivales
        rivales1 = new Rivales("Tatsumi ║[==]D");
        rivales2 = new Rivales("Yuudai ║[==]D");
        rivales3 = new Rivales("Ikki ║[==]D");
        rivales4 = new Rivales("Sora ║[==]D");
        rivales5 = new Rivales("Kenji ║[==]D");
        rivalVacio = new Rivales("Vacio");
    }
}
