package Клонирование;

import java.util.Arrays;

public class A implements Cloneable {

    String string_a =" string a";
    int a =11;
    B myB = new B("BBBB");

    Integer[] my_int ={1, 2, 3};

    @Override
    protected A clone() throws CloneNotSupportedException {
        A myAclone = (A) super.clone();
        // глубокое клонирование
        myAclone.myB= myB.clone();
        myAclone.my_int= my_int.clone();
        return myAclone;
    }




    public A() {
    }
    // конструктор клонирования
    public A(A a) {
        this.string_a =a.string_a;
        this.a = a.a;


        this.myB = a.myB;

        // вручную копируем данные
        a.my_int= Arrays.copyOf(my_int,my_int.length);
        // тоже вручную копируем нов  метоже И тоже есть конструктор корпирования
        a.myB=new B(myB);


    }

    @Override
    public String toString() {
        return "A{" +
                "string_a='" + string_a + '\'' +
                ", a=" + a +
                ", myB=" + myB +
                ", my_int=" + Arrays.toString(my_int) +
                '}';
    }
}
