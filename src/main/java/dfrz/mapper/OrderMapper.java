package dfrz.mapper;


import dfrz.DTO.DishDTO;
import dfrz.DTO.OrderDTO;
import dfrz.domain.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description 
 * @Author zhouyan
 * @Date 2026/3/8 17:52
 */public interface OrderMapper {
     //添加订单
    int addOrder(Orders orders);

    int queryId();

    List<Orders> queryOrdersById(int id);

    List<DishDTO> queryDishByOrder(int orderId);

    boolean updateOrderStatus(@Param("orderId") String orderId,@Param("status") int status);

    List<OrderDTO> queryOrderByUserId(@Param("id") int id,@Param("status") int status);


    boolean removeOrder(int orderId);
}
