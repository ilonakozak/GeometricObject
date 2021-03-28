abstract  class CircleBase {
    private String color;
    protected int radius;

    //constructor with parameter
    public CircleBase(int radius) {
        this.radius = radius;
    }

    //default constructor
    public CircleBase() {
        this.radius = 1;
    }

    //abstract method for calculation surface area
    abstract double calculateSurfaceArea();


}
