package com.sunbufu.statemachine.mapper;

import com.sunbufu.statemachine.entity.Order;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * order数据库操作
 * 
 * @author sunbufu
 */
@Component
public class OrderMapper {

    private static Map<Integer, Order> db = new HashMap<>();

    private static int id = 1;

    /**
     * 保存
     * 
     * @param order 订单
     * @return 订单
     */
    public Order save(Order order) {
        if (null == order.getId()) {
            order.setId(id++);
        }
        db.put(order.getId(), order);
        return order;
    }

    /**
     * 查询
     * 
     * @param id 订单id
     * @return 订单
     */
    public Order select(int id) {
        return db.get(id);
    }

}
