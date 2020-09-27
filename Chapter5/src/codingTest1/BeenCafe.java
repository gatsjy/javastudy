package codingTest1;

public class BeenCafe {

    private int price;
    private int SalesCnt;

    public BeenCafe(int price){
        this.price = price;
    }

    int SaleCoffee(){
        SalesCnt++;
        return this.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalesCnt() {
        return SalesCnt;
    }

    public void setSalesCnt(int salesCnt) {
        SalesCnt = salesCnt;
    }
}
