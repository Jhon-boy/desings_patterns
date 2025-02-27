package structural_patterns.proxy.example1;

/**
 * Class implements interface image
 * */
public class RealImage implements  Image{
    private String file;

    public RealImage(String file ){
        this.file = file;
    }

    private void loadFromDisk(){
        System.out.println("....Loading from disk...");
    }

    @Override
    public  void show(){
        System.out.println("Showing image...");
    }
}
