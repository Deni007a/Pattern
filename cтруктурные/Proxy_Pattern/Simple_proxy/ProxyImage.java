package cтруктурные.Proxy_Pattern.Simple_proxy;

//  прокси обект заместитель
public class ProxyImage implements Image {
        // екземпляр реальногго обекта для композиции
    private RealImage realImage;


    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
// реализация общего интрефеса
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}