package dfrz.mapper;



import dfrz.domain.Dish;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface DishMapper {
    //查询所有菜品
    boolean search(Dish dish);
    //添加菜品
    int addDish(Dish dish);
    //查询商店的菜品   role=2：只查询上架的
    List<Dish> queryDishs(@Param("id") int id,@Param("role") int role);
    //根据id删除菜品
    int remove(int id);
    //更新菜品上下架状态
    int updateStatus(Map<String, Object> params);
    //根据id查询菜品
    Dish queryById(int id);
    //更新菜品信息
    int updateById(Dish dish);
    //根据菜品id查询菜品价格
    double queryPricebyId(int dishId);
}
