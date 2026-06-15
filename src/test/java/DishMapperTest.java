import dfrz.domain.Dish;
import dfrz.mapper.DishMapper;
import dfrz.util.MybatsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/21 22:14
 */
public class DishMapperTest {
    @Test
    public void searchTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        Dish dish=new Dish();
        dish.setId(1);
        dish.setName("羊肉火锅");
        dish.setShopId(1);
        boolean result = dishMapper.search(dish);
        System.out.println(result);

        sqlSession.close();
    }
    @Test
    public void addDishTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        Dish dish=new Dish(5,1,1,"爆辣","辣子鸡",14.2);
        int row=dishMapper.addDish(dish);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryDishsTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        int shopId=1;
        List<Dish> dishes=  dishMapper.queryDishs(1,2);
        for (Dish dish:dishes){
            System.out.println(dish);
        }

        sqlSession.close();
    }
    @Test
    public void removeTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        int dishId=5;
        int row=dishMapper.remove(dishId);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateStatusTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        Map<String, Object> params=new HashMap<>();
        params.put("id",2);
        params.put("i",1);
        dishMapper.updateStatus(params);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryByIdTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        Dish dish=dishMapper.queryById(1);
        System.out.println(dish);

        sqlSession.close();
    }
    @Test
    public void updateByIdTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        Dish dish=new Dish(1,2,1,"好吃不贵","羊肉火锅",45.2);
        int row=dishMapper.updateById(dish);
        System.out.println(row);

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void queryPricebyIdTest(){
        SqlSession sqlSession=MybatsUtil.getSqlSession();
        DishMapper dishMapper=sqlSession.getMapper(DishMapper.class);
        int id=1;
        double price=dishMapper.queryPricebyId(id);
        System.out.println(price);

        sqlSession.close();
    }
}
