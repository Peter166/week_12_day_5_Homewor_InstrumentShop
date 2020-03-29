public abstract class Stock {


    private String name;
    private int boughtFor;
    private int sellFor;

    public Stock(String name, int boughtFor, int sellFor){
        this.name = name;
        this.boughtFor = boughtFor;
        this.sellFor = sellFor;
    }

    public String getName() {
        return name;
    }

    public int getBoughtFor() {
        return boughtFor;
    }

    public int getSellFor() {
        return sellFor;
    }
}
