package structural_patterns.adapter_example;

import structural_patterns.adapter_example.example1.AdapterPlug;
import structural_patterns.adapter_example.example1.American_plug;
import structural_patterns.adapter_example.example1.EuropeanPlug;
import structural_patterns.adapter_example.example2.AdapterFacturation;
import structural_patterns.adapter_example.example2.FacturationDolars;
import structural_patterns.adapter_example.example2.FacturationOld;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("\n ************ EXAMPLE 1 ****************\n");
        EuropeanPlug europeanPlug = new EuropeanPlug();
        American_plug adapter = new AdapterPlug(europeanPlug);
        adapter.connect();

        System.out.println("\n ************ EXAMPLE 2 ****************\n");
        FacturationOld facturationOld = new FacturationOld();
        FacturationDolars facturationDolarsAdapter = new AdapterFacturation(facturationOld);
        System.out.println("SYSTEM IN DOLLARS: " + facturationDolarsAdapter.getInDolars() );

    }
}
