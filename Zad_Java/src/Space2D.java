
public class Space2D {
    private double x;
    private double y;

    public Space2D(){
        x = 0;
        y = 0;
    }
    public Space2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void print(){
        System.out.println("x: " + x + "\ny: " + y);
    }
    public double distance(Space2D point){
        return Math.sqrt(Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2));
    }
    public double distance0(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public String toString() {
        return Double.toString(x) + " " + Double.toString(y);
    }




    public double perimeter(Space2D point1, Space2D point2){
        return this.distance(point1) + this.distance(point2) + point1.distance(point2);
    }
    public double field(Space2D point1, Space2D point2){
        double p = this.perimeter(point1, point2)/2;
        return Math.sqrt(p*(p-this.distance(point1))*(p-this.distance(point2))*(p-point1.distance(point2)));
    }
}
