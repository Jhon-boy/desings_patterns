package structural_patterns.decorator_pattern.example1;

public interface DataSource {
    void write(String data);
    String readData();

    void writeData(String data);
}
