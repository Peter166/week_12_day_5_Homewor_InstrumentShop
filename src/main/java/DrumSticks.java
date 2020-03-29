public class DrumSticks extends Stock implements IPlay, ISell{

    private String material;
    public DrumSticks( String name, int boughtFor, int sellFor, String material){
        super(name, boughtFor, sellFor);
        this.material = material;
    }

    public String material() {
        return material;
    }

    public String play(){
        return "guitar is playing.";
    }

    public int calculateMarkup(){
       return  this.getSellFor() - this.getBoughtFor();
    }
}