package designpattern.builder;

public class BuilderMain {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(Order.OrderType.ON_SITE).orderBread(Order.BreadType.OMELETTE)
                .orderSauce(Order.SauceType.SOY_SAUCE).build();
        System.out.println(order);

//        Có ba vấn đề chính với  Factory Pattern và Abstract Factory Pattern khi Object có nhiều thuộc tính:
//
//        - Quá nhiều tham số phải truyền vào từ phía client tới Factory Class.
//        - Một số tham số có thể là tùy chọn nhưng trong Factory Pattern, chúng ta phải gửi tất cả tham số,
//          với tham số tùy chọn nếu không nhập gì thì sẽ truyền là null.
//        - Nếu một Object có quá nhiều thuộc tính thì việc tạo sẽ phức tạp.
//        Nếu cần xây dựng một đối tượng Immutable thì cách này cũng không thể thực hiện được.
    }
}
