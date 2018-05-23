package cтруктурные.Proxy_Pattern.Simple_proxy;

public class Main {
    public static void main(String[] args) {
        Image imajereal = new RealImage("test_10mb.jpg");
        imajereal.display();
        System.out.println("Прокси");
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();

    }

}
