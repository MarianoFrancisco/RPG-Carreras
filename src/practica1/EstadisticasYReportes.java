package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class EstadisticasYReportes {
    Menu Menu = new Menu();
    public void estadísticasYReportes(){
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        while(opcion!=3){
            System.out.println("Bienvenido a Estadísticas y reportes "+Jugador.jugador1.getNickName());
            System.out.println("Tu carro es: "+Carro.carroJugador[5].getMarca());
            GemasMonedas.resultadoGemas();//Mostrar las gemas actuales
            GemasMonedas.resultadoMonedas();//Mostrar monedas
            System.out.println("Luego de una carrera puedes ver los cambios\n");
            System.out.println("Ingrese una opción:"
                    + "\n1)Estadisticas Partida"
                    + "\n2)Reporte de gasolina");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    //Unicamente llamos a los valores predeterminados, ahora estos se actualizarán si corre el jugador
                    System.out.println("Rivales"
                            + "\n1)"+Rivales.seleccionRivales[0].getNombre()//llamada a nombres
                            + "\n2)"+Rivales.seleccionRivales[1].getNombre()
                            + "\n3)"+Rivales.seleccionRivales[2].getNombre()
                            + "\n4)"+Rivales.seleccionRivales[3].getNombre()
                            + "\n5)"+Rivales.seleccionRivales[4].getNombre());
                    System.out.println("\nDistancia recorrida por el jugador y por rivales"
                            + "\n1)Jugador: "+AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()//llamada lo que recorrieron
                            + "\n2)Rival 1: "+AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()
                            + "\n3)Rival 1: "+AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()
                            + "\n4)Rival 1: "+AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()
                            + "\n5)Rival 1: "+AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()
                            +  "\n6)Rival 1: "+AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida());
                    //Imprimir que pista es según el coeficiente que el seleccionado tenga
                    System.out.println("\nPista"
                            + "La  pista es:");
                    if(Pista.pistaSeleccionada[0].getCoeficienteDePista()==4)
                        System.out.println("Tierra");
                    else if(Pista.pistaSeleccionada[0].getCoeficienteDePista()==2)
                        System.out.println("Arena");
                    else if(Pista.pistaSeleccionada[0].getCoeficienteDePista()==6)
                        System.out.println("Concreto");
                    else
                        System.out.println("Aún no hay pista registrada");
                    System.out.println("\nPodio Primer lugar\n"+Rivales.seleccionRivales[5].getNombre());//ganador
                    Menu.menu();
                    break;
                case 2:
                    //Hacemos llamada a la marca del carro seleccionado. almacenamiento y estadisticas para ver gasolina y oro
                    System.out.println("Nombre de vehículo: "+Carro.carroJugador[5].getMarca());
                    System.out.println("\nOro gastado: "+AlmacenamientoEstadisticas.almacenar1.getOroGastado());
                    System.out.println("\nCantidad de galones de gasolina usados: "+AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada());
                    System.out.println("\nCantidad de galones de gasolina comprados: "+AlmacenamientoEstadisticas.almacenar1.getGasolinaComprada());
                    Menu.menu();
                    break;
                case 3:
                    Menu.menu();//Volver al menu
                    break;
                    
            }
        }
    }
}
