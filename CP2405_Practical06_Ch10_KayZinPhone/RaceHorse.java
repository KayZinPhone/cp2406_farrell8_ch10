public class RaceHorse extends Horse {

    private int totalRace;

    public RaceHorse(){}

    public RaceHorse(String n, String c, int b, int r){

        super(n, c, b);
        totalRace = r;
    }


    public int getTotalRace() {
        return totalRace;
    }

    public void setTotalRace(int totalRace) {
        this.totalRace = totalRace;
    }
}
