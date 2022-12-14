package org.wx.mall.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.wx.mall.core.entity.WxshopAccessToken;
import org.wx.mall.core.entity.WxshopAccessTokenExample;

import java.util.List;

public interface WxshopAccessTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    long countByExample(WxshopAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int deleteByExample(WxshopAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int insert(WxshopAccessToken row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int insertSelective(WxshopAccessToken row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    List<WxshopAccessToken> selectByExample(WxshopAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    WxshopAccessToken selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByExampleSelective(@Param("row") WxshopAccessToken row, @Param("example") WxshopAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByExample(@Param("row") WxshopAccessToken row, @Param("example") WxshopAccessTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByPrimaryKeySelective(WxshopAccessToken row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_access_token
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByPrimaryKey(WxshopAccessToken row);
}