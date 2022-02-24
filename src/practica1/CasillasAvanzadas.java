package practica1;

/**
 *
 * @author Mariano
 */
public class CasillasAvanzadas {
    int casillas;
    int gasolinaConsumida;
    //Creamos todas las posibilidades para avanzar casilla por rivales como jugador
    static CasillasAvanzadas pistaTierra1;
    static CasillasAvanzadas pistaTierra2;
    static CasillasAvanzadas pistaTierra3;
    static CasillasAvanzadas pistaTierra4;
    static CasillasAvanzadas pistaTierra5;
    static CasillasAvanzadas pistaTierra6;
    static CasillasAvanzadas pistaArena1;
    static CasillasAvanzadas pistaArena2;
    static CasillasAvanzadas pistaArena3;
    static CasillasAvanzadas pistaArena4;
    static CasillasAvanzadas pistaArena5;
    static CasillasAvanzadas pistaArena6;    
    static CasillasAvanzadas pistaConcreto1;
    static CasillasAvanzadas pistaConcreto2;
    static CasillasAvanzadas pistaConcreto3;
    static CasillasAvanzadas pistaConcreto4;
    static CasillasAvanzadas pistaConcreto5;
    static CasillasAvanzadas pistaConcreto6;
    public CasillasAvanzadas(int casillas, int gasolinaConsumida){//Constructor
        this.casillas=casillas;
        this.gasolinaConsumida=gasolinaConsumida;    
    }
    public int getCasillas() {
        return this.casillas;
    }
    public void setCasillas(int casillas) {
        this.casillas = casillas;
    }
    public int getGasolinaConsumida() {
        return this.gasolinaConsumida;
    }
    public void setGasolinaConsumida(int gasolinaConsumida) {
        this.gasolinaConsumida = gasolinaConsumida;
    }
    public static void GeneradorCasillas(){
        //Creamos todas las variables aleatorias posibles para variar resultados entre competidores
        int aleatorioPotencia= (int)(Math.random()*9);
        int aleatorioLlanta= (int)(Math.random()*4);
        int aleatorioPotencia1= (int)(Math.random()*9);
        int aleatorioLlanta1= (int)(Math.random()*4);
        int aleatorioPotencia2= (int)(Math.random()*9);
        int aleatorioLlanta2= (int)(Math.random()*4);
        int aleatorioPotencia3= (int)(Math.random()*9);
        int aleatorioLlanta3= (int)(Math.random()*4);
        int aleatorioPotencia4= (int)(Math.random()*9);
        int aleatorioLlanta4= (int)(Math.random()*4);
        int aleatorioPotencia5= (int)(Math.random()*9);
        int aleatorioLlanta5= (int)(Math.random()*4);
        //Establecemos la formula brindada
        int datoTierra1 = ((Carro.carroCompetencia1.getPotencia()*(aleatorioPotencia1+1))+Pista.pistaTierra.getCoeficienteDePista()+(Carro.carroCompetencia1.getCoeficiente()*(aleatorioLlanta1+1)));
        int datoTierra2 = ((Carro.carroCompetencia2.getPotencia()*(aleatorioPotencia2+1))+Pista.pistaTierra.getCoeficienteDePista()+(Carro.carroCompetencia2.getCoeficiente()*(aleatorioLlanta2+1)));
        int datoTierra3 = ((Carro.carroCompetencia3.getPotencia()*(aleatorioPotencia3+1))+Pista.pistaTierra.getCoeficienteDePista()+(Carro.carroCompetencia3.getCoeficiente()*(aleatorioLlanta3+1)));
        int datoTierra4 = ((Carro.carroCompetencia4.getPotencia()*(aleatorioPotencia4+1))+Pista.pistaTierra.getCoeficienteDePista()+(Carro.carroCompetencia4.getCoeficiente()*(aleatorioLlanta4+1)));
        int datoTierra5 = ((Carro.carroCompetencia5.getPotencia()*(aleatorioPotencia5+1))+Pista.pistaTierra.getCoeficienteDePista()+(Carro.carroCompetencia5.getCoeficiente()*(aleatorioLlanta5+1)));
        int datoTierra6 = ((Carro.carroJugador[5].getPotencia()*(aleatorioPotencia+1))+Pista.pistaTierra.getCoeficienteDePista()+(Carro.carroJugador[5].getCoeficiente()*(aleatorioLlanta+1)));
        int datoArena1 = ((Carro.carroCompetencia1.getPotencia()*(aleatorioPotencia1+1))+Pista.pistaArena.getCoeficienteDePista()+(Carro.carroCompetencia1.getCoeficiente()*(aleatorioLlanta1+1)));
        int datoArena2 = ((Carro.carroCompetencia2.getPotencia()*(aleatorioPotencia2+1))+Pista.pistaArena.getCoeficienteDePista()+(Carro.carroCompetencia2.getCoeficiente()*(aleatorioLlanta2+1)));
        int datoArena3 = ((Carro.carroCompetencia3.getPotencia()*(aleatorioPotencia3+1))+Pista.pistaArena.getCoeficienteDePista()+(Carro.carroCompetencia3.getCoeficiente()*(aleatorioLlanta3+1)));
        int datoArena4 = ((Carro.carroCompetencia4.getPotencia()*(aleatorioPotencia4+1))+Pista.pistaArena.getCoeficienteDePista()+(Carro.carroCompetencia4.getCoeficiente()*(aleatorioLlanta4+1)));
        int datoArena5 = ((Carro.carroCompetencia5.getPotencia()*(aleatorioPotencia5+1))+Pista.pistaArena.getCoeficienteDePista()+(Carro.carroCompetencia5.getCoeficiente()*(aleatorioLlanta5+1)));
        int datoArena6 = ((Carro.carroJugador[5].getPotencia()*(aleatorioPotencia+1))+Pista.pistaArena.getCoeficienteDePista()+(Carro.carroJugador[5].getCoeficiente()*(aleatorioLlanta+1)));
        int datoConcreto1 = ((Carro.carroCompetencia1.getPotencia()*(aleatorioPotencia1+1))+Pista.pistaConcreto.getCoeficienteDePista()+(Carro.carroCompetencia1.getCoeficiente()*(aleatorioLlanta1+1)));
        int datoConcreto2 = ((Carro.carroCompetencia2.getPotencia()*(aleatorioPotencia2+1))+Pista.pistaConcreto.getCoeficienteDePista()+(Carro.carroCompetencia2.getCoeficiente()*(aleatorioLlanta2+1)));
        int datoConcreto3 = ((Carro.carroCompetencia3.getPotencia()*(aleatorioPotencia3+1))+Pista.pistaConcreto.getCoeficienteDePista()+(Carro.carroCompetencia3.getCoeficiente()*(aleatorioLlanta3+1)));
        int datoConcreto4 = ((Carro.carroCompetencia4.getPotencia()*(aleatorioPotencia4+1))+Pista.pistaConcreto.getCoeficienteDePista()+(Carro.carroCompetencia4.getCoeficiente()*(aleatorioLlanta4+1)));
        int datoConcreto5 = ((Carro.carroCompetencia5.getPotencia()*(aleatorioPotencia5+1))+Pista.pistaConcreto.getCoeficienteDePista()+(Carro.carroCompetencia5.getCoeficiente()*(aleatorioLlanta5+1)));
        int datoConcreto6 = ((Carro.carroJugador[5].getPotencia()*(aleatorioPotencia+1))+Pista.pistaConcreto.getCoeficienteDePista()+(Carro.carroJugador[5].getCoeficiente()*(aleatorioLlanta+1)));
        //Asignamos valores a los parametros con los datos obtenidos
        pistaTierra1 = new CasillasAvanzadas(datoTierra1,datoTierra1);
        pistaTierra2 = new CasillasAvanzadas(datoTierra2,datoTierra2);
        pistaTierra3 = new CasillasAvanzadas(datoTierra3,datoTierra3);
        pistaTierra4 = new CasillasAvanzadas(datoTierra4,datoTierra4);
        pistaTierra5 = new CasillasAvanzadas(datoTierra5,datoTierra5);
        pistaTierra6 = new CasillasAvanzadas(datoTierra6,datoTierra6);
        pistaArena1 = new CasillasAvanzadas(datoArena1,datoArena1);
        pistaArena2 = new CasillasAvanzadas(datoArena2,datoArena2);
        pistaArena3 = new CasillasAvanzadas(datoArena3,datoArena3);
        pistaArena4 = new CasillasAvanzadas(datoArena4,datoArena4);
        pistaArena5 = new CasillasAvanzadas(datoArena5,datoArena5);
        pistaArena6 = new CasillasAvanzadas(datoArena6,datoArena6);
        pistaConcreto1 = new CasillasAvanzadas(datoConcreto1,datoConcreto1);
        pistaConcreto2 = new CasillasAvanzadas(datoConcreto2,datoConcreto2);
        pistaConcreto3 = new CasillasAvanzadas(datoConcreto3,datoConcreto3);
        pistaConcreto4 = new CasillasAvanzadas(datoConcreto4,datoConcreto4);
        pistaConcreto5 = new CasillasAvanzadas(datoConcreto5,datoConcreto5);
        pistaConcreto6 = new CasillasAvanzadas(datoConcreto6,datoConcreto6);
    }
    
}
