package dfrz.mapper;


import dfrz.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/3/9 18:17
 */
public interface UserMapper {
    User login(@Param("loginName") String loginName,@Param("loginPassword") String loginPassword);

    double queryVipMoneyById(int userid);

    int updateMoney(@Param("userid") int userid,@Param("sumPrice") double sumPrice);
}
