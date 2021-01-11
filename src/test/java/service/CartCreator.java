package service;

import model.Cart;
import model.Product;

import java.util.List;

public class CartCreator {
    public static final String TESTDATA_CART_PROMO="testdata.cart.promo";

    public static Cart getCart(){
        return new Cart(TestDataReader.getTestData(TESTDATA_CART_PROMO));
    }

}
