package dfrz.mapper;


import dfrz.domain.OrderItem;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/3/8 17:25
 */
public interface OrderItemMapper {
    //查询订单中是否有一个菜品
    boolean search(int id);
    //添加订单详单
    int addOrderItem(OrderItem orderItem);
    //根据订单id删除信息
    int removeByOrderId(int orderId);
    //统计一个订单的总价钱
    Double queryPrice(int orderId);
}
