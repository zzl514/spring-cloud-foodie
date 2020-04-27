package com.leosanqing.item.mapper;


import com.leosanqing.item.pojo.vo.MyCommentVO;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;
import java.util.Map;

public interface ItemsCommentsMapperCustom {
    /**
     * 保存评价列表
     *
     * @param map
     */
    void saveComments(Map<String, Object> map);

    /**
     * 查询我的评价
     *
     * @param map
     * @return
     */
    List<MyCommentVO> queryMyComments(@Param("paramsMap") Map<String, Object> map);
}