package spacecraft;

public class manned_spacecraft extends spacecraft implements Ifuel {
    protected boolean crew ;

    /**
     * @param model Modelo de la nave
     * @param fuel Tipo de gasolina de la nave
     * @param crew Tirpulacion variable tipo booleano: false si no hay true si hay tripulacion
     */
    public manned_spacecraft(String model, String fuel, boolean crew) {
        super(model, fuel);
        this.crew=crew;
    }
    /**
     * @return retorna el valor ingreasado para saber si hay o no tripulacion
     */
    public boolean isCrew(){
        return crew;
    }

    /*se sobrescribe el comportamiento de la gasolina si esta lleno o vacio*/
    @Override
    public void full() {
        System.out.println("la nave espacial puede despegar porque el combustible esta lleno");
    }

    @Override
    public void empty() {
        System.out.println("la nave espacial no puede despegar porque el combustible esta vacío");
    }
    /*imprime los valores creados por el usuario*/
    @Override
    public String show(){
        return "modelo: "+model+ "\ngasolina: "+fuel+"\nTripulacion: "+crew;

    }
}
