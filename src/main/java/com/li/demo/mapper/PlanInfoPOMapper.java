package com.li.demo.mapper;

import com.li.demo.model.PlanInfoPO;
import com.li.demo.model.PlanInfoPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanInfoPOMapper {
    /**
     * countByExample
     * @param example example
     * @return long
     */
    long countByExample(PlanInfoPOExample example);

    /**
     * deleteByExample
     * @param example example
     * @return int
     */
    int deleteByExample(PlanInfoPOExample example);

    /**
     * deleteByPrimaryKey
     * @param planId planId
     * @return int
     */
    int deleteByPrimaryKey(Long planId);

    /**
     * insert
     * @param record record
     * @return int
     */
    int insert(PlanInfoPO record);

    /**
     * insertSelective
     * @param record record
     * @return int
     */
    int insertSelective(PlanInfoPO record);

    /**
     * selectByExample
     * @param example example
     * @return java.util.List<com.li.demo.model.PlanInfoPO>
     */
    List<PlanInfoPO> selectByExample(PlanInfoPOExample example);

    /**
     * selectByPrimaryKey
     * @param planId planId
     * @return com.li.demo.model.PlanInfoPO
     */
    PlanInfoPO selectByPrimaryKey(Long planId);

    /**
     * updateByExampleSelective
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExampleSelective(@Param("record") PlanInfoPO record, @Param("example") PlanInfoPOExample example);

    /**
     * updateByExample
     * @param record record
     * @param example example
     * @return int
     */
    int updateByExample(@Param("record") PlanInfoPO record, @Param("example") PlanInfoPOExample example);

    /**
     * updateByPrimaryKeySelective
     * @param record record
     * @return int
     */
    int updateByPrimaryKeySelective(PlanInfoPO record);

    /**
     * updateByPrimaryKey
     * @param record record
     * @return int
     */
    int updateByPrimaryKey(PlanInfoPO record);
}