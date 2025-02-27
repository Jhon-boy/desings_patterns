package structural_patterns.composite_pattern.example1;

public class File implements  SystemFile {
    private String name;

    public  File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File: "+ name);
    }

}
