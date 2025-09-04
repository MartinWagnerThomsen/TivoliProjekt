public class TivoliRide {

    private double minHeight;

    // Constructor to set the minimum height
    public TivoliRide(double minHeight) {
        this.minHeight = minHeight;
    }

    // We use boolean method to check if person is tall enough for the ride
    public boolean canRide(double height) {
        return height >= minHeight;

    }
}
