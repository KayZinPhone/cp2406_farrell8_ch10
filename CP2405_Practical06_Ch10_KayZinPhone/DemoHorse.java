public class DemoHorse extends RaceHorse{

    public static void main(String[]args)
    {
        RaceHorse horse1 = new RaceHorse("Matt", "Black", 2010, 10);
        RaceHorse horse2 = new RaceHorse("Storm", "Brown", 2003, 20);
        RaceHorse horse3 = new RaceHorse("Windy", "Grey", 2013, 7);

        System.out.println("There are 3 hourses:\t Name\tColor\tBirthYear\tTotal Race");
        System.out.println("First Horse: \t"+ horse1.getName()+"\t"+horse1.getColor()+"\t"+horse1.getBirthYear()+"\t"+horse1.getTotalRace());
        System.out.println("Second Horse: \t"+ horse2.getName()+"\t"+horse2.getColor()+"\t"+horse2.getBirthYear()+"\t"+horse2.getTotalRace());
        System.out.println("Third Horse: \t"+ horse3.getName()+"\t"+horse3.getColor()+"\t"+horse3.getBirthYear()+"\t"+horse3.getTotalRace());
    }
}
