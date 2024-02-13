import java.util.Comparator;
import java.util.Objects;
import java.util.PrimitiveIterator;

public class Kart {
    private String driver;
    private int speed;
    private int acceleration;
    private double position;
    private int random;
    private int valor_aleatorio;

    final int MAX_POINTS = 18;
    final int MAX_RANDOM = 6;

    public Kart(String driver, int speed, int acceleration, double position, int random) {
        this.driver = driver;
        this.speed = speed;
        this.acceleration = acceleration;
        this.position = position;
        this.random = random;
        this.valor_aleatorio = (int)Math.random()*MAX_RANDOM;
    }


    private void init(){
        this.position = 0;
        this.speed = (int) Math.random()*MAX_POINTS;
        this.acceleration = MAX_POINTS - this.speed;
    }
    public int move(){
        return speed + acceleration + valor_aleatorio;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public double getPosition() {
        return position;
    }

    public void setPosition(double position) {
        this.position = position;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public int getValor_aleatorio() {
        return valor_aleatorio;
    }

    public void setValor_aleatorio(int valor_aleatorio) {
        this.valor_aleatorio = valor_aleatorio;
    }

    public int getMAX_POINTS() {
        return MAX_POINTS;
    }

    public int getMAX_RANDOM() {
        return MAX_RANDOM;
    }

    @Override
    public String toString() {
        return "Kart [driver = " + driver + ", speed = " + speed + ", acceleration = " + acceleration+"]";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kart kart = (Kart) o;
        return speed == kart.speed && acceleration == kart.acceleration && Double.compare(position, kart.position) == 0 && random == kart.random && valor_aleatorio == kart.valor_aleatorio && MAX_POINTS == kart.MAX_POINTS && MAX_RANDOM == kart.MAX_RANDOM && Objects.equals(driver, kart.driver);
    }
}
