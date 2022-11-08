package org.wx.mall.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.wx.mall.core.entity.WxshopUser;
import org.wx.mall.core.entity.WxshopUserExample;

import java.util.List;

public interface WxshopUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    long countByExample(WxshopUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int deleteByExample(WxshopUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int insert(WxshopUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int insertSelective(WxshopUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    List<WxshopUser> selectByExample(WxshopUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    WxshopUser selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByExampleSelective(@Param("row") WxshopUser row, @Param("example") WxshopUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByExample(@Param("row") WxshopUser row, @Param("example") WxshopUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByPrimaryKeySelective(WxshopUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByPrimaryKey(WxshopUser row);
}