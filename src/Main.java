import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Apple apple = new Apple("사과","빨강",1000);
//        Mango mango = new Mango("망고","노랑",2000);
//        Grape grape = new Grape("포도","보라",1500);
//
//        apple.myNameIs();
//        apple.myColorIs();
//
//        mango.myNameIs();
//        mango.myColorIs();
//
//        grape.myNameIs();
//        grape.myColorIs();

        Fruit apple = new Apple("사과","빨강",1000);
        Fruit grape = new Grape("포도","보라",1500);
        Fruit mango = new Mango("망고","노랑", 2000);
        Fruit kiwi = new Kiwi("키위", "초록", 500);

        ArrayList<Fruit> fruitsBasket = new ArrayList<>();
        fruitsBasket.add(apple);
        fruitsBasket.add(grape);
        fruitsBasket.add(mango);
        fruitsBasket.add(kiwi);

        Basket basket = new Basket(fruitsBasket);

        basket.fruitNameIs();
        basket.fruitColorIs();
        basket.priceSumIs();

//        apple.myNameIs();
//        apple.myColorIs();
//
//        grape.myNameIs();
//        grape.myColorIs();
//
//        mango.myNameIs();
//        mango.myColorIs();
    }
}