package com.leosanqing.order.mapper;

import com.leosanqing.order.pojo.OrderStatus;
import com.leosanqing.order.pojo.vo.MyOrdersVO;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;
import java.util.Map;

public interface OrdersMapperCustom {
    List<MyOrdersVO> queryMyOrders(
            @Param("paramsMap") Map<String, Object> map);


    int getMyOrderStatusCounts(@Param("paramsMap") Map<String, Object> map);

    List<OrderStatus> getMyOrderTrend(@Param("paramsMap") Map<String, Object> map);
}