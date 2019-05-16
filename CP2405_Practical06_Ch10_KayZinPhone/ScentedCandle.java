public class ScentedCandle extends Candle{
    private String scent;

    public ScentedCandle(){}
    public ScentedCandle(String c, double h, String s)
    {
        super(c, h);
        scent = s;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
}
