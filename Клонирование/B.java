package Клонирование;

public class B  implements Cloneable{
    String string_b;

    public B(String string_b) {
        this.string_b = string_b;
    }
//  конутруктор копирования
    public B(B b) {
        this.string_b = b.string_b;
    }

    @Override
    protected B clone() throws CloneNotSupportedException {
        return (B) super.clone();
    }

    @Override
    public String toString() {
        return "B{" +
                "string_b='" + string_b + '\'' +
                '}';
    }
}
