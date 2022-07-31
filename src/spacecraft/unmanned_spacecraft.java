package spacecraft;
/**
 * Clase nave espacial sin tripulantes
 */
public class unmanned_spacecraft extends spacecraft implements Ifuel{
   private final boolean crew ;
   private final String planets;

    /**
     * Cnstructor de la clase nave espacial no tripulada
     * @param model Modelo de la nave
     * @param fuel Tipo de gasolina de la nave
     * @param crew Tirpulacion variable tipo booleano: false si no hay, true si hay tripulacion
     * @param planets Nombre de los planetas que viaja la nave
     */
    public unmanned_spacecraft(String model, String fuel, boolean crew, String planets) {
        super(model, fuel);
        this.crew=crew;
        this.planets = planets;
    }
    /**
     * @return retorna el valor booleano de la tripulacion
     */
    public boolean isCrew(){
        return crew;
    }
    /**
     * @return retorna la info de los planetas que puede viajar dicho nave
     */
    public String getPlanets() {
        return planets;
    }

    /*se sobrescribe el comportamiento de la gasolina a lleno*/
    @Override
    public void full() {
        System.out.println("la nave espacial puede despegar porque el combustible esta lleno");
    }

   /*se sobrescribe el comportamiento de la gasolina si esta lleno o vacio*/
    @Override
    public void empty() {
        System.out.println("la nave espacial no puede despegar porque el combustible está vacío");
    }
    @Override
    public String show(){
        return "modelo: "+model+ "\ngasolina: "+fuel+"\ntripulaicon: "+crew+"\nplanetas:"+ planets;

    }


}
