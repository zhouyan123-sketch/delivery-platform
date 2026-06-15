import dfrz.domain.User;
import dfrz.mapper.OrderMapper;
import dfrz.mapper.UserMapper;
import dfrz.util.MybatsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/22 21:17
 */
public class UserMapperTest {
    @Test
    public void loginTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        User user=userMapper.login("zs","123");
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void queryVipMoneyByIdTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        double price=userMapper.queryVipMoneyById(1);
        System.out.println(price);

        sqlSession.close();
    }
    @Test
    public void updateMoneyTest(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        int row=userMapper.updateMoney(1,38);
        System.out.println(row);
        sqlSession.commit(); 
        sqlSession.close();
    }
}
