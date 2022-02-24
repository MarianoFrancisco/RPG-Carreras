package practica1;

/**
 *
 * @author Mariano
 */
public class CarrosCompetencia {
    public void carrosCompetencia(){
        //Asiganmos random a la potencia y al coeficiente para que se adapte a la del jugador
        int potenciaAleatoria = (int)(Math.random()*(Carro.carroJugador[5].getPotencia()));
        int coeficienteAleatorio = (int)(Math.random()*(Carro.carroJugador[5].getCoeficiente()));
        //Cambiamos valores de cada carro cuantas veces queramos para que no sea cada partida igual
        Carro.carroCompetencia1.setPotencia(potenciaAleatoria+1);//Sumamos 1 para que no sea 0
        Carro.carroCompetencia1.setCoeficiente(coeficienteAleatorio+1);
        Carro.carroCompetencia2.setPotencia(potenciaAleatoria+1);
        Carro.carroCompetencia2.setCoeficiente(coeficienteAleatorio+1);
        Carro.carroCompetencia3.setPotencia(potenciaAleatoria+1);
        Carro.carroCompetencia3.setCoeficiente(coeficienteAleatorio+1);
        Carro.carroCompetencia4.setPotencia(potenciaAleatoria+1);
        Carro.carroCompetencia4.setCoeficiente(coeficienteAleatorio+1);
        Carro.carroCompetencia5.setPotencia(potenciaAleatoria+1);
        Carro.carroCompetencia5.setCoeficiente(coeficienteAleatorio+1);
    }
}
