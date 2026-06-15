import dfrz.DTO.DishDTO;
import dfrz.DTO.OrderDTO;
import dfrz.domain.Orders;
import dfrz.mapper.OrderMapper;
import dfrz.util.MybatsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/22 21:08
 */
public class OrderMapperTest {
    @Test
    public void queryIdTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        int result=orderMapper.queryId();
        System.out.println(result);

        sqlSession.close();
    }
    @Test
    public void addOrderTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data=simpleDateFormat.format(new Date());
        Orders orders=new Orders();
        orders.setUserid(1);
        orders.setCreateTime(data);
        orders.setLinkName("zhangs");
        orders.setLinkAddress("zj");
        orders.setLinkTel("156");
        orders.setStatus(1);
        orders.setShopId(2);
        int row=orderMapper.addOrder(orders);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryOrderByIdTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        List<Orders> list=orderMapper.queryOrdersById(1);
        for (Orders o:list){
            System.out.println(o);
        }

        sqlSession.close();
    }
    @Test
    public void queryDishByOrderTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        List<DishDTO> list=orderMapper.queryDishByOrder(1);
        for (DishDTO dishDTO:list){
            System.out.println(dishDTO);
        }

        sqlSession.close();
    }
    @Test
    public void queryOrderByUserTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        List<OrderDTO> list=orderMapper.queryOrderByUserId(1,1);
        for (OrderDTO orderDTO:list){
            System.out.println(orderDTO);
        }
        sqlSession.close();
    }
    @Test
    public void removeOrderTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        boolean row=orderMapper.removeOrder(22);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryOrderStatusTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);

        boolean result=orderMapper.updateOrderStatus("1",1);
        System.out.println(result);

        sqlSession.commit();
        sqlSession.close();
    }
}
