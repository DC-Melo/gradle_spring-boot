package com.goku.demo.mapper.two;

import com.goku.demo.model.User;
import com.goku.demo.model.UserWithBLOBs;

public interface UserTwoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    int insert(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    int insertSelective(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    UserWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(UserWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);
}