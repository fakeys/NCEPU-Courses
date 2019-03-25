public class Rectangle extends Shape{
    private Point p;
    private int width;
    private int height;

    public double getArea() {
        return this.width * this.height;
    }
    public boolean isContains(int x,int y) {
        return ((x-p.getX()<=width) && (y-p.getY()<=height));
    }
}
