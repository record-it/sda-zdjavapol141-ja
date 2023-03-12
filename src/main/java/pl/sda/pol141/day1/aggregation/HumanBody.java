package pl.sda.pol141.day1.aggregation;

public class HumanBody {
    public final Person mother;     //asocjacja
    public final Heart heart;       //kompozycja

    public HumanBody(Person mother) {
        this.mother = mother;
        this.heart = new Heart();
    }
}
