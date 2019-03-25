public class Circle extends Shape {
    private Point p;
    private double r;

    public void setP(Point p) {
        this.p = p;
    }
    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public boolean isContains(int x, int y) {
        return (p.distance(x,y) <= r);
    }
}
