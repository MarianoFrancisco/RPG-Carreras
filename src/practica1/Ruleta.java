package practica1;
import java.util.Scanner;
/**
 *
 * @author Mariano
 */
public class Ruleta {
    Menu Menu = new Menu(); 
    Scanner entrada = new Scanner(System.in);//entrada de datos
    public int suerte(){//Crear variable para asignar valores en el switch
        double aleatorio = Math.random();//numero aleatorio
        if(aleatorio <= 0.1)//0 a 0.1 probabilidad de que caiga
            return 0;
        else if(aleatorio <=0.25)//0.1 a 0.25 probabilidad de que caiga
            return 1;  
        else if(aleatorio<=0.30)//0.25 a 0.30 probabilidad de que caiga
            return 2;  
        else if(aleatorio<=0.35)//0.30 a 0.35 probabilidad de que caiga
            return 3;
        else if(aleatorio<=0.65)//0.35 a 0.65 probabilidad de que caiga.
            return 4;
        else//0.65 probabilidad de que caiga
            return 5;
    }
    public int getValor(){
        return this.suerte();//llamar el valor suerte asignado para el switch
    }
    public void ruleta(){//ruleta
        int opcion = 0;
        while(opcion !=2){//ciclo para establecer restricciones al usuario
            //Llamamos todos los datos del jugador y establecemos que puede hacer en la ruleta
            System.out.println("Bienvenido a la ruleta "+Jugador.jugador1.getNickName());
            GemasMonedas.resultadoGemas();
            GemasMonedas.resultadoMonedas();
            System.out.println("El costo para girar es de 5 gemas, puedes ganar 40 Gemas \n"
                    + "75 Oro,1000 Gemas, 2000 Oro, 5 Gemas, 10 Oro");
            System.out.println("Seleccione una opción\n"
                    + "1) Jugar ruleta\n"
                    + "2) Regresar");
            opcion = entrada.nextInt();//elegir si regresar al menu o jugar
            switch(opcion){
                case 1:   
                    if( GemasMonedas.operacion1.getGemasTotales()>= 5){//si tiene 5 gemas o mas puede jugar
                        GemasMonedas.operacion1.setGemasAnadidas(-5);//le quitamos las gemas gastadas
                        //nota reducirle 5 a gemasAnadidas por la jugada
                        switch (this.suerte()){//lamamos al valor suerte
                            case 0:
                                GemasMonedas.operacion1.setGemasAnadidas(35);//0.10 probabilidad para ganar
                                System.out.println("Felicidades ganaste 40 Gemas");
                                break;
                            case 1:
                                GemasMonedas.operacion1.setMonedasAnadidas(75);//0.15 probabilidad para ganar
                                System.out.println("Felicidades ganaste 75 oro");
                                break;
                            case 2:
                                GemasMonedas.operacion1.setGemasAnadidas(995);//0.05 probabilidad para ganar
                                System.out.println("Felicidades ganaste 1000 Gemas");
                                break;
                            case 3:
                                GemasMonedas.operacion1.setMonedasAnadidas(2000);//0.05 probabilidad para ganar
                                System.out.println("Felicidades ganaste 2000 oro");
                                break;
                            case 4:
                                GemasMonedas.operacion1.setGemasAnadidas(0);//0.30 probabilidad para ganar
                                System.out.println("Felicidades ganaste 5 Gemas");
                                break;
                            case 5:
                                GemasMonedas.operacion1.setMonedasAnadidas(10);//0.35 probabilidad para ganar
                                System.out.println("Felicidades ganaste 10 monedas");
                                break;
                            default:
                                break;
                        }
                    }
                    else {
                        System.out.println("No tienes suficientes Gemas");//Si no tiene 5 gemas regresa al menu
                        Menu.menu();
                    }
                case 2:
                    Menu.menu();//Opcion de regresar
                default :System.out.println("Ingresa un número válido");//Si ingresa un valor no establecido
                break;      
            }
        }
    }
}
