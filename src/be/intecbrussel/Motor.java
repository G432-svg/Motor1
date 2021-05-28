package be.intecbrussel;

public class Motor {

    private int Max_TOERENTAL = 5800;
    private int toerental;


    public Motor(int speed, int toerental) {
        this.toerental = toerental;

        for(int i = 0;i<5800; i+=speed);{
            System.out.println(i);

        }
    }
    public int getMax_TOERENTAL() {
        return Max_TOERENTAL;
    }
    private int getToerental{
         return toerental;

    }


}
