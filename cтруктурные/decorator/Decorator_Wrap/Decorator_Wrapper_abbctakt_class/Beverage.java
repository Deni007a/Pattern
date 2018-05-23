package cтруктурные.decorator.Decorator_Wrap.Decorator_Wrapper_abbctakt_class;

public abstract class Beverage /* Напиток */{
    protected String  description ="Неизщвестный напиток";

    // размер напитка
    public enum Size {

        TALL(0.0),
        GRANDE(0.25),
        VENTI(0.50);

        private final double costSize;

        private Size(double costSize) {
            this.costSize = costSize;
        }

        public double costSize() {
            return costSize;
        }
    };


    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();

}
