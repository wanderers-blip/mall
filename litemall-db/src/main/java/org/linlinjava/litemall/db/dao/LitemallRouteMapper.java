package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallRoute;
import org.linlinjava.litemall.db.domain.LitemallRouteExample;

public interface LitemallRouteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    long countByExample(LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int deleteByExample(LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int insert(LitemallRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int insertSelective(LitemallRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRoute selectOneByExample(LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRoute selectOneByExampleSelective(@Param("example") LitemallRouteExample example, @Param("selective") LitemallRoute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallRoute> selectByExampleSelective(@Param("example") LitemallRouteExample example, @Param("selective") LitemallRoute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    List<LitemallRoute> selectByExample(LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRoute selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallRoute.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    LitemallRoute selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallRoute selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LitemallRoute record, @Param("example") LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LitemallRoute record, @Param("example") LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LitemallRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LitemallRoute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") LitemallRouteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_route
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}