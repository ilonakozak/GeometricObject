public class Driver {
    public static void main(String[] args) {
        //create cone
        Cone cone=new Cone(2,3);
        System.out.println("cone surface area: "+cone.calculateSurfaceArea());
        System.out.println("cone volume: "+cone.calculateVolume());

        //create cylinder
        Cylinder cylinder=new Cylinder(7,10);
        System.out.println("cylinder surface area: "+cylinder.calculateSurfaceArea());
        System.out.println("cylinder volume: "+cylinder.calculateVolume());
    }

}