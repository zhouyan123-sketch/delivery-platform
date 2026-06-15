package dfrz.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/4/16 21:59
 */
public class MybatsUtil {
    public static SqlSession getSqlSession(){
        try {
            String resource="mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession=sqlSessionFactory.openSession();
            return sqlSession;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession!=null){
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
