package practica1;
import java.util.Scanner;
/**
 *
 * @author Mariano
 */
public class Jugador {
    static Scanner entrada = new Scanner(System.in);//entrada de datos
    static Jugador jugador1;//Crear jugador1
    private String nombre; 
    private String nickName;
    private int edad;
 
    public Jugador(String nombre, String nickName, int edad) {//constructor jugador
    this.nombre = nombre;
    this.nickName = nickName;
    this.edad = edad;
    }
    public String getNombre(){//recibir nombre
        return this.nombre;
    }
    public void setNombre(String nombre){//cambiar nombre
        this.nombre = nombre;
    }
    public String getNickName(){//recibir nickName
        return this.nickName;
    }
    public void setNickName(String nickName){//cambiar NickName
        this.nickName = nickName;
    }
    public int getEdad(){//recibir edad
        return this.edad;
    }
    public void setEdad(int edad){//cambiar edad
        this.edad = edad;
    }
    public static void crearJugador(){//Crear el jugador por el usuario
        System.out.println("Ingresa tu nombre");
        String nombre = entrada.next();//ingresar nombre
        System.out.println("Ingresa tu nickName");
        String nickName = entrada.next();//ingresar nickName
        System.out.println("Ingresa tu edad");
        int edad = entrada.nextInt();//ingresar edad
            jugador1 = new Jugador(nombre,nickName,edad);//jugador 1       
    }
}