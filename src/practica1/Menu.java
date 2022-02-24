package practica1;
import java.util.Scanner;
/**
 *
 * @author Mariano
 */
public class Menu {
    int opcion;//Variable para opcion
    Scanner entrada = new Scanner(System.in);//Entrada de datos
    public void menu(){ 
        EstadisticasYReportes EstadisticasYReportes = new EstadisticasYReportes();//Llamar las estadísticas y reportes
        Competir Competir = new Competir();//Llamar a cometir
        Pistas Pistas = new Pistas();//Llamar a mis pistas
        Ruleta Ruleta = new Ruleta();//llamar a la ruleta
        Garage Garage = new Garage();//llamar al garage
        while (opcion !=6) { //Opción erronea regresa
            //Datos generales
            System.out.println("Bienvenido al menu "+Jugador.jugador1.getNickName());
            System.out.println("Tu carro es: "+Carro.carroJugador[5].getMarca());
            System.out.println("Por inicio de juego tienes");            
            GemasMonedas.resultadoGemas();//Mostrar las gemas actuales
            GemasMonedas.operacion1.setGemasAnadidas(0);//reiniciar gemasAnadidas
            GemasMonedas.resultadoMonedas();//Mostrar monedas
            GemasMonedas.operacion1.setMonedasAnadidas(0);//reiniciar monedasAnadidas
            System.out.println("Elige una opción\n"//datos del menu
                    + "1) Competir\n"
                    + "2) Ruleta\n"
                    + "3) Garage\n"
                    + "4) Pistas\n"
                    + "5) Estadísticas y reportes\n"
                    + "6) Salir");
            opcion = entrada.nextInt();//ingreso de valor por usuario
            switch (opcion) { //opciones 
                case 1:
                    Competir.competir();//llamar a competir
                case 2:
                    Ruleta.ruleta();//llamar a la ruleta
                case 3:
                    Garage.Garage();//llamar al garage
                case 4:
                    Pistas.pistas();//llamar a pistas
                case 5:
                    EstadisticasYReportes.estadísticasYReportes();//llamar a estadísticas y reportes
                case 6:
                    System.exit(0);//salir
                default: System.out.println("Ingresa un número válido");//recargar si no ingresa valor valido
                    break;
            }
        }
    }    
}
