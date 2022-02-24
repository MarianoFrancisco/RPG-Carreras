package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Pistas {
    int opcion;//Creamos variable de eleccion
    Menu Menu = new Menu();//Llamamos a menu
    Scanner entrada = new Scanner(System.in);
    public void pistas(){
        System.out.println("Bienvenido a Pistas "+Jugador.jugador1.getNickName());
        GemasMonedas.resultadoGemas();//Mostrar las gemas actuales
        GemasMonedas.resultadoMonedas();//Mostrar monedas
        while(opcion!=3){
            System.out.println("Selecciona una opción"
                    + "\n1) Ver gasolina mínimca para competir en las pistas"
                    + "\n2) Ver pistas"
                    + "\n3) Regresar");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    //Publicamos mensaje amigable de cuando galones se descuenta por pista
                    System.out.println("Gasolina mínima para cada pista"
                            + "\n1) Pista Tierra: mínimo 80 galones"
                            + "\n2) Pista Arena: mínimo 90 galones"
                            + "\n3) Pista Concreto: mínimo 100 galones");
                    break;
                case 2:
                    // imprimos las pistas
                    System.out.println("Pista tierra " + Pista.pistaTierra.getCasillas());
                    System.out.println("Pista Arena " + Pista.pistaArena.getCasillas());
                    System.out.println("Pista Concreto " + Pista.pistaConcreto.getCasillas());
                    break;
                case 3:
                    Menu.menu();//vamos al menu
                    break;
                default:
                    System.out.println("Ingresa un número válido");
                    break;
            }
        }
    }
}
