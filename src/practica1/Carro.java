package practica1;
/**
 *
 * @author Mariano
 */
public class Carro {
    //atributos del carro
    private int potencia;
    private int coeficiente;
    private int gasolina;
    private String color;
    private String marca;
    //Establecer que carros se quiere predefinir
    static Carro carroVacio;
    static Carro carro1;
    static Carro carro2;
    static Carro carro3;
    static Carro carro4;
    static Carro carro5;
    static Carro carro6;
    static Carro carroCompetencia1;
    static Carro carroCompetencia2;
    static Carro carroCompetencia3;
    static Carro carroCompetencia4;
    static Carro carroCompetencia5;
    static Carro carroJugador[] =new Carro[6];//Crear almacenamiento de carros del Jugador
    
    public Carro( int potencia, int coeficiente,String color, int gasolina, String marca){//constructor carro
        this.potencia = potencia;
        this.coeficiente = coeficiente;
        this.color = color;
        this.gasolina = gasolina;
        this.marca = marca;        
    }
    //llamados y cambios de valores de atributos
    public int getPotencia() {
        return this.potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getCoeficiente() {
        return this.coeficiente;
    }
    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getGasolina() {
        return this.gasolina;
    }
    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public static void carros(){//Creación de los carros prestablecidos
        carroVacio = new Carro(0,0,"vacio",0,"No posees un carro en este espacio");//Carro vacio
        carro1 = new Carro(2 , 1 , "\033[33mamarillo", 100,"Toyota ║[==]D");//primer carro 
        carro2 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Lexus ║[==]D");//segundo carro
        carro3 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Subaru ║[==]D");//tercer carro
        carro4 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Suzuki ║[==]D");//cuarto carro
        carro5 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Nissan ║[==]D");//quinto carro
        carro6 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Ford ║[==]D");//sexto carro
        carroCompetencia1 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Audi ║[==]D");//primer carro competencia
        carroCompetencia2 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Honda ║[==]D");//segundo carro competencia
        carroCompetencia3 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Ferrari ║[==]D");//tercer carro competencia
        carroCompetencia4 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Lexus ║[==]D");//cuarto carro competencia
        carroCompetencia5 = new Carro(2 , 1 , "\033[33mamarillo", 100, "Mitsubishi ║[==]D");//quinto carro competencia
    }
}
