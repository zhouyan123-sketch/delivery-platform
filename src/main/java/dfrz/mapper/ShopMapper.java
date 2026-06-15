package dfrz.mapper;


import dfrz.domain.Shop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    Shop login(@Param("loginName") String loginName, @Param("loginPassword") String loginPassword);

    List<Shop> queryShop(String time);
}
