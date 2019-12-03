public class Cylinder {

        private double radius;
        private double height;
        public Cylinder ( double r, double h)
        { radius = r; height = h; }
        public double getRadius ()
        { return radius; }
        public double getHeight ()
        { return height; }
        public double getVolume ()
        { return Math .PI * radius * radius * height; }
        public void widen ( double factor )
        { radius *= factor ; }
        public void print(){
                System.out.print(radius);
                System.out.print("-");
                System.out.print(height);
                System.out.print("-");
                System.out.println(getVolume());
        }

}
