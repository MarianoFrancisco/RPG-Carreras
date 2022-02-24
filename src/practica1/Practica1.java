package practica1;
/**
 * @author Mariano
 */
import java.util.Scanner;//Para ingreso de datos del usuario
public class Practica1 {
    static Scanner entrada = new Scanner(System.in); //
    public static void main(String[] args) {
        Menu Menu = new Menu();//Llamamos el menu
        int opcion = 0;
        OUTER:
        while (opcion !=2) { //Opción erronea regresa
            //Terminos
            System.out.println("Terminos y condiciones ©Mariano\n"
                    + "Este material es para exclusivo de entretenimiento del usuario, por lo cual\n"
                    + "queda completamente prohibido la comercialización y cualquier metodo lucrativo\n"
                    + "en caso de hacer lo contrario se llevará a cuestiones legales. \n"
                    + "¿Aceptas los terminos y condiciones? \n"
                    + "1) Si acepto\n"
                    + "2) No acepto");
            opcion = entrada.nextInt();
            switch (opcion) { //solo si acepta puede continuar
                case 1:
                    System.out.println("Bienvenido al mejor RPG de carros");
                    AlmacenamientoEstadisticas.CrearEstadisticas();//Creamos datos de almacenamiento
                    Rivales.crearRivales();//Creamos Rivales
                    //Ceamos Rivales vacios
                    Rivales.seleccionRivales[0]=Rivales.rivalVacio;
                    Rivales.seleccionRivales[1]=Rivales.rivalVacio;
                    Rivales.seleccionRivales[2]=Rivales.rivalVacio;
                    Rivales.seleccionRivales[3]=Rivales.rivalVacio;
                    Rivales.seleccionRivales[4]=Rivales.rivalVacio;
                    Rivales.seleccionRivales[5]=Rivales.rivalVacio;//Ganador
                    Jugador.crearJugador();//Creamos el personaje
                    GemasMonedas.asignarValoresIniciales();//Damos valores iniciales de dinero
                    Carro.carros(); //Creamos carros
                    Pista.pistasTotales();//Creamos pistas
                    int seleccionCarro;//Seleccionador switch
                    //Caracteristicas de carros iniciales
                    System.out.println("Selecciona un carro\n"
                            + "----1)Toyota\n"
                            + "Potencia de motor génerico: 2"
                            + "\nCoeficiente de Llantas genéricas: 1"
                            + "\nColor amarillo"
                            + "\nGalones de gasolina 100"
                            + "\n---2)Lexus\n"
                            + "Potencia de motor génerico: 2"
                            + "\nCoeficiente de Llantas genéricas: 1"
                            + "\nColor amarillo"
                            + "\nGalones de gasolina 100"
                            + "\n---3)Subaru\n"
                            + "Potencia de motor génerico: 2"
                            + "\nCoeficiente de Llantas genéricas: 1"
                            + "\nColor amarillo"
                            + "\nGalones de gasolina 100");
                    Pista.pistaSeleccionada[0]=Pista.pistaVacia;//Asignamos valor vacio a la pista
                    //Asiganmos valores vacios a la lista de carros 
                    Carro.carroJugador[1]=Carro.carroVacio;
                    Carro.carroJugador[2]=Carro.carroVacio;
                    Carro.carroJugador[3]=Carro.carroVacio;
                    Carro.carroJugador[4]=Carro.carroVacio;
                    //entrada del usuario
                    seleccionCarro = entrada.nextInt();
                    switch (seleccionCarro) {
                        //Al elegir le asignamos un carro al almacenamiento del usuario
                        case 1:
                            Carro.carroJugador[0] = Carro.carro1;
                            Carro.carroJugador[5] = Carro.carroJugador[0];
                            break;
                        case 2: 
                            Carro.carroJugador[0] = Carro.carro2;
                            Carro.carroJugador[5] = Carro.carroJugador[0];
                            break;
                        case 3:
                            Carro.carroJugador[0] = Carro.carro3;
                            Carro.carroJugador[5] = Carro.carroJugador[0];
                            break;
                        default:
                            System.out.println("Ingresa un número válido");
                            break;
                        }
                    Menu.menu(); //Mandamos al menú
                    break OUTER;
                case 2:
                    //Un carro de despedida
                    System.out.println("Gracias por tu tiempo\n"
                            + "             __--~~~~~~~~~~~~~~~~~~--__                  \n" +
                            "    ___    _-~                        ~-_ \\   ___  \n" +
                            "   `\\__)\\/~                              ~\\/(__/'          \n" +
                            "    _--`-___                            ___-'--_        \n" +
                            "  /~     `\\ ~~~~~~~~------------~~~~~~~~ /'     ~\\        \n" +
                            " /|        `\\         ________         /'        |\\     \n" +
                            "| `\\   ______`\\_      \\------/      _/'______   /' |          \n" +
                            "|   `\\_~-_____\\ ~-________________-~ /_____-~_/'   |  \n" +
                            "`.     ~-__________________________________-~     .'       \n" +
                            " `.      [_______/------|~~|------\\_______]      .'\n" +
                            "  `\\--___((____)(________\\/________)(____))___--/'           \n" +
                            "   |>>>>>>||                            ||<<<<<<|");//Si no acepa
                    System.exit(0);
                default: System.out.println("Ingresa un número válido");
                    break;
            }
        }      
    }
}