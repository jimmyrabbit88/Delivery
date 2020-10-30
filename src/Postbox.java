public class Postbox implements WayOfDelivery{
    @Override
    public void howToDeliver(Delivery dt) {
        dt.setMessage("through postbox");
    }
}
