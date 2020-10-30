public class Motel implements WayOfDelivery{
    @Override
    public void howToDeliver(Delivery dt) {
        dt.setMessage("deliver to parcel motel");
    }
}
