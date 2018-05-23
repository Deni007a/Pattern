package Клонирование;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A myA = new A();

        A myA2 = new A(myA);

        //A myA2=myA.clone();
        myA2.myB.string_b="ZZZ";
        myA2.string_a="AAA";
        myA2.my_int[0]=999;



        System.out.println("оригинал");
        System.out.println(myA);
        System.out.println("клон");
        System.out.println(myA2);


    }
}
