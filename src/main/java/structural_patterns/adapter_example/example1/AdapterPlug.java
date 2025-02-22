package structural_patterns.adapter_example.example1;

public class AdapterPlug implements American_plug {
    private EuropeanPlug europeanPlug;

    public AdapterPlug(EuropeanPlug europeanPlug){
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void connect() {
        europeanPlug.plug();
    }


}
