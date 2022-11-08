package org.wx.mall.core.mapper;

import org.apache.ibatis.annotations.Param;
import org.wx.mall.core.entity.WxshopAdmin;
import org.wx.mall.core.entity.WxshopAdminExample;

import java.util.List;

public interface WxshopAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    long countByExample(WxshopAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int deleteByExample(WxshopAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int insert(WxshopAdmin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int insertSelective(WxshopAdmin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    List<WxshopAdmin> selectByExample(WxshopAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    WxshopAdmin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByExampleSelective(@Param("row") WxshopAdmin row, @Param("example") WxshopAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByExample(@Param("row") WxshopAdmin row, @Param("example") WxshopAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByPrimaryKeySelective(WxshopAdmin row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_admin
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    int updateByPrimaryKey(WxshopAdmin row);
}