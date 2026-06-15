import dfrz.domain.Shop;
import dfrz.mapper.OrderMapper;
import dfrz.mapper.ShopMapper;
import dfrz.util.MybatsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/22 21:16
 */
public class ShopMapperTest {
    @Test
    public void loginTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        ShopMapper shopMapper=sqlSession.getMapper(ShopMapper.class);

        Shop shop=shopMapper.login("xphg","123");
        System.out.println(shop);

        sqlSession.close();
    }
    @Test
    public void queryShopTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        ShopMapper shopMapper=sqlSession.getMapper(ShopMapper.class);

        List<Shop> list=shopMapper.queryShop("2026-04-22 10:01:01");
        for (Shop shop:list){
            System.out.println(shop);
        }

        sqlSession.commit();
        sqlSession.close();
    }

}
