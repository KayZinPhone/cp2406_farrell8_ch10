public class Horse {
    private String name;
    private String color;
    private int birthYear;

    public Horse(){}
    public Horse(String n, String c, int b)
    {
        name = n;
        color = c;
        birthYear = b;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
