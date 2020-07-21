package test;


public enum CommodityState {
    PUBLIC(0), CUSTOM(1);

    private int id;

    private CommodityState(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}