
public class SpaceTest {
    public static void main(String[] args) {
        Space2D p1 = new Space2D();
        Space2D p2 = new Space2D(0, 5);
        Space2D p3 = new Space2D(4,0);
        p1.print();
        p2.print();
        p3.print();
        System.out.println(p2.toString());
        System.out.println("ODLEGLOSCI");
        System.out.println(p1.distance(p2) + " = " + p2.distance0());
        System.out.println(p2.distance(p3));
        System.out.println("OBWOD");
        System.out.println(p1.perimeter(p2, p3));
        System.out.println("POLE");
        System.out.println(p1.field(p2, p3));
        System.out.println("PUNKTY 3D");
        Space3D p4 = new Space3D();
        Space3D p5 = new Space3D(2, 3, 4);
        Space3D p6 = new Space3D(0, 3, 2);
        p4.print();
        p5.print();
        p6.print();
        System.out.println(p5.toString());
        System.out.println("ODLEGLOSCI");
        System.out.println(p4.distance(p5) + " = " + p5.distance0());
        System.out.println(p5.distance(p6));
        System.out.println("OBWOD");
        System.out.println(p4.perimeter(p5, p6));
        System.out.println("POLE");
        System.out.println(p4.field(p5, p6));
    }
}
