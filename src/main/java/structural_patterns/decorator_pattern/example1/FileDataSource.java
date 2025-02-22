package structural_patterns.decorator_pattern.example1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDataSource implements  DataSource {
    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void write(String data) {
        System.out.println("Writing data to file: " + name + " with content: " + data);
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);

        try (FileReader reader = new FileReader(file)) {
        buffer = new char[(int) file.length()];
        reader.read(buffer);
        }catch (IOException e) {
            System.out.println("Error --->" + e.getMessage());
        }
        return  new String(buffer);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing data to file: " + name + " with content: " + data);
    }

}
