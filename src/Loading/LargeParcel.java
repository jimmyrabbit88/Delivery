package Loading;

public class LargeParcel extends Parcel{
    @Override
    protected void wrapInProtection() {
        System.out.println("wrap in bubble wrap");
    }

    @Override
    protected void addLabel() {
        System.out.println("large parcel Address: 1 road");
    }

    @Override
    void markAsPriority() {
        System.out.println("Is Priority");
    }
}
