package Loading;

public class SmallParcel extends Parcel {
    @Override
    protected void wrapInProtection() {
        System.out.println("no need to wrap");
    }

    @Override
    protected void addLabel() {
        System.out.println("small parcel delivery");
    }
}
