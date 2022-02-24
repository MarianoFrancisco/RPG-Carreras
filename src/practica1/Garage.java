package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class Garage {
    Menu Menu = new Menu(); 
    int opcion;
    int monedasGastadasCarro1;
    Scanner entrada = new Scanner(System.in);
    public void Garage(){ 
        Garage Garage = new Garage();
        while (opcion !=8) { //Opción erronea regresa    
            System.out.println("Bienvenido al garage "+Jugador.jugador1.getNickName());
            System.out.println("Tu carro es: "+Carro.carroJugador[5].getMarca());
            GemasMonedas.resultadoGemas();//Mostrar las gemas actuales
            GemasMonedas.operacion1.setGemasAnadidas(0);//reiniciar gemasAnadidas
            GemasMonedas.resultadoMonedas();//Mostrar monedas
            GemasMonedas.operacion1.setMonedasAnadidas(0);//reiniciar monedasAnadidas
            System.out.println("Elige una opción\n"//datos del menu
                    + "1) Mejorar potencia\n"
                    + "2) Llenar tanque de gasolina\n"
                    + "3) Mejorar Llantas\n"
                    + "4) Cambiar color\n"
                    + "5) Ver propiedades del carro actual\n"
                    + "6) Comprar otro vehículo\n"
                    + "7) Cambiar carro\n"
                    + "8) Volver al Menú principal");
            opcion = entrada.nextInt();//ingreso de valor por usuario
            switch (opcion) { //opciones 
                case 1://Mejorar el motor
                    System.out.println("Seleccione su mejora\n"
                            + "1)Motor básico: Potencia 4, costo 5 Gemas\n"
                            + "2)Motor medio: Potencia 5, costo 20 Gemas\n"
                            + "3)Motor alto rendimiento: Potencia 7, 35 Gemas\n"
                            + "4)Regresar");
                    opcion = entrada.nextInt();//ingreso de valor por usuario
                    switch (opcion){
                        case 1:
                            if(Carro.carroJugador[5].getPotencia()<4){//Restriccion para que pueda comprar o no motor
                                if(GemasMonedas.operacion1.getGemasTotales()>=5){
                                  Carro.carroJugador[5].setPotencia(4);//Asiganmos nuevo motor;
                                  GemasMonedas.operacion1.setGemasAnadidas(-5);//Reducimos las monedas
                                  
                                  System.out.println("Felicidades adquiriste Motor básico");  
                                }
                                else
                                    System.out.println("No tienes suficientes Gemas");//No puede comprar si no tiene suficientes gemas
                            }
                            else 
                                System.out.println("No puedes comprar este motor, ya lo posees o ya tienes uno mejor");
                        break;
                        //Misma idea que el caso 1
                        case 2:
                            if(Carro.carroJugador[5].getPotencia()<5){
                                if(GemasMonedas.operacion1.getGemasTotales()>=20){
                                  Carro.carroJugador[5].setPotencia(5);
                                  GemasMonedas.operacion1.setGemasAnadidas(-20);
                                  System.out.println("Felicidades adquiriste Motor medio"); 
                                }
                                else
                                    System.out.println("No tienes suficientes Gemas");
                            }      
                            else
                                System.out.println("No puedes comprar este motor, ya lo posees o ya tienes uno mejor");
                        break;
                        case 3:
                            if(Carro.carroJugador[5].getPotencia()<7){
                                if(GemasMonedas.operacion1.getGemasTotales()>=35){
                                  Carro.carroJugador[5].setPotencia(7);
                                  GemasMonedas.operacion1.setGemasAnadidas(-35);
                                  System.out.println("Felicidades adquiriste Motor alto rendimiento");
                                }
                                else
                                    System.out.println("No tienes suficientes Gemas");
                            }   
                            else
                                System.out.println("No puedes comprar este motor, ya lo posees");
                        case 4:
                            Garage.Garage();
                        break;
                    }
                    break;
                case 2:
                    //Comprar gasolina
                    System.out.println("Tienes "+Carro.carroJugador[5].getGasolina() +" Galones de gasolina");
                    if(Carro.carroJugador[5].getGasolina()<100){//Si tiene llena no puede entrar
                        System.out.println("Ingresa la cantidad de galones que deseas comprar, 2.5 monedas c /g");
                        int galonesComprados;
                        int restriccionGalones;
                        double cobroGalones;
                        galonesComprados= entrada.nextInt();
                        restriccionGalones=Carro.carroJugador[5].getGasolina()+galonesComprados;//Restriccion que no puede ser más de 100
                        if(restriccionGalones<=100){
                            cobroGalones= (2.5*galonesComprados);
                            if(cobroGalones<GemasMonedas.operacion1.getMonedasTotales()){
                               Carro.carroJugador[5].setGasolina(Carro.carroJugador[5].getGasolina()+galonesComprados);
                               GemasMonedas.operacion1.setMonedasAnadidas(-cobroGalones);
                               AlmacenamientoEstadisticas.almacenar1.setGasolinaComprada(AlmacenamientoEstadisticas.almacenar1.getGasolinaComprada()+galonesComprados);// Ponemos valores a la gasolina que se compro y a el oro
                               AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+cobroGalones);
                               System.out.println("Felicidades adquiriste "+galonesComprados+" galones de gasolina"); 
                            }
                            else
                                System.out.println("No tienes suficiente dinero para comprar la cantidad insertada de galones");   
                        }
                        else
                            System.out.println("No puedes tener más de 100 galones de gasolina");
                    }
                    else
                        System.out.println("Tienes la gasolina llena");
                    break;
                case 3:
                    //Puede mejorar su llanta
                    System.out.println("Seleccione su mejora\n"
                            + "1)Calidad baja: Coeficiente 2, costo 25 Oro\n"
                            + "2)Calidad media: Coeficiente 3, costo 50 Oro\n"
                            + "3)Calidad alta: Coeficiente 5, 75 Oro\n"
                            + "4)Regresar");
                    opcion = entrada.nextInt();//ingreso de valor por usuario
                    switch (opcion){
                        case 1:
                            //Restricciones para todos si ya lo tiene no puede comprarlo y si tiene una mejor no puede comprar uno más bajo
                            if(Carro.carroJugador[5].getCoeficiente()<2){
                                if(GemasMonedas.operacion1.getMonedasTotales()>=25){
                                  Carro.carroJugador[5].setCoeficiente(2);
                                  GemasMonedas.operacion1.setMonedasAnadidas(-25);//Restamos las monedas al jugador, así con los demás
                                  AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+25);
                                  System.out.println("Felicidades adquiriste llantas Calidad baja");  
                                }
                                else
                                    System.out.println("No tienes suficientes Monedas");
                            }
                            else 
                                System.out.println("No puedes comprar estas llantas, ya las posees o ya tienes unas mejores");
                        break;
                        case 2:
                            if(Carro.carroJugador[5].getCoeficiente()<3){
                                if(GemasMonedas.operacion1.getMonedasTotales()>=50){
                                  Carro.carroJugador[5].setCoeficiente(3);
                                  GemasMonedas.operacion1.setMonedasAnadidas(-50);
                                  AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+50);
                                  System.out.println("Felicidades adquiriste llantas Calidad media");  
                                }
                                else
                                    System.out.println("No tienes suficientes Monedas");
                            }
                            else 
                                System.out.println("No puedes comprar estas llantas, ya las posees o ya tienes unas mejores");
                        break;
                        case 3:
                            if(Carro.carroJugador[5].getCoeficiente()<5){
                                if(GemasMonedas.operacion1.getMonedasTotales()>=75){
                                  Carro.carroJugador[5].setCoeficiente(5);
                                  GemasMonedas.operacion1.setMonedasAnadidas(-75);
                                  AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+75);
                                  System.out.println("Felicidades adquiriste llantas Calidad alta");  
                                }
                                else
                                    System.out.println("No tienes suficientes Monedas");
                            }
                            else 
                                System.out.println("No puedes comprar estas llantas, ya las posees");
                        case 4:
                            Garage.Garage();
                        break;
                    }
                    break;
                case 4:
                    while(opcion!=3){
                        //Compra de colores
                        System.out.println("El color tiene valor de 20 monedas\n"
                                + "Selecciona una opción: \n"
                                + "1) Ver mi color de carro\n"
                                + "2) Comprar colores\n"
                                + "3) Regresar");
                        opcion= entrada.nextInt();
                        switch(opcion){
                            case 1:
                                System.out.println("Su color actual de auto es: "
                                    + Carro.carroJugador[5].getColor()+Carro.carroJugador[5].getMarca());//llamamos carro
                                break;
                            case 2:
                                System.out.println("Seleccione el color de carro que desea"
                                                    + "\n\033[34mAzul"
                                                    + "\n\033[31mRojo"
                                                    + "\n\033[32mVerde");
                                opcion = entrada.nextInt();
                                if(GemasMonedas.operacion1.getMonedasTotales()>20){//Si tiene monedas suficientes puede comprar
                                    GemasMonedas.operacion1.setMonedasAnadidas(-20);//Restamos lo gastado
                                    switch(opcion){
                                        case 1:
                                            System.out.println("Felicidades compraste color azul");
                                            Carro.carroJugador[5].setColor("\n\033[34mAzul");
                                            AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+20);
                                            Garage.Garage();
                                            break;
                                        case 2:
                                            System.out.println("Felicidades compraste color rojo");
                                            Carro.carroJugador[5].setColor("\n\033[34mRojo");
                                            AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+20);
                                            Garage.Garage();
                                            break;
                                        case 3:
                                            System.out.println("Felicidades compraste color verde");
                                            Carro.carroJugador[5].setColor("\n\033[32mVerde");
                                            AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+20);
                                            Garage.Garage();
                                            break;
                                            default:
                                            System.out.println("Ingrese un número válido");
                                            break;
                                    }     
                                }
                                else
                                    System.out.println("No posees suficientes monedas");
                                break;
                            case 3:
                                Garage.Garage();
                            default:
                                System.out.println("Ingrese un número válido");
                                break;
                        }
                    }
                case 5:
                    //Solo llamamos los datos de nuestro carro seleccionado para que sean visibles
                    System.out.println("Su carro es: "+Carro.carroJugador[5].getMarca());
                    System.out.println("La potencia de su motor es: "+Carro.carroJugador[5].getPotencia());
                    System.out.println("El coeficiente de sus llantas es: "+Carro.carroJugador[5].getCoeficiente());
                    System.out.println("El color de su carro es: "+Carro.carroJugador[5].getColor());
                    System.out.println("La gasolina actual en su carro es: "+Carro.carroJugador[5].getGasolina());
                    break;
                case 6:
                    while (opcion!=7){
                        System.out.println("¿Qué carro desea comprar? \n"
                                + "Costo por carro 200 Monedas...Nota: Antes de comprar revisa antes tus carros y sus posiciones\n"
                                + "ya que si seleccionas un espacio donde ya este uno este se sustituirá\n"
                                + "1) "+Carro.carro1.getMarca()
                                + "\n2) "+Carro.carro2.getMarca()
                                + "\n3) "+Carro.carro3.getMarca()
                                + "\n4) "+Carro.carro4.getMarca()
                                + "\n5) "+Carro.carro5.getMarca()
                                + "\n6) "+Carro.carro6.getMarca()
                                + "\n7) Regresar y ver antes las posiciones de mis carros");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            case 1:
                                if(GemasMonedas.operacion1.getMonedasTotales()>200){//Cuando tenga mas de 200  puede ocmprar su carro
                                    GemasMonedas.operacion1.setMonedasAnadidas(-200);               
                                    while(opcion!=5){
                                        System.out.println("Felicidades adquiriste: "+Carro.carro1.getMarca()
                                                            +"\nSelecciona donde guardarlo"
                                                            + "\n1) Espacio 1"
                                                            + "\n2) Espacio 2"
                                                            + "\n3) Espacio 3"
                                                            + "\n4) Espacio 4"
                                                            + "\n5)Espacio 5");
                                        opcion = entrada.nextInt();
                                        //En estas opciones asiganmos un espacio a nuestro carro comprado y almacenamos lo gastado, así para todas las opciones
                                        switch(opcion){
                                            case 1:
                                                Carro.carroJugador[0]=Carro.carro1;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 2:
                                                Carro.carroJugador[1]=Carro.carro1;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 3:
                                                Carro.carroJugador[2]=Carro.carro1;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 4:
                                                Carro.carroJugador[3]=Carro.carro1;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 5:
                                                Carro.carroJugador[4]=Carro.carro1; 
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            default:
                                                System.out.println("Selecciona una opcion correcta");
                                        }
                                    }          
                                }
                                else
                                    System.out.println("No tienes suficientes monedas para comprar este carro");
                                break;
                            case 2:
                                if(GemasMonedas.operacion1.getMonedasTotales()>200){
                                    GemasMonedas.operacion1.setMonedasAnadidas(-200);               
                                    while(opcion!=5){
                                        System.out.println("Felicidades adquiriste: "+Carro.carro2.getMarca()
                                                            +"\nSelecciona donde guardarlo"
                                                            + "\n1) Espacio 1"
                                                            + "\n2) Espacio 2"
                                                            + "\n3) Espacio 3"
                                                            + "\n4) Espacio 4"
                                                            + "\n5) Espacio 5");
                                        opcion = entrada.nextInt();
                                        switch(opcion){
                                            case 1:
                                                Carro.carroJugador[0]=Carro.carro2;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 2:
                                                Carro.carroJugador[1]=Carro.carro2;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 3:
                                                Carro.carroJugador[2]=Carro.carro2;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 4:
                                                Carro.carroJugador[3]=Carro.carro2;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 5:
                                                Carro.carroJugador[4]=Carro.carro2; 
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            default:
                                                System.out.println("Selecciona una opcion correcta");
                                        }
                                    }          
                                }
                                else
                                    System.out.println("No tienes suficientes monedas para comprar este carro");
                                break;
                            case 3:
                                if(GemasMonedas.operacion1.getMonedasTotales()>200){
                                    GemasMonedas.operacion1.setMonedasAnadidas(-200);               
                                    while(opcion!=5){
                                        System.out.println("Felicidades adquiriste: "+Carro.carro3.getMarca()
                                                            +"\nSelecciona donde guardarlo"
                                                            + "\n1) Espacio 1"
                                                            + "\n2) Espacio 2"
                                                            + "\n3) Espacio 3"
                                                            + "\n4) Espacio 4"
                                                            + "\n5) Espacio 5");
                                        opcion = entrada.nextInt();
                                        switch(opcion){
                                            case 1:
                                                Carro.carroJugador[0]=Carro.carro3;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 2:
                                                Carro.carroJugador[1]=Carro.carro3;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 3:
                                                Carro.carroJugador[2]=Carro.carro3;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 4:
                                                Carro.carroJugador[3]=Carro.carro3;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 5:
                                                Carro.carroJugador[4]=Carro.carro3; 
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            default:
                                                System.out.println("Selecciona una opcion correcta");
                                        }
                                    }          
                                }
                                else
                                    System.out.println("No tienes suficientes monedas para comprar este carro");
                                break;
                            case 4:
                                if(GemasMonedas.operacion1.getMonedasTotales()>200){
                                    GemasMonedas.operacion1.setMonedasAnadidas(-200);               
                                    while(opcion!=5){
                                        System.out.println("Felicidades adquiriste: "+Carro.carro4.getMarca()
                                                            +"\nSelecciona donde guardarlo"
                                                            + "\n1) Espacio 1"
                                                            + "\n2) Espacio 2"
                                                            + "\n3) Espacio 3"
                                                            + "\n4) Espacio 4"
                                                            + "\n5)Espacio 5");
                                        opcion = entrada.nextInt();
                                        switch(opcion){
                                            case 1:
                                                Carro.carroJugador[0]=Carro.carro4;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 2:
                                                Carro.carroJugador[1]=Carro.carro4;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 3:
                                                Carro.carroJugador[2]=Carro.carro4;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 4:
                                                Carro.carroJugador[3]=Carro.carro4;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 5:
                                                Carro.carroJugador[4]=Carro.carro4;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            default:
                                                System.out.println("Selecciona una opcion correcta");
                                        }
                                    }          
                                }
                                else
                                    System.out.println("No tienes suficientes monedas para comprar este carro");
                                break;
                            case 5:
                                if(GemasMonedas.operacion1.getMonedasTotales()>200){
                                    GemasMonedas.operacion1.setMonedasAnadidas(-200);               
                                    while(opcion!=5){
                                        System.out.println("Felicidades adquiriste: "+Carro.carro5.getMarca()
                                                            +"\nSelecciona donde guardarlo"
                                                            + "\n1) Espacio 1"
                                                            + "\n2) Espacio 2"
                                                            + "\n3) Espacio 3"
                                                            + "\n4) Espacio 4"
                                                            + "\n5)Espacio 5");
                                        opcion = entrada.nextInt();
                                        switch(opcion){
                                            case 1:
                                                Carro.carroJugador[0]=Carro.carro5;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 2:
                                                Carro.carroJugador[1]=Carro.carro5;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 3:
                                                Carro.carroJugador[2]=Carro.carro5;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 4:
                                                Carro.carroJugador[3]=Carro.carro5;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 5:
                                                Carro.carroJugador[4]=Carro.carro5; 
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            default:
                                                System.out.println("Selecciona una opcion correcta");
                                        }
                                    }          
                                }
                                else
                                    System.out.println("No tienes suficientes monedas para comprar este carro");
                                break;
                            case 6:
                                if(GemasMonedas.operacion1.getMonedasTotales()>200){
                                    GemasMonedas.operacion1.setMonedasAnadidas(-200);               
                                    while(opcion!=5){
                                        System.out.println("Felicidades adquiriste: "+Carro.carro6.getMarca()
                                                            +"\nSelecciona donde guardarlo"
                                                            + "\n1) Espacio 1"
                                                            + "\n2) Espacio 2"
                                                            + "\n3) Espacio 3"
                                                            + "\n4) Espacio 4"
                                                            + "\n5)Espacio 5");
                                        opcion = entrada.nextInt();
                                        switch(opcion){
                                            case 1:
                                                Carro.carroJugador[0]=Carro.carro6;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 2:
                                                Carro.carroJugador[1]=Carro.carro6;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 3:
                                                Carro.carroJugador[2]=Carro.carro6;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 4:
                                                Carro.carroJugador[3]=Carro.carro6;
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            case 5:
                                                Carro.carroJugador[4]=Carro.carro6; 
                                                AlmacenamientoEstadisticas.almacenar1.setOroGastado(AlmacenamientoEstadisticas.almacenar1.getOroGastado()+200);
                                                Garage.Garage();
                                                break;
                                            default:
                                                System.out.println("Selecciona una opcion correcta");
                                        }
                                    }          
                                }
                                else
                                    System.out.println("No tienes suficientes monedas para comprar este carro");
                                break;
                            case 7:
                                break;
                            default:
                                System.out.println("Ingresa un número válido");
                                break;
                        }
                    }
                    break;
                case 7: 
                    while (opcion!=5){
                        //Llamos a todas las posiciones de carros
                        System.out.println("Selecione su carro: \n"
                            + "1) "+Carro.carroJugador[0].getMarca()
                            + "\n2) "+Carro.carroJugador[1].getMarca()
                            + "\n3) "+Carro.carroJugador[2].getMarca()
                            + "\n4) "+Carro.carroJugador[3].getMarca()
                            + "\n5) "+Carro.carroJugador[4].getMarca()
                            + "\n6) Regresar");
                        opcion = entrada.nextInt();
                        switch(opcion){
                            //Unicamente si tiene ocupado un espacio lo puede cambiar
                            case 1:
                                Carro.carroJugador[5]=Carro.carroJugador[0];
                                Menu.menu();
                                break;
                            case 2:
                                if(Carro.carroJugador[1].getPotencia()==0)
                                    System.out.println("Primero necesitas llenar este espacio con un vehículo");
                                else{
                                    Carro.carroJugador[5]=Carro.carroJugador[1];//Si tiene ocupado el espacio se le asigna nuevo valor a carro seleccionado
                                    Menu.menu();
                                }
                                break;
                            case 3:
                                if(Carro.carroJugador[2].getPotencia()==0)
                                    System.out.println("Primero necesitas llenar este espacio con un vehículo");
                                else{
                                    Carro.carroJugador[5]=Carro.carroJugador[2];
                                    Menu.menu();
                                }
                                    Carro.carroJugador[5]=Carro.carroJugador[2];
                                break;
                            case 4:
                                if(Carro.carroJugador[3].getPotencia()==0)
                                    System.out.println("Primero necesitas llenar este espacio con un vehículo");
                                else{
                                    Carro.carroJugador[5]=Carro.carroJugador[3];
                                    Menu.menu();
                                }      
                                break;
                            case 5:
                                if(Carro.carroJugador[4].getPotencia()==0)
                                    System.out.println("Primero necesitas llenar este espacio con un vehículo");
                                else{
                                    Carro.carroJugador[5]=Carro.carroJugador[4];
                                    Menu.menu();
                                }
                                break;
                            default:System.out.println("Ingresa un número valido");
                                break;
                            case 6:
                                Garage.Garage();
                                break;
                        }
                    }
                case 8:
                    Menu.menu();//Volvemos al menú
                    break;
                default: System.out.println("Ingresa un número válido");//recargar si no ingresa valor valido
                    break;
            }
        }
    }  
}
