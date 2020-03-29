public class Guitar extends Stock implements IPlay, ISell {

    private int numberOfStrings;
    public Guitar( String name, int boughtFor, int sellFor, int numberOfStrings){
        super(name, boughtFor, sellFor);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "guitar is playing.";
    }

    public int calculateMarkup(){
        return  this.getSellFor() - this.getBoughtFor();
    }
}
