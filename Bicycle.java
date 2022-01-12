package inheritance;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int dec) {
        speed -= dec;

    }

    public void speedUp(int inc) {
        speed += inc;
    }

    public void changegear(int g) {
        this.gear = g;
    }

    @Override
    public String toString(){
        return "Bicycle{" +
                ",gear=" + gear +
                ",speed=" + speed +
                '}';
    }
}