public class Delivery {
    private WayOfDelivery deliveryType;
    private String message;

    public Delivery(){}
    public Delivery(WayOfDelivery dt){
        this.deliveryType = dt;
    }

    public void setupDelivery(){
        deliveryType.howToDeliver(this);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDeliveryType(WayOfDelivery deliveryType) {
        this.deliveryType = deliveryType;
    }
}
