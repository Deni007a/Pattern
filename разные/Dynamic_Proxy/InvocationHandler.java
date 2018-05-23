package разные.Dynamic_Proxy;

public class InvocationHandler implements java.lang.reflect.InvocationHandler{
    private Object obj;

    public InvocationHandler(Object f1){
        obj = f1; }

    public Object invoke(Object proxy,
                         java.lang.reflect.Method method,
                         Object[] args) // должен принимать масив интерфесов нашего класса
        // методы этих интерфесов будут перехватыватся InvocationHandler-ом
            throws Throwable {
        System.out.println("NeverSleepingEye invoke : " + method.getName());
        // важно
        return method.invoke(obj, args) ;
    }
}