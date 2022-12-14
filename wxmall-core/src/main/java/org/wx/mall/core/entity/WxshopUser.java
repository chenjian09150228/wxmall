package org.wx.mall.core.entity;

import java.time.LocalDateTime;

public class WxshopUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.id
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.openid
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.unionid
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String unionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.gender
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.birthday
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private LocalDateTime birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.nickname
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.mobile
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.avatar
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.city
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.province
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.country
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String country;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.add_time
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private LocalDateTime addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.session_key
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private String sessionKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.update_time
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private LocalDateTime updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wxshop_user.deleted
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.id
     *
     * @return the value of wxshop_user.id
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.id
     *
     * @param id the value for wxshop_user.id
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.openid
     *
     * @return the value of wxshop_user.openid
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.openid
     *
     * @param openid the value for wxshop_user.openid
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.unionid
     *
     * @return the value of wxshop_user.unionid
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.unionid
     *
     * @param unionid the value for wxshop_user.unionid
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.gender
     *
     * @return the value of wxshop_user.gender
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.gender
     *
     * @param gender the value for wxshop_user.gender
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.birthday
     *
     * @return the value of wxshop_user.birthday
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public LocalDateTime getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.birthday
     *
     * @param birthday the value for wxshop_user.birthday
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.nickname
     *
     * @return the value of wxshop_user.nickname
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.nickname
     *
     * @param nickname the value for wxshop_user.nickname
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.mobile
     *
     * @return the value of wxshop_user.mobile
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.mobile
     *
     * @param mobile the value for wxshop_user.mobile
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.avatar
     *
     * @return the value of wxshop_user.avatar
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.avatar
     *
     * @param avatar the value for wxshop_user.avatar
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.city
     *
     * @return the value of wxshop_user.city
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.city
     *
     * @param city the value for wxshop_user.city
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.province
     *
     * @return the value of wxshop_user.province
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.province
     *
     * @param province the value for wxshop_user.province
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.country
     *
     * @return the value of wxshop_user.country
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.country
     *
     * @param country the value for wxshop_user.country
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.add_time
     *
     * @return the value of wxshop_user.add_time
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public LocalDateTime getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.add_time
     *
     * @param addTime the value for wxshop_user.add_time
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.session_key
     *
     * @return the value of wxshop_user.session_key
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public String getSessionKey() {
        return sessionKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.session_key
     *
     * @param sessionKey the value for wxshop_user.session_key
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey == null ? null : sessionKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.update_time
     *
     * @return the value of wxshop_user.update_time
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.update_time
     *
     * @param updateTime the value for wxshop_user.update_time
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wxshop_user.deleted
     *
     * @return the value of wxshop_user.deleted
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wxshop_user.deleted
     *
     * @param deleted the value for wxshop_user.deleted
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        WxshopUser other = (WxshopUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOpenid() == null ? other.getOpenid() == null : this.getOpenid().equals(other.getOpenid()))
            && (this.getUnionid() == null ? other.getUnionid() == null : this.getUnionid().equals(other.getUnionid()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getSessionKey() == null ? other.getSessionKey() == null : this.getSessionKey().equals(other.getSessionKey()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wxshop_user
     *
     * @mbg.generated Tue Nov 08 14:28:51 CST 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOpenid() == null) ? 0 : getOpenid().hashCode());
        result = prime * result + ((getUnionid() == null) ? 0 : getUnionid().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getSessionKey() == null) ? 0 : getSessionKey().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        return result;
    }
}