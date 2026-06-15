import dfrz.domain.OrderItem;
import dfrz.mapper.OrderItemMapper;
import dfrz.util.MybatsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/22 19:51
 */
public class OrderItemMapperTest {
    @Test
    public void searchTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderItemMapper orderItemMapper=sqlSession.getMapper(OrderItemMapper.class);
        int id=100;
        boolean result=orderItemMapper.search(id);
        System.out.println(result);

        sqlSession.close();
    }
    @Test
    public void addOrderItemTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        OrderItemMapper orderItemMapper=sqlSession.getMapper(OrderItemMapper.class);
        OrderItem orderItem=new OrderItem();
        orderItem.setOrderId(1);
        orderItem.setDishId(5);
        orderItem.setBuyNum(1);
        orderItem.setPrice(12);
        orderItem.setShopId(1);
        int row=orderItemMapper.addOrderItem(orderItem);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void removeByOrderIdTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        OrderItemMapper orderItemMapper=sqlSession.getMapper(OrderItemMapper.class);
        int id=25;
        int row=orderItemMapper.removeByOrderId(id);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test

    public void queryPriceTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        OrderItemMapper orderItemMapper=sqlSession.getMapper(OrderItemMapper.class);
        Double price=orderItemMapper.queryPrice(1);
        System.out.println(price);

        sqlSession.commit();
        sqlSession.close();
    }
}
