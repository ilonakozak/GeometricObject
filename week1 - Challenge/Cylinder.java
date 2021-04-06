public class Cylinder extends CircleBase{
    private int height;

    //default constructor
    public Cylinder() {
        super(1);
        this.height = 1;
    }

    @Override
    double calculateSurfaceArea() {
        //the formula for the total surface area is 2(pi)radius(height) + 2(pi)radius squared
        return 2*Math.PI*this.radius*this.height + 2*Math.PI*this.radius*this.radius;
    }

    //constructor with parameter
    public Cylinder(int radius, int height) {
        super(radius);
        this.height = height;
    }

    //calculate volume
    // Cylinder's volume is given by the formula, ?r2h
    public double calculateVolume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
