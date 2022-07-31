package spacecraft;

public abstract class spacecraft {
    /** atributos*/
    protected String model;
    protected String fuel;

    /**
     * Constructor de la clase spacecraft
     * @param model modelo de la nave
     * @param fuel tipo de gasolina
     */
    public spacecraft(String model, String fuel){
        this.model= model;
        this.fuel= fuel;
    }

    /**
     * @return obtiene el nombre del modelo
     */
    public String getmodel(){
        return model;
    }

    /**
     * @return obtiene el tipo de gasolina
     */
    public String getfuel(){
        return fuel;
    }

    /**
     *
     * @return muestra los valores del modelo y tipo de gasolina
     */
    public String show(){
        return "model: "+model+ "\nfuel: "+fuel;
    }
}
