package spacecraft;

public class shuttle_vehicles extends spacecraft implements Ifuel{
    private int weight;

    /**
     *Constructor de la clase vehiculo lanzadera
     * @param model modelo de la nave
     * @param fuel tipo de gasolina de la nave
     * @param weight peso de la nave
     */
    public shuttle_vehicles(String model, String fuel, int weight) {
        super(model, fuel);
        this.weight=weight;
    }

    public int getweight(){
        return weight;
    }


    @Override
    public void full() {
        System.out.println("la nave espacial puede despegar porque el combustible esta lleno");
    }
    @Override
    public void empty() {
        System.out.println("la nave espacial no puede despegar porque el combustible esta vacío");
    }

    @Override
    public String show(){
        return "modelo: "+model+ "\ngasolina: "+fuel+"\npeso: "+weight+" Toneladas";

    }

}
