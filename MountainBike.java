package inheritance;

public class MountainBike extends Bicycle{
    public int seatH;

    public MountainBike(int gear,int speed,int seatH){
        super(gear,speed);
        this.seatH=seatH;
    }
    public void setSeatH(int seatH){
        this.seatH=seatH;
    }
    @Override
    public String toString(){
        return "MountainBike{"+
                "seatH="+ seatH+
                ",gear="+gear+
                ",speed="+speed+
                '}';
    }

    public static void main(String[] args) {
       MountainBike mybike=new MountainBike(2,15,3);
    mybike.applyBrake(5);
        System.out.println(mybike.toString());
    }
}
