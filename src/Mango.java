public class Mango extends Fruit{
    public Mango(String name, String color, int price) {
        super(name, color, price);
    }

    @Override
    public void myNameIs() {
        System.out.println("내 이름은 " + super.getName());
    }

    @Override
    public void myColorIs() {
        System.out.println("내 색깔은 " + super.getColor());
    }
}
