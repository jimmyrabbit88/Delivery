package Loading;

public abstract class Parcel {
    final void loadVan(){
        wrapInProtection();
        markAsPriority();
        placeInVan();
        addLabel();
        markAsLoaded();
    }
    protected abstract void wrapInProtection();

    protected abstract void addLabel();

    void markAsPriority(){
        System.out.println("not Priority");
    }

    private void placeInVan(){
        System.out.println("placing parcel in the van");
    }

    private void markAsLoaded(){
        System.out.println("...parcel loaded in van");
    }


}
