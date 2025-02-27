package structural_patterns.proxy.example1;
/*
* Proxy implements Proxy
* */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String file;

    public  ProxyImage(String file){
        this.file = file;
    }


    @Override
    public void show() {
        if(realImage == null){
            realImage = new RealImage(file);
        }
        realImage.show();
    }
}
