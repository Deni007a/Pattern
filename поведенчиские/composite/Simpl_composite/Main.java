package поведенчиские.composite.Simpl_composite;

public class Main {
    public static void main(String[] args) {
        //иницация листов
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();


        //Initialize three composite
        Composite сomposite1 = new Composite();
        Composite сomposite2 = new Composite();
        Composite сomposite3 = new Composite();

        //Composes the graphics
        сomposite2.add(leaf1);
        сomposite2.add(leaf2);
        сomposite2.add(leaf3);

        сomposite3.add(leaf4);

        сomposite1.add(сomposite2);
        сomposite1.add(сomposite3);

        //Prints the complete graphic (four times the string "Ellipse").
        System.out.println("*****1");
        сomposite1.print();
        System.out.println("*****2");
        сomposite2.print();
        System.out.println("*****3");
        сomposite3.print();

    }
}
