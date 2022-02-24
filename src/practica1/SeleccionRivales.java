package practica1;

import java.util.Scanner;

/**
 *
 * @author Mariano
 */
public class SeleccionRivales {
    Carrera Carrera =new Carrera();//Llamar a carrera
    CarrosCompetencia CarrosCompetencia = new CarrosCompetencia();//Llamar los carros de rivales
    Competir Competir = new Competir();//Llamar a competir
    public void seleccionRivales(){       
        Scanner entrada= new Scanner(System.in);
        int opcion=0;
        while (opcion!=5){//Ciclo
            System.out.println("Selecione cuántos rivales quieres: \n"
            + "1) Un Rival"
            + "\n2) Dos Rivales"
            + "\n3) Tres Rivales"
            + "\n4) Cuatro Rivales"
            + "\n5) Cinco Rivales");
            //Creamos Rivales vacios para futuros usos en almacenamiento
            Rivales.seleccionRivales[0]=Rivales.rivalVacio;
            Rivales.seleccionRivales[1]=Rivales.rivalVacio;
            Rivales.seleccionRivales[2]=Rivales.rivalVacio;
            Rivales.seleccionRivales[3]=Rivales.rivalVacio;
            Rivales.seleccionRivales[4]=Rivales.rivalVacio;
            Rivales.seleccionRivales[5]=Rivales.rivalVacio;
            int aleatorioRivales14 = (int)(Math.random()*5);//Variable aleatoria
            int aleatorioRivales23 = (int)(Math.random()*10);//Otra variable aleatoria
            CarrosCompetencia.carrosCompetencia();
            CasillasAvanzadas.GeneradorCasillas();
            opcion = entrada.nextInt();
            switch(opcion){ 
                case 1:
                    /*Creamos todas las posibilidades, esto con las combinaciones nCr
                    En la primera elejimos uno aleatorio, en el segundo dos aleatorios y así consecutivamente
                    Asiganmos valores a los arreglos y llamamos a carrera.
                    */
                    switch(aleatorioRivales14){
                        case 1:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;//Asignacion de valor
                            Carrera.carrera();//Llamamos a carrera
                            break;
                        case 2:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Carrera.carrera();
                            break;
                        case 3:
                            Rivales.seleccionRivales[0]=Rivales.rivales3;
                            Carrera.carrera();
                            break;
                        case 4:
                            Rivales.seleccionRivales[0]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 5:
                            Rivales.seleccionRivales[0]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                    }
                    break;
                case 2:
                    switch(aleatorioRivales23){
                        case 1:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Carrera.carrera();
                            break;
                        case 2:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Carrera.carrera();
                            break;
                        case 3:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 4:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 5:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Carrera.carrera();
                            break;
                        case 6:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Rivales.seleccionRivales[1]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 7:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Rivales.seleccionRivales[1]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 8:
                            Rivales.seleccionRivales[0]=Rivales.rivales3;
                            Rivales.seleccionRivales[1]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 9:
                            Rivales.seleccionRivales[0]=Rivales.rivales3;
                            Rivales.seleccionRivales[1]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 10:
                            Rivales.seleccionRivales[0]=Rivales.rivales4;
                            Rivales.seleccionRivales[1]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                    }
                    break;
                case 3:
                    switch(aleatorioRivales23){
                        case 1:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales3;
                            Carrera.carrera();
                            break;
                        case 2:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 3:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 4:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Rivales.seleccionRivales[2]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 5:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Rivales.seleccionRivales[2]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 6:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales4;
                            Rivales.seleccionRivales[2]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 7:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Rivales.seleccionRivales[2]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 8:
                            Rivales.seleccionRivales[0]=Rivales.rivales3;
                            Rivales.seleccionRivales[1]=Rivales.rivales4;
                            Rivales.seleccionRivales[2]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 9:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Rivales.seleccionRivales[1]=Rivales.rivales4;
                            Rivales.seleccionRivales[2]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 10:
                            Rivales.seleccionRivales[0]=Rivales.rivales3;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                    }
                    break;
                case 4:
                    switch(aleatorioRivales14){
                        case 1:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales3;
                            Rivales.seleccionRivales[3]=Rivales.rivales4;
                            Carrera.carrera();
                            break;
                        case 2:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales3;
                            Rivales.seleccionRivales[3]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 3:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Rivales.seleccionRivales[2]=Rivales.rivales4;
                            Rivales.seleccionRivales[3]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 4:
                            Rivales.seleccionRivales[0]=Rivales.rivales2;
                            Rivales.seleccionRivales[1]=Rivales.rivales3;
                            Rivales.seleccionRivales[2]=Rivales.rivales4;
                            Rivales.seleccionRivales[3]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                        case 5:
                            Rivales.seleccionRivales[0]=Rivales.rivales1;
                            Rivales.seleccionRivales[1]=Rivales.rivales2;
                            Rivales.seleccionRivales[2]=Rivales.rivales4;
                            Rivales.seleccionRivales[3]=Rivales.rivales5;
                            Carrera.carrera();
                            break;
                    }
                    break;
                case 5:
                    Rivales.seleccionRivales[0]=Rivales.rivales1;
                    Rivales.seleccionRivales[1]=Rivales.rivales2;
                    Rivales.seleccionRivales[2]=Rivales.rivales3;
                    Rivales.seleccionRivales[3]=Rivales.rivales4;
                    Rivales.seleccionRivales[4]=Rivales.rivales5;
                    Carrera.carrera();
                    break;
                default:System.out.println("Ingresa un número valido");//Si engresa un número que no es
                    break;            
            }
        break;
        }
    }
}
