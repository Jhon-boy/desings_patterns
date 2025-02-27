package structural_patterns.proxy;

import structural_patterns.proxy.example1.Image;
import structural_patterns.proxy.example1.ProxyImage;
import structural_patterns.proxy.example2.AtmProxy;

import java.math.BigDecimal;

public class MainTest {
    public static void main(String[] args) {

        System.out.println("************* EXAMPLE 1 ************");
        Image image = new ProxyImage("imagen.png");
        System.out.println("Imagen loaded " + image);
        image.show();
        image.show();


        System.out.println("************* EXAMPLE 2 ************");
        AtmProxy proxyAtm = new AtmProxy("4572", new BigDecimal(700));
        proxyAtm.withdraw(new BigDecimal(500));
        proxyAtm.enterPin("1111qq");
        proxyAtm.enterPin("1111");
        proxyAtm.withdraw(new BigDecimal(300));
        proxyAtm.withdraw(new BigDecimal(20));
    }
}
