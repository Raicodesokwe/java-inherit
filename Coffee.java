package inheritance;

public class Coffee extends Beverage{
    public void black(){
        System.out.println("Your order is black coffee");
    }
    public void white(){
        System.out.println("Your order is white coffee");
    }
    public void addSeeds(int cubes){
        System.out.println("You added"+cubes+"cubes of coffee");
    }

    public static void main(String[] args) {
Coffee order1=new Coffee();
order1.addSugar(3);
    order1.isFull();
    order1.addSeeds(2);
    order1.black();
    }
}
