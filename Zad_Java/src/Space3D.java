
public class Space3D extends Space2D {
    private double z;

    public Space3D(){
        super();
        z = 0;
    }
    public Space3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }
    @Override
    public void setY(double y) {
        super.setY(y);
    }
    public void setZ(double z) {
        this.z = z;
    }
    @Override
    public double getX() {
        return super.getX();
    }
    @Override
    public double getY() {
        return super.getY();
    }
    public double getZ() {
        return z;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("z: " + z);
    }

    public double distance(Space3D point) {
        return Math.sqrt(Math.pow((this.getX()-point.getX()),2)+Math.pow((this.getY()-point.getY()),2)+Math.pow((this.z-point.z),2));
    }

    @Override
    public double distance0() {
        return Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2)+Math.pow(this.getZ(),2));
    }

    @Override
    public String toString() {
        return super.toString() + " " + Double.toString(z);
    }

    public double perimeter(Space3D point1, Space3D point2) {
        return this.distance(point1) + this.distance(point2) + point1.distance(point2);
    }

    public double field(Space3D point1, Space3D point2) {
        double p = this.perimeter(point1, point2)/2;
        return Math.sqrt(p*(p-this.distance(point1))*(p-this.distance(point2))*(p-point1.distance(point2)));
    }
}
