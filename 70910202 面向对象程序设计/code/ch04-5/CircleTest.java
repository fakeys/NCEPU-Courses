import java.util.Scanner;

class Point {
	private int x;
	private int y;
 
    // Point()   Point(int x, int y)    Point(int x)
    public Point(){}

	public Point(int x, int y){ 
		this.x = x;
		this.y = y;
	}

	public Point(int x){ 
		this.x = x;
		this.y = x;
	}
	
    //distance()  distance(int x, int y)   distance(Point other)
	public double distance(){  
		return Math.sqrt(x*x+y*y);
	}

	public double distance(int x, int y){ 
		return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}

	public double distance(Point other){ 
		return Math.sqrt((x-other.getX())*(x-other.getX())+(y-other.getY())*(y-other.getY()));
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}


class Circle {
	private Point center;  
	private double r;  	
	
	// Circle()   Circle(Point center)    Circle(Point center, double r)
    public Circle() {}

	public Circle(Point center) {
		this.center = center;
	}

	public Circle(Point center, double r) {
		this.center = center;
		this.r = r;
	}
	public double getArea(){
		return Math.PI*r*r;
	}
	

	public boolean contains(Point p){
		return (this.center.distance(p) <= r);
	}
	
	
	public boolean contains(int x, int y){
		return (this.center.distance(x,y) <= r);
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}	
	
}

class CircleTest {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	    
		int x1 = scn.nextInt();
		int y1 = scn.nextInt();
		double r1 = scn.nextDouble();
		Point p1 = new Point(x1,y1);
		Circle c1 = new Circle(p1, r1);
		
		
		int x = scn.nextInt();
		Point p2 = new Point(x);
		scn.close();

		System.out.print("Area of Circle(("+ c1.getCenter().getX() +","+ c1.getCenter().getY() +"),"+c1.getR()+") is:");
		System.out.printf("%.2f",c1.getArea());
		System.out.println();
		
        //print p2 is  in c1 ,or not
		boolean flag = c1.contains(p2);
if (flag)
    System.out.print("Point(" + p2.getX() + "," + p2.getY()+") is in the Circle((" + c1.getCenter().getX() + "," + c1.getCenter().getY() + ")," + c1.getR()+ ")");
else
    System.out.print("Point(" + p2.getX() + "," + p2.getY()+") is not in the Circle((" + c1.getCenter().getX() + "," + c1.getCenter().getY() + ")," + c1.getR()+ ")");
	}
}

