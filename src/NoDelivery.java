public class NoDelivery implements WayOfDelivery{

    @Override
    public void howToDeliver(Delivery dt) {
        dt.setMessage("do not deliver");
    }
}
