package be.intecbrussel;

public class Auto {

    private String merknaam;
    private String nummerplaat;
    public Auto motor;

    public Auto(String vw_golf, String bhz456) {
    }


    @Override
    public String toString() {
        return "Auto{" +
                "merknaam='" + merknaam + '\'' +
                '}';
    }
    public Auto(Auto motor) {
        this.motor = motor;

    }
    public void  geefGas(int gas){


    }
}
