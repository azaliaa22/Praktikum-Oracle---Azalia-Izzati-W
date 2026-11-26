
public class Instrument {
    protected double price;
    protected boolean onSale;

    public Instrument(double price, boolean onSale) {
        this.price = price;
        this.onSale = onSale;
    }

    public double getPrice() {
        if (onSale) {
            return price * 0.85;
        }
        return price;
    }

    public double getEmployeePrice() {
        return price * 0.75;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
}
