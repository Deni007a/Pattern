package разные.Dynamic_Proxy;

import java.lang.reflect.Proxy;

public class Main{
    public static void main(String[] args) {
        Person person = new Person();

        IPerson personproxy = (IPerson) Proxy.newProxyInstance(
                Person.class.getClassLoader(), // вначале грузим загружчик
                Person.class.getInterfaces(), // потом интерфесы
                new InvocationHandler(person)); // потом прокси клас

        /*
        Параметры этого вызова -

    ClassLoader класса Person, зачем он этому вызову, объясню позже.
    Массив типа Class, должен принимать массив интерфейсов, которые исполняет наш класс (Person).
    МЕТОДЫ ЭТИХ ИНТЕРФЕЙСОВ БУДУТ ПЕРЕХВАТЫВАТЬСЯ (InvocationHandler-ом).
                     Экземпляр InvocationHandler, который будет перехватывать методы вызываемые
                     для объекта person (на самом деле, вызовы будут идти через вновь созданный personproxy).
    На выходе получаем экземпляр некого класса(прокси), дающий следующую НУЖНУЮ функциональность
    (для чего всё это затевалось) :
    он исполняет все методы интерфейсов, переданных во 2м параметре при вызове Proxy.newProxyInstance (в нашем примере это getName,setName,rename). В этом он похож
    на Person
    при вызове этих методов этого экземпляра (например personproxy.setName) ВЫЗЫВАЕТСЯ МЕТОД INVOKE InvocationHandler-а. InvocationHandler уже дальше решает, как
    ему поступить - либо вызвать соответствующий метод реального класса Person, либо делать чтото еще.
         */

        personproxy.setName("Гриша");
        String h  = personproxy.getName() ;
        personproxy.rename("Вася");
    }
}
