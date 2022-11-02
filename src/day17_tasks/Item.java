package day17_tasks;

public class Item {
    public String name;
    public double unitPrice;
    public double quantity;

    public double calcCost(double unitPrice, double quantity){
        return this.unitPrice * this.quantity;
    }

    public void setInfo(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity + "\n"+
                "total price=" + calcCost(this.unitPrice,this.quantity)
                ;
    }
}
