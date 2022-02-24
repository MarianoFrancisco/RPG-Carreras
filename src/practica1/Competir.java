package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Competir {
    Menu Menu = new Menu();
    public void competir(){
        int opcion=0;
        ElegirCarro ElegirCarro=new ElegirCarro();
        Scanner entrada = new Scanner(System.in);
        while(opcion!=3){
            System.out.println("Bienvenido a competir "+Jugador.jugador1.getNickName());
            System.out.println("Tu carro es: "+Carro.carroJugador[5].getMarca());
            GemasMonedas.resultadoGemas();//Mostrar las gemas actuales
            GemasMonedas.resultadoMonedas();//Mostrar monedas
            System.out.println("Selecciona la pista que usarás"
                    + "\n1) Pista Tierra"
                    + "\n2) Pista Arena"
                    + "\n3) Pista Concreto"
                    + "\n4) Regresar");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    Pista.pistaSeleccionada[0]=Pista.pistaTierra;//Llamamos pista tierra a seleccionada
                    ElegirCarro.elegirCarro();
                    break;
                case 2:
                    Pista.pistaSeleccionada[0]=Pista.pistaArena;//Pista arena seleccionada
                    ElegirCarro.elegirCarro();
                    break;
                case 3:
                    Pista.pistaSeleccionada[0]=Pista.pistaConcreto;//pista concreto seleccionada
                    ElegirCarro.elegirCarro();//Envia a elegir carro
                    break;
                case 4:
                    Menu.menu();
                default:
                    System.out.println("Ingresa una opción valida");
                    break;
            }
        }
        
    }
}
