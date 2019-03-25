public abstract class Shape {
    public Shape(){}
    public abstract double getArea();
    public abstract boolean isContains(int x,int y);
    public void print(int width, int height) {
        for(int i=0;i<width;i++) {
            for(int j=0;j<height;j++) {
                if(this.isContains(j,i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
