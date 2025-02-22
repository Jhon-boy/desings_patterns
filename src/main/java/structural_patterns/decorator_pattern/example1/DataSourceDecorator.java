package structural_patterns.decorator_pattern.example1;

public abstract class DataSourceDecorator implements  DataSource  {
    private DataSource wrapper;

    DataSourceDecorator(DataSource source){
        this.wrapper = source;
    }

    @Override
    public  void writeData(String data){
        wrapper.write(data);
    }

    @Override
    public String readData() {
        return  wrapper.readData();
    }
}
