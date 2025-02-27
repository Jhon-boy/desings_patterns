package structural_patterns.composite_pattern.example1;

import java.util.ArrayList;
import java.util.List;

public class Folder implements SystemFile {
    private String name;
    private List<SystemFile> elements = new ArrayList<>();

    public  Folder(String name){
        this.name = name;
    }

    public void addElements(SystemFile files){
        elements.add(files);
    }

    @Override
    public void showDetails() {
    System.out.println("Folder Name: " + name);
        for(SystemFile file: elements){
            file.showDetails();
        }
    }
}
