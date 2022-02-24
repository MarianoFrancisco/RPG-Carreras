/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class ElegirCarro {
    SeleccionRivales SeleccionRivales = new SeleccionRivales();
    Competir Competir = new Competir();
    public void elegirCarro(){
        Scanner entrada= new Scanner(System.in);
        int opcion=0;
        while (opcion!=5){
            //Seleccion de carro ya para competencia
            System.out.println("Selecione su carro: \n"
            + "1) "+Carro.carroJugador[0].getMarca()
            + "\n2) "+Carro.carroJugador[1].getMarca()
            + "\n3) "+Carro.carroJugador[2].getMarca()
            + "\n4) "+Carro.carroJugador[3].getMarca()
            + "\n5) "+Carro.carroJugador[4].getMarca());//mostramos los carros
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    Carro.carroJugador[5]=Carro.carroJugador[0];//Asiganomos valor de carro
                    if(Carro.carroJugador[5].getGasolina()>80){//Dependiendo si posee gasolina puede competir
                        SeleccionRivales.seleccionRivales();
                    }
                    else
                        System.out.println("No tienes suficiente gasolina para competir en esta pista");//No se le permite competir de ser caso contrario
                    break;
                case 2:
                    if(Carro.carroJugador[1].getPotencia()==0){
                        System.out.println("Primero necesitas llenar este espacio con un vehículo");
                        Competir.competir();
                    }
                    else{
                        Carro.carroJugador[5]=Carro.carroJugador[1];
                        if(Carro.carroJugador[5].getGasolina()>80){
                            SeleccionRivales.seleccionRivales();
                        }
                        else
                            System.out.println("No tienes suficiente gasolina para competir en esta pista");
                    }    
                    break;
                case 3:
                    if(Carro.carroJugador[2].getPotencia()==0){
                        System.out.println("Primero necesitas llenar este espacio con un vehículo");
                        Competir.competir();
                    }
                    else{
                        Carro.carroJugador[5]=Carro.carroJugador[2];
                        if(Carro.carroJugador[5].getGasolina()>80){
                            SeleccionRivales.seleccionRivales();
                        }
                        else
                            System.out.println("No tienes suficiente gasolina para competir en esta pista");
                    }    
                    break;
                case 4:
                    if(Carro.carroJugador[3].getPotencia()==0){
                        System.out.println("Primero necesitas llenar este espacio con un vehículo");
                        Competir.competir();
                    }
                    else{
                        Carro.carroJugador[5]=Carro.carroJugador[3];
                        if(Carro.carroJugador[5].getGasolina()>80){
                            SeleccionRivales.seleccionRivales();
                        }
                        else
                            System.out.println("No tienes suficiente gasolina para competir en esta pista");
                    }    
                    break;
                case 5:
                    if(Carro.carroJugador[4].getPotencia()==0){
                        System.out.println("Primero necesitas llenar este espacio con un vehículo");
                        Competir.competir();
                    }
                    else{
                        Carro.carroJugador[5]=Carro.carroJugador[4];
                        if(Carro.carroJugador[5].getGasolina()>80){
                            SeleccionRivales.seleccionRivales();
                        }
                        else
                            System.out.println("No tienes suficiente gasolina para competir en esta pista");
                    }    
                    break;
                default:System.out.println("Ingresa un número valido");
                    break;            
            }
        }
    }
}
