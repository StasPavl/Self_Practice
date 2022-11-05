package day18_tasks;

public class Carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public double totalPrice;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCoast(){
        totalPrice = (length * width) * unitPrice;
        if (isPersian = true){
            totalPrice +=200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total Price" + calcCoast() +
                '}';
    }
}
