package structural_patterns.adapter_example.example2;

public class AdapterFacturation implements  FacturationDolars {

    private FacturationOld facturationOld;
    private static final double TASA_CAMBIO = 18.0;
    public  AdapterFacturation(FacturationOld facturationOld){
        this.facturationOld = facturationOld;
    }


    @Override
    public double getInDolars() {
        return  TASA_CAMBIO;
    }
}
