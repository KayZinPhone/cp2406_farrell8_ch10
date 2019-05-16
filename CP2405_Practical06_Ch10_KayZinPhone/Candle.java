public class Candle {
    private String color;
    private double height;
    private double price;

    public Candle(){}
    public Candle(String c, double h)
    {
        color = c;
        height = h;

    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPrice() {

        price = 2 * height;
        return price;
    }
}

