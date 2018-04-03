package com.syc.ssm.dao;

import com.syc.ssm.domain.SysPart;
import com.syc.ssm.domain.SysPartExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface SysPartMapper {
    long countByExample(SysPartExample example);

    int deleteByExample(SysPartExample example);

    int insert(SysPart record);

    int insertSelective(SysPart record);

    List<SysPart> selectByExample(SysPartExample example);

    int updateByExampleSelective(@Param("record") SysPart record, @Param("example") SysPartExample example);

    int updateByExample(@Param("record") SysPart record, @Param("example") SysPartExample example);
}