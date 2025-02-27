package structural_patterns.composite_pattern;

import structural_patterns.composite_pattern.example1.File;
import structural_patterns.composite_pattern.example1.Folder;

public class TestMain {
    public static  void main(String [] args) throws Exception {

        File file = new File("document.txt");
        File file1 = new File("image.png");
        File file2 = new File("video.mp4");

        Folder mainFolder = new Folder("Main Folder");
        Folder subFolder = new Folder("Sub Folder 1");
        Folder subFolder2 = new Folder("Sub Folder 2");

        subFolder.addElements(file);
        subFolder.addElements(file1);

        subFolder2.addElements(file2);

        mainFolder.addElements(subFolder);
        mainFolder.addElements(subFolder2);

        mainFolder.showDetails();
    }
}
