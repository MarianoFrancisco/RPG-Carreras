package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Carrera {
    Menu Menu = new Menu();
    public void carrera(){
        //Creamos variables iniciales para reiniciarse cada vez que se entre
        int opcion=0;
        int eleccion=1;
        int contador1=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        int contador6=0;
        //Creamos colores
        String rojoLineas ="\u001B[31m";
        String fondoMorado ="\u001B[45m";
        String fondoBlanco = "\u001B[47m";
        String amarilloFondo = "\u001B[43m";
        int aleatorioGemas= (int)(Math.random()*10);
        int aleatorioMonedas= (int)(Math.random()*10);
        Scanner entrada = new Scanner(System.in);
        while(opcion==0){
            while(eleccion!=10000000){
                //Misma idea para cada pista
                System.out.println("Ingrese cualquier número del 1 al 9 para cargar la ronda");
                CasillasAvanzadas.GeneradorCasillas();
                eleccion=entrada.nextInt();
                if(Pista.pistaSeleccionada[0]==Pista.pistaTierra ){//Si es tierra puede ingresar acá
                    //Formulas predeterminaas para ver los premios
                    int gemasGanadas = ((Carro.carroCompetencia1.getPotencia()*(aleatorioGemas+1))+Pista.pistaTierra.getCoeficienteDePista());
                    int monedasGanadas = ((Carro.carroCompetencia1.getPotencia()*(aleatorioMonedas+1))+Pista.pistaTierra.getCoeficienteDePista());
                    if(contador1<80){//Si el jugador no ha llegado a 80 sigue
                        for (int i=0;i < CasillasAvanzadas.pistaTierra6.getCasillas() ; i++){//For para crear pista
                            System.out.print(fondoBlanco+rojoLineas+"-");
                        }   
                        System.out.println(Carro.carroJugador[5].getMarca());//llamamos marca de carro
                        contador1=(contador1+CasillasAvanzadas.pistaTierra6.getCasillas());//Contadores para ver lo que se recorre
                            if(Rivales.seleccionRivales[0]!=Rivales.rivalVacio){//Si no es vacio significa que el competidor si tomo en cuenta este rival
                                if(contador2<80){//Si no ha ganado este sigue y así sucesivamente
                                    for (int i=0;i < CasillasAvanzadas.pistaTierra1.getCasillas() ; i++){
                                        System.out.print(fondoBlanco+rojoLineas+"-");
                                    }   
                                    System.out.println(Carro.carroCompetencia1.getMarca());
                                    contador2=(contador2+CasillasAvanzadas.pistaTierra1.getCasillas());
                                    if(contador3< 80){
                                        if(Rivales.seleccionRivales[1]!=Rivales.rivalVacio){
                                            for (int i=0;i < CasillasAvanzadas.pistaTierra2.getCasillas() ; i++){
                                                System.out.print(fondoBlanco+rojoLineas+"-");
                                            }   
                                            System.out.println(Carro.carroCompetencia2.getMarca());
                                            contador3=(contador3+CasillasAvanzadas.pistaTierra2.getCasillas());
                                            if(contador4< 80){
                                                if(Rivales.seleccionRivales[2]!=Rivales.rivalVacio){
                                                    for (int i=0;i < CasillasAvanzadas.pistaTierra3.getCasillas() ; i++){
                                                        System.out.print(fondoBlanco+rojoLineas+"-");
                                                    }   
                                                    System.out.println(Carro.carroCompetencia3.getMarca());
                                                    contador4=(contador4+CasillasAvanzadas.pistaTierra3.getCasillas());
                                                    if(contador5< 80){
                                                        if(Rivales.seleccionRivales[3]!=Rivales.rivalVacio){
                                                            for (int i=0;i < CasillasAvanzadas.pistaTierra4.getCasillas() ; i++){
                                                            System.out.print(fondoBlanco+rojoLineas+"-");
                                                            }   
                                                            System.out.println(Carro.carroCompetencia4.getMarca());
                                                            contador5=(contador5+CasillasAvanzadas.pistaTierra4.getCasillas());
                                                            if(contador6< 80){
                                                                if(Rivales.seleccionRivales[4]!=Rivales.rivalVacio){
                                                                    for (int i=0;i < CasillasAvanzadas.pistaTierra5.getCasillas() ; i++){
                                                                    System.out.print(fondoBlanco+rojoLineas+"-");
                                                                    }   
                                                                    System.out.println(Carro.carroCompetencia5.getMarca());
                                                                    contador6=(contador6+CasillasAvanzadas.pistaTierra5.getCasillas()); 
                                                                }
                                                            }
                                                            else{
                                                                    System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[4].getNombre()+"\n"//Dice quien ganó
                                                                    + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                                                    Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[4].getNombre());//Nombre para podio
                                                                    Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);//Se descuenta la gasolina usada
                                                                    AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                                                    AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                                                    AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                                                    AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                                                    AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                                                    AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+80);//Almacenamos valor de distancia recorrida
                                                                    AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);//Almacenamos la gasolina gastada
                                                                    System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                                                    Menu.menu(); 
                                                                } 
                                                            }
                                                    }
                                                    else{
                                                        System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[3].getNombre()+"\n"
                                                        + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                                        Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[3].getNombre());
                                                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+80);
                                                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                                        Menu.menu(); 
                                                    }
                                                
                                                }
                                            }
                                            else{
                                              System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[2].getNombre()+"\n"
                                            + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                            Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[2].getNombre());
                                            Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                            AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                            AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                            AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                            AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+80);
                                            AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                            AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                            AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                            System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                            Menu.menu();   
                                            }
                                        } 
                                    }
                                    else{
                                        System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[1].getNombre()+"\n"
                                        + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                        Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[1].getNombre());
                                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+80);
                                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                        Menu.menu();
                                    }
                                }
                                else{
                                    System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[0].getNombre()+"\n"
                                    + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                    Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[0].getNombre());
                                    Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                    AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                    AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+80);
                                    AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                    AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                    AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                    AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                    AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                    System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                    Menu.menu();
                                }
                            }
                    }
                    else{
                        System.out.println("Felicidades "+Jugador.jugador1.getNickName()+ " eres el primer lugar\n"
                                + "Ganaste "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                        Rivales.seleccionRivales[5].setNombre(Jugador.jugador1.getNickName());//Si nostros ganamos sale nuestro nombre
                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-80);
                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+80);
                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+80);
                        GemasMonedas.operacion1.setGemasAnadidas(gemasGanadas);//nos asignan los premios
                        GemasMonedas.operacion1.setMonedasAnadidas(monedasGanadas);
                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                        Menu.menu();
                    }
                }
                if(Pista.pistaSeleccionada[0]==Pista.pistaArena ){
                    int gemasGanadas = ((Carro.carroCompetencia1.getPotencia()*(aleatorioGemas+1))+Pista.pistaArena.getCoeficienteDePista());
                    int monedasGanadas = ((Carro.carroCompetencia1.getPotencia()*(aleatorioMonedas+1))+Pista.pistaArena.getCoeficienteDePista());
                    if(contador1<90){
                        for (int i=0;i < CasillasAvanzadas.pistaArena6.getCasillas() ; i++){
                            System.out.print(amarilloFondo+"-");
                        }   
                        System.out.println(Carro.carroJugador[5].getMarca());
                        contador1=(contador1+CasillasAvanzadas.pistaArena6.getCasillas());
                            if(Rivales.seleccionRivales[0]!=Rivales.rivalVacio){
                                if(contador2<90){
                                    for (int i=0;i < CasillasAvanzadas.pistaArena1.getCasillas() ; i++){
                                        System.out.print(amarilloFondo+rojoLineas+"-");
                                    }   
                                    System.out.println(Carro.carroCompetencia1.getMarca());
                                    contador2=(contador2+CasillasAvanzadas.pistaArena1.getCasillas());
                                    if(contador3< 90){
                                        if(Rivales.seleccionRivales[1]!=Rivales.rivalVacio){
                                            for (int i=0;i < CasillasAvanzadas.pistaArena2.getCasillas() ; i++){
                                                System.out.print(amarilloFondo+rojoLineas+"-");
                                            }   
                                            System.out.println(Carro.carroCompetencia2.getMarca());
                                            contador3=(contador3+CasillasAvanzadas.pistaArena2.getCasillas());
                                            if(contador4< 90){
                                                if(Rivales.seleccionRivales[2]!=Rivales.rivalVacio){
                                                    for (int i=0;i < CasillasAvanzadas.pistaArena3.getCasillas() ; i++){
                                                        System.out.print(amarilloFondo+rojoLineas+"-");
                                                    }   
                                                    System.out.println(Carro.carroCompetencia3.getMarca());
                                                    contador4=(contador4+CasillasAvanzadas.pistaArena3.getCasillas());
                                                    if(contador5< 90){
                                                        if(Rivales.seleccionRivales[3]!=Rivales.rivalVacio){
                                                            for (int i=0;i < CasillasAvanzadas.pistaArena4.getCasillas() ; i++){
                                                            System.out.print(amarilloFondo+rojoLineas+"-");
                                                            }   
                                                            System.out.println(Carro.carroCompetencia4.getMarca());
                                                            contador5=(contador5+CasillasAvanzadas.pistaArena4.getCasillas());
                                                            if(contador6< 90){
                                                                if(Rivales.seleccionRivales[4]!=Rivales.rivalVacio){
                                                                    for (int i=0;i < CasillasAvanzadas.pistaArena5.getCasillas() ; i++){
                                                                    System.out.print(amarilloFondo+rojoLineas+"-");
                                                                    }   
                                                                    System.out.println(Carro.carroCompetencia5.getMarca());
                                                                    contador6=(contador6+CasillasAvanzadas.pistaArena5.getCasillas()); 
                                                                }
                                                            }
                                                            else{
                                                                    System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[4].getNombre()+"\n"
                                                                    + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                                                    Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[4].getNombre());
                                                                    Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                                                    AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                                                    AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                                                    AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                                                    AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                                                    AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                                                    AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+90);
                                                                    AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                                                    System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                                                    Menu.menu(); 
                                                                } 
                                                            }
                                                    }
                                                    else{
                                                        System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[3].getNombre()+"\n"
                                                        + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                                        Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[3].getNombre());
                                                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+90);
                                                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                                        Menu.menu(); 
                                                    }
                                                
                                                }
                                            }
                                            else{
                                              System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[2].getNombre()+"\n"
                                            + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                            Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[2].getNombre());
                                            Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                            AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                            AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                            AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                            AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+90);
                                            AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                            AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                            AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                            System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                            Menu.menu();   
                                            }
                                        } 
                                    }
                                    else{
                                        System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[1].getNombre()+"\n"
                                        + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                        Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[1].getNombre());
                                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+90);
                                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                        Menu.menu();
                                    }
                                }
                                else{
                                    System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[0].getNombre()+"\n"
                                    + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                    Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[0].getNombre());
                                    Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                    AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                    AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+90);
                                    AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                    AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                    AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                    AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                    AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                    System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                    Menu.menu();
                                }
                            }
                    }
                    else{
                        System.out.println("Felicidades "+Jugador.jugador1.getNickName()+ " eres el primer lugar\n"
                                + "Ganaste "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                        Rivales.seleccionRivales[5].setNombre(Jugador.jugador1.getNickName());
                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-90);
                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+90);
                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+90);
                        GemasMonedas.operacion1.setGemasAnadidas(gemasGanadas);
                        GemasMonedas.operacion1.setMonedasAnadidas(monedasGanadas);
                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                        Menu.menu();
                    }
                } 
                if(Pista.pistaSeleccionada[0]==Pista.pistaConcreto ){
                    int gemasGanadas = ((Carro.carroCompetencia1.getPotencia()*(aleatorioGemas+1))+Pista.pistaConcreto.getCoeficienteDePista());
                    int monedasGanadas = ((Carro.carroCompetencia1.getPotencia()*(aleatorioMonedas+1))+Pista.pistaConcreto.getCoeficienteDePista());
                    if(contador1<100){
                        for (int i=0;i < CasillasAvanzadas.pistaConcreto6.getCasillas() ; i++){
                            System.out.print(fondoMorado+rojoLineas+"-");
                        }   
                        System.out.println(Carro.carroJugador[5].getMarca());
                        contador1=(contador1+CasillasAvanzadas.pistaConcreto6.getCasillas());
                            if(Rivales.seleccionRivales[0]!=Rivales.rivalVacio){
                                if(contador2<100){
                                    for (int i=0;i < CasillasAvanzadas.pistaConcreto1.getCasillas() ; i++){
                                        System.out.print(fondoMorado+rojoLineas+"-");
                                    }   
                                    System.out.println(Carro.carroCompetencia1.getMarca());
                                    contador2=(contador2+CasillasAvanzadas.pistaConcreto1.getCasillas());
                                    if(contador3< 100){
                                        if(Rivales.seleccionRivales[1]!=Rivales.rivalVacio){
                                            for (int i=0;i < CasillasAvanzadas.pistaConcreto2.getCasillas() ; i++){
                                                System.out.print(fondoMorado+rojoLineas+"-");
                                            }   
                                            System.out.println(Carro.carroCompetencia2.getMarca());
                                            contador3=(contador3+CasillasAvanzadas.pistaConcreto2.getCasillas());
                                            if(contador4< 100){
                                                if(Rivales.seleccionRivales[2]!=Rivales.rivalVacio){
                                                    for (int i=0;i < CasillasAvanzadas.pistaConcreto3.getCasillas() ; i++){
                                                        System.out.print(fondoMorado+rojoLineas+"-");
                                                    }   
                                                    System.out.println(Carro.carroCompetencia3.getMarca());
                                                    contador4=(contador4+CasillasAvanzadas.pistaConcreto3.getCasillas());
                                                    if(contador5< 100){
                                                        if(Rivales.seleccionRivales[3]!=Rivales.rivalVacio){
                                                            for (int i=0;i < CasillasAvanzadas.pistaConcreto4.getCasillas() ; i++){
                                                            System.out.print(fondoMorado+rojoLineas+"-");
                                                            }   
                                                            System.out.println(Carro.carroCompetencia4.getMarca());
                                                            contador5=(contador5+CasillasAvanzadas.pistaConcreto4.getCasillas());
                                                            if(contador6< 100){
                                                                if(Rivales.seleccionRivales[4]!=Rivales.rivalVacio){
                                                                    for (int i=0;i < CasillasAvanzadas.pistaConcreto5.getCasillas() ; i++){
                                                                    System.out.print(fondoMorado+rojoLineas+"-");
                                                                    }   
                                                                    System.out.println(Carro.carroCompetencia5.getMarca());
                                                                    contador6=(contador6+CasillasAvanzadas.pistaConcreto5.getCasillas()); 
                                                                }
                                                            }
                                                            else{
                                                                    System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[4].getNombre()+"\n"
                                                                    + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                                                    Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[4].getNombre());
                                                                    Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                                                    AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                                                    AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                                                    AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                                                    AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                                                    AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                                                    AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+100);
                                                                    AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                                                    System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                                                    Menu.menu(); 
                                                                } 
                                                            }
                                                    }
                                                    else{
                                                        System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[3].getNombre()+"\n"
                                                        + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                                        Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[3].getNombre());
                                                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+100);
                                                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                                        Menu.menu(); 
                                                    }
                                                
                                                }
                                            }
                                            else{
                                              System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[2].getNombre()+"\n"
                                            + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                            Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[2].getNombre());
                                            Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                            AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                            AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                            AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                            AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+100);
                                            AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                            AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                            AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                            System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                            Menu.menu();   
                                            }
                                        } 
                                    }
                                    else{
                                        System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[1].getNombre()+"\n"
                                        + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                        Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[1].getNombre());
                                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+100);
                                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                        Menu.menu();
                                    }
                                }
                                else{
                                    System.out.println("Perdiste, el ganador es"+Rivales.seleccionRivales[0].getNombre()+"\n"
                                    + "Ganó "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                                    Rivales.seleccionRivales[5].setNombre(Rivales.seleccionRivales[0].getNombre());
                                    Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-contador1);
                                    AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+contador1);
                                    AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+100);
                                    AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                                    AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                                    AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                                    AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                                    AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+contador1);
                                    System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                                    Menu.menu();
                                }
                            }
                    }
                    else{
                        System.out.println("Felicidades "+Jugador.jugador1.getNickName()+ " eres el primer lugar\n"
                                + "Ganaste "+gemasGanadas+" Gemas y "+monedasGanadas+" Monedas");
                        Rivales.seleccionRivales[5].setNombre(Jugador.jugador1.getNickName());
                        Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()-100);
                        AlmacenamientoEstadisticas.almacenar1.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar1.getDistanciaRecorrida()+100);
                        AlmacenamientoEstadisticas.almacenar2.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar2.getDistanciaRecorrida()+contador2);
                        AlmacenamientoEstadisticas.almacenar3.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar3.getDistanciaRecorrida()+contador3);
                        AlmacenamientoEstadisticas.almacenar4.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar4.getDistanciaRecorrida()+contador4);
                        AlmacenamientoEstadisticas.almacenar5.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar5.getDistanciaRecorrida()+contador5);
                        AlmacenamientoEstadisticas.almacenar6.setDistanciaRecorrida(AlmacenamientoEstadisticas.almacenar6.getDistanciaRecorrida()+contador6);
                        AlmacenamientoEstadisticas.almacenar1.setGasolinaGastada(AlmacenamientoEstadisticas.almacenar1.getGasolinaGastada()+100);
                        GemasMonedas.operacion1.setGemasAnadidas(gemasGanadas);
                        GemasMonedas.operacion1.setMonedasAnadidas(monedasGanadas);
                        System.out.println("No puedes solicitar revancha ya que no tienes suficiente gasolina");
                        Menu.menu();
                    }
                } 
            } 
        }
    }   
}
