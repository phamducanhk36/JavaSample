package designpattern.builder;

public interface OrderBuilder {

    OrderBuilder orderType(Order.OrderType orderType);

    OrderBuilder orderBread(Order.BreadType breadType);

    OrderBuilder orderSauce(Order.SauceType sauceType);

    OrderBuilder orderVegetable(Order.VegetableType vegetableType);

    Order build();

}