import java.util.Random;

public class Circuito {
    private String name;
    private double distance;

    public Circuito(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }
    public int difficulty(){
        Random random= new Random();
        // just in 33% of the cases
        if(random.nextInt(3) == 0) {
            return random.nextInt(5);
        } else{
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Circuit: Circuit [ name = " + name + "distance = " + distance + "]";
    }
}
