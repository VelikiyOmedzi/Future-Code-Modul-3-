package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource {
    //шуточный источник данных для заказа.
    private Order order;

    @Override
    public Order getOrder() {
        return order;
    }

    @Override
    public void createOrder(Order order) {
        this.order = order;
    }
}
