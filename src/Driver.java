public class Driver {
    public static void main(String[] args) {
        Parcel p1 = new Parcel();
        WayOfDelivery motel = new Motel();
        p1.setDeliveryType(motel);
        p1.setupDelivery();
        System.out.println(p1.getMessage());

//        WayOfDelivery way = new Motel();
//        Delivery d1 = new Delivery(way);
//        d1.setupDelivery();
//        System.out.println(d1.getMessage());
    }
}
