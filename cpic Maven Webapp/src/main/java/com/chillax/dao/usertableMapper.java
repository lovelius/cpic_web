package com.chillax.dao;

import com.chillax.dto.usertable;

public interface usertableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int insert(usertable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int insertSelective(usertable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    usertable selectByPrimaryKey(String username);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(usertable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table usertable
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(usertable record);
}