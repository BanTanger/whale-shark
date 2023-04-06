package com.bantanger.im.message.dao.mapper;

import com.bantanger.im.message.dao.ImMessageHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * @author BanTanger 半糖
 * @Date 2023/4/5 13:02
 */
@Repository("messageHistoryMapper")
public interface ImMessageHistoryMapper extends BaseMapper<ImMessageHistoryEntity> {

    /**
     * 批量插入（mysql）
     * @param entityList
     * @return
     */
    Integer insertBatchSomeColumn(Collection<ImMessageHistoryEntity> entityList);

}
