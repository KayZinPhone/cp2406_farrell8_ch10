public class DemoCandles extends ScentedCandle{

    public static void main(String[]args)
    {
        ScentedCandle candle1 = new ScentedCandle("Pink", 3, "Rose");
        ScentedCandle candle2 = new ScentedCandle("Yellow", 5.5, "Rose");
        ScentedCandle candle3 = new ScentedCandle("Purple", 2, "Lavender");

        System.out.println("Candles:\nColor\tHeight\t\tScent\t\tPrice");
        System.out.println(candle1.getColor()+"\t"+candle1.getHeight()+" inches\t"+candle1.getScent()+"\t\t$"+candle1.getPrice());
        System.out.println(candle2.getColor()+"\t"+candle2.getHeight()+" inches\t"+candle2.getScent()+"\t\t$"+candle2.getPrice());
        System.out.println(candle3.getColor()+"\t"+candle3.getHeight()+" inches\t"+candle3.getScent()+"\t$"+candle3.getPrice());


    }
}
