package com.zlyx.wechatjava.mapper;

import com.zlyx.wechatjava.pojo.LessionCompleteStatus;
import com.zlyx.wechatjava.pojo.LessionCompleteStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LessionCompleteStatusMapper {
    int countByExample(LessionCompleteStatusExample example);

    int deleteByExample(LessionCompleteStatusExample example);

    int deleteByPrimaryKey(Long comId);

    int insert(LessionCompleteStatus record);

    int insertSelective(LessionCompleteStatus record);

    List<LessionCompleteStatus> selectByExample(LessionCompleteStatusExample example);

    LessionCompleteStatus selectByPrimaryKey(Long comId);

    int updateByExampleSelective(@Param("record") LessionCompleteStatus record, @Param("example") LessionCompleteStatusExample example);

    int updateByExample(@Param("record") LessionCompleteStatus record, @Param("example") LessionCompleteStatusExample example);

    int updateByPrimaryKeySelective(LessionCompleteStatus record);

    int updateByPrimaryKey(LessionCompleteStatus record);
}