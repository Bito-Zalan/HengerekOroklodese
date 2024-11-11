package hu.szamalk;


public class LyukasHenger extends TomorHenger {
    private double falvastagsag;

    public LyukasHenger(double sugar, double magassag, double falvastagsag){
        this(sugar,magassag,1,falvastagsag);
    }

    public LyukasHenger(double sugar, double magassag,double fajsuly,double falvastagsag) {
        super(sugar,magassag,fajsuly);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public String toString() {
        String os = super.toString();
        return os + "<!--LyukasHenger{" +
                "falvastagsag=" + falvastagsag +
                '}';
    }
}