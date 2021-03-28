public class Cone extends CircleBase{
    private int height;

    //default constructor
    public Cone() {
        super(1);
        this.height = 1;
    }

    @Override
    double calculateSurfaceArea() {
       return Math.PI*this.radius*(this.radius +Math.sqrt(this.height*this.height + this.radius*this.radius));

    }

    //constructor with parameter
    public Cone(int radius, int height) {
        super(radius);
        this.height = height;
    }

    //calculate volume
    // volume of a cone is V=1/3h?r².
    public double calculateVolume(){
        return (1.0/3.0)*this.height*Math.PI*this.radius*this.radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}