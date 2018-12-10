package com.ucf.checkbalance.dao;

import com.ucf.checkbalance.pojo.UcfCheckBalance;

public interface UcfCheckBalanceMapper {
    /**
     *
     * @mbggenerated 2018-09-10
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-09-10
     */
    int insert(UcfCheckBalance record);

    /**
     *
     * @mbggenerated 2018-09-10
     */
    int insertSelective(UcfCheckBalance record);

    /**
     *
     * @mbggenerated 2018-09-10
     */
    UcfCheckBalance selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-09-10
     */
    int updateByPrimaryKeySelective(UcfCheckBalance record);

    /**
     *
     * @mbggenerated 2018-09-10
     */
    int updateByPrimaryKey(UcfCheckBalance record);
}