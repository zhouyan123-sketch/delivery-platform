import com.mysql.cj.Session;
import dfrz.domain.OrderComment;
import dfrz.mapper.OrderCommentMapper;
import dfrz.util.MybatsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/22 19:16
 */
public class OrderCommentMapperTest {
    @Test
    public void addComment(){
        SqlSession sqlSession= MybatsUtil.getSqlSession();
        OrderCommentMapper orderCommentMapper=sqlSession.getMapper(OrderCommentMapper.class);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data=sdf.format(new Date());
        OrderComment orderComment=new OrderComment(9,2,1,"好次",data);
        boolean result=orderCommentMapper.addComment(orderComment);
        System.out.println(result);

        sqlSession.commit();
        sqlSession.close();
    }
}
