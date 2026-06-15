package dfrz.mapper;


import dfrz.domain.OrderComment;

/**
 * @Description
 * @Author zhouyan
 * @Date 2026/3/13 19:36
 */
public interface OrderCommentMapper {
    //添加订单详单
    boolean addComment(OrderComment orderComment);
}
