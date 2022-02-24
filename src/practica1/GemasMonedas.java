package practica1;
/**
 *
 * @author Mariano
 */
public class GemasMonedas {//clase monedas
    static GemasMonedas operacion1;//Crear operacion de gemas y monedas
    //creación de variables
    private int gemasTotales;
    private int gemasAnadidas;
    private double monedasTotales;
    private double monedasAnadidas;
    //crear constructor para GemasMonedas
    public GemasMonedas(int gemasTotales,int gemasAnadidas,double monedasTotales, double monedasAnadidas){
    this.gemasTotales = gemasTotales;
    this.gemasAnadidas = gemasAnadidas;
    this.monedasTotales = monedasTotales;
    this.monedasAnadidas = monedasAnadidas;
    }
    //Recibir y cambiar gemasTotales, gemasAnadidas, monedasTotales, monedas Anadidas
    public int getGemasTotales() {
        return this.gemasTotales;
    }

    public void setGemasTotales(int gemasTotales) {
        this.gemasTotales = gemasTotales;
    }

    public int getGemasAnadidas() {
        return this.gemasAnadidas;
    }

    public void setGemasAnadidas(int gemasAnadidas) {
        this.gemasAnadidas = gemasAnadidas;
    }

    public double getMonedasTotales() {
        return this.monedasTotales;
    }

    public void setMonedasTotales(double monedasTotales) {
        this.monedasTotales = monedasTotales;
    }

    public double getMonedasAnadidas() {
        return this.monedasAnadidas;
    }

    public void setMonedasAnadidas(double monedasAnadidas) {
        this.monedasAnadidas = monedasAnadidas;
    }
    //Inicializar valores
    public static void asignarValoresIniciales(){
        int gemasTotales=30;
        int gemasAnadidas=0;
        double monedasTotales=50;
        double monedasAnadidas=0;
        operacion1 = new GemasMonedas(gemasTotales,gemasAnadidas, monedasTotales, monedasAnadidas);//operacion1
    }
    public static void resultadoGemas(){//Operacion entre gemas
        GemasMonedas.operacion1.setGemasTotales((GemasMonedas.operacion1.getGemasTotales()+GemasMonedas.operacion1.getGemasAnadidas()));
        System.out.println("Gemas :"+(GemasMonedas.operacion1.getGemasTotales()));
    }
    public static void resultadoMonedas(){//operacion entre monedas
        GemasMonedas.operacion1.setMonedasTotales((GemasMonedas.operacion1.getMonedasTotales()+GemasMonedas.operacion1.getMonedasAnadidas()));
        System.out.println("Monedas: "+(GemasMonedas.operacion1.getMonedasTotales()));
    }
}
