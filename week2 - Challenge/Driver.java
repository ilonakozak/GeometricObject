public class Driver {
    public static void main(String[] args) {
        //create cone
        Cone cone=new Cone(12,3);
        System.out.println("cone surface area: "+cone.calculateSurfaceArea());
        System.out.println("cone volume: "+cone.calculateVolume());

        //create cylinder
        Cylinder cylinder=new Cylinder(7,10);
        System.out.println("cylinder surface area: "+cylinder.calculateSurfaceArea());
        System.out.println("cylinder volume: "+cylinder.calculateVolume());

        //Use this to compare the 2 shapes we made last week, to see which is bigger
        if(cone.compareTo(cylinder)>0){
            System.out.println("Cone is bigger than Cylinder!");
        }
        else if(cone.compareTo(cylinder)<0){
            System.out.println("Cylinder is bigger than Cone!");
        }
        else {
            System.out.println("Both are in similar size!");
        }
    }
}
