package Loading;

public class VanloadingDriver {
    public static void main(String[] args) {
        Parcel np = new LargeParcel();
        np.loadVan();

        SmallParcel sp = new SmallParcel();
        sp.loadVan();
    }
}
