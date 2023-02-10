import java.util.ArrayList;

public class Basket {
    // 바구니에 담긴 과일들의 이름과 색깔을 출력
    ArrayList<Fruit> fruitsBasket;

    public Basket(ArrayList<Fruit> fruitsBasket) {
        this.fruitsBasket = fruitsBasket;
    }

    // 바구니에 담긴 과일들의 이름 출력
    public void fruitNameIs() {
        for (int i = 0; i < fruitsBasket.size(); i++) {
            fruitsBasket.get(i).myNameIs();
        }
    }

    // 바구니에 담긴 과일들의 색깔 출력
    public void fruitColorIs() {
        for (int i = 0; i < fruitsBasket.size(); i++) {
            fruitsBasket.get(i).myColorIs();
        }
    }

    // 바구니에 담긴 과일들의 가격의 합을 출력
    public void priceSumIs() {

        int count = 0;
        for (int i = 0; i < fruitsBasket.size(); i++) {
            count += fruitsBasket.get(i).getPrice();
        }

        System.out.println("가격의 합은 " + count);
    }
}
