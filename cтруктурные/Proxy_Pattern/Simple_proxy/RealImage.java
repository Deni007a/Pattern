package cтруктурные.Proxy_Pattern.Simple_proxy;

import cтруктурные.Proxy_Pattern.Simple_proxy.Image;

// реальный обект реализующий общий интерфейс
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
// реализация метода интерфеса
    @Override
    public void display() {
        System.out.println("Реал обект Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Реал обект Loading " + fileName);
    }
}