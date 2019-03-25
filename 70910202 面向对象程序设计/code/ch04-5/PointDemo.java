import java.util.Scanner;

class Point {
	private int x;
	private int y;
 
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	

	public Point(int x){
		this.x = x;
		this.y = x;
        
    }
	

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


class PointDemo {
	
	public static void main(String[] args){
		
	    
	   Scanner scn = new Scanner(System.in);
	    
	    int x1 = scn.nextInt();
	    int x2 = scn.nextInt();
	    int x0 = scn.nextInt();
	    int x3 = scn.nextInt();
	    int x4 = scn.nextInt();
		scn.close();
		
	    Point p1 = new Point(x1,x2);	
		
	    Point p2 = new Point(x0);
	    
	    System.out.printf("%.2f",p1.distance());
	    System.out.println();
	    System.out.printf("%.2f",p2.distance());
	    System.out.println();
	    System.out.printf("%.2f",p1.distance(x3,x4));  
	    System.out.println();
	    System.out.printf("%.2f",p1.distance(p2));
	    System.out.println();  
	}
}







