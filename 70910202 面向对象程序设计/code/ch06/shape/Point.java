class Point {
	private int x;
	private int y;
 
	public Point(int x, int y){
		this.x = x;
        this.y = y;
	}

	public double getDistance(int x, int y){
	    return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

}







