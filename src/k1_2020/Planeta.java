package k1_2020;

public class Planeta {
    public static int i=-1;
    String naziv;
    private double x;
    private double y;
    private double z;

    public Planeta(String naziv, double x, double y, double z) {
        i++;
        this.naziv = naziv;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Planeta " + naziv + i + "(" + x + "," + y + "," + z + ")";
    }

    public double udaljenost(Planeta planeta) {
        double dx;
        double dy;
        double dz;

        dx=x-planeta.x;
        dy=y-planeta.y;
        dz=z-planeta.z;

        return Math.sqrt(dx*dx+dy*dy+dz*dz);
    }
}
