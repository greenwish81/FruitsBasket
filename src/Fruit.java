public class Fruit {
    private String name;
    private String color;
    private int price;

    public Fruit(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public void myNameIs() {
        System.out.println("내 이름은 이거야");
    }

    public void myColorIs() {
        System.out.println("내 색깔은 이거야");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }
}
