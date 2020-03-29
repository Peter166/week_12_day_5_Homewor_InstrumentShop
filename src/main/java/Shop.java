import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell stockItem){
        this.stock.add(stockItem);
    }

    public void removeFromStock(ISell stockItem){
        this.stock.remove(stockItem);
    }

    public int fullStockMarkup(){
      int  total = 0;
        for (ISell stockItem : stock){
           int result = stockItem.calculateMarkup();
           total += result;
        }
        return total;
    }

}
