public class Signature implements WayOfDelivery{
    @Override
    public void howToDeliver(Delivery dt) {
        dt.setMessage("get signature");
    }
}
