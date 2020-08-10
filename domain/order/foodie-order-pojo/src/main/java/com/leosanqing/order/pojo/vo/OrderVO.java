package com.leosanqing.order.pojo.vo;

import com.leosanqing.pojo.ShopCartBO;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @Author: leosanqing
 * @Date: 2020/1/15 下午11:31
 * @Package: com.leosanqing.pojo.vo
 * @Description: 返回前端的自定义订单对象
 */
@Data
@Builder
public class OrderVO {
    private String orderId;
    private List<ShopCartBO> toBeRemovedList;
}
