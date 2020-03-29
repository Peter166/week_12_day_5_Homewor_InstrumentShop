public class Piano extends Stock implements IPlay, ISell {

    private int numberOfKeys;
    public Piano( String name, int boughtFor, int sellFor, int numberOfKeys){
        super(name, boughtFor, sellFor);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
    public String play(){
        return "piano is playing.";
    }

    public int calculateMarkup(){
        return  this.getSellFor() - this.getBoughtFor();
    }
}
