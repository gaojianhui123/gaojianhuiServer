package com.sanyi.framework.dtomapper;

import com.sanyi.framework.dto.LienPersonnelCaterDto;
import com.sanyi.framework.model.ProtectedResource;
import com.sanyi.framework.model.Room;
import com.sanyi.framework.dto.LienPersonnelBzDto;
import com.sanyi.framework.dto.LienPersonnelTHDto;
import com.sanyi.framework.dto.StatisticResultDto;
import com.sanyi.framework.dto.StatisticTanHuaDto;
import com.sanyi.framework.model.Baozhangshenqing;
import com.sanyi.framework.model.Bed;
import com.sanyi.framework.model.HealthDrugRelate;
import com.sanyi.framework.model.Tanhuashenqing;
import com.sanyi.framework.model.LienPersonnel;
import com.sanyi.framework.model.LienPersonnelTanHuaRelate;
import org.apache.ibatis.annotations.Select;
import com.sanyi.framework.dto.StatisticDto;
import com.sanyi.framework.model.Dictionary;
import com.sanyi.framework.page.QueryParam;
import org.apache.ibatis.annotations.Param;
import com.sanyi.framework.model.Feedback;
import com.sanyi.framework.model.Health;
import com.sanyi.framework.model.Nurse;
import com.sanyi.framework.model.Drug;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommonMapper {
    /**
     * 查找用户有权限的菜单
     *
     * @param userId
     * @return
     */
    List<ProtectedResource> findMenusByUserid(@Param("userId") String userId);

    /**
     * 查找用户有权限访问的前台资源，包括菜单和按钮，不包含后台url
     *
     * @param userId
     * @return
     */
    List<ProtectedResource> findFontProtectedResourceByUserid(@Param("userId") String userId);

    /**
     * 查找字典列表
     *
     * @param query
     * @return
     */
    List<Dictionary> selectDictionary(@Param("query") QueryParam<Dictionary> query);

    /**
     * 查看护列表
     *
     * @param query
     * @return
     */
    List<Nurse> selectNurse(@Param("query") QueryParam<Nurse> query);

    /**
     * 导出日报信息  按照前台传进来的上报时间  submitTime
     * 查询出谈话这一天的谈话列表
     *
     * @param submitTime
     * @return
     */
    @Select("SELECT t1.*,t2.lienPersonnelid as lpId,t3.daiHao as daiHao FROM t_lien_tanhua t1, t_nurse t2,t_lien_personnel t3 WHERE t1.`nurseId` = t2.id AND t2.lienPersonnelid = t3.id  AND t2.submitTime = #{submitTime} AND t1.`deleted` = FALSE AND t2.deleted = FALSE")
    List<LienPersonnelTanHuaRelate> selectLienPersonnelTanHuaBySubmitTime(@Param("submitTime") String submitTime);

    /**
     * 导出日报信息  按照前台传进来的上报时间  submitTime（根据lpId去重）
     * 查询出谈话这一天的谈话列表（根据lpId去重）
     *
     * @param submitTime
     * @return
     */
    @Select("SELECT t1.*,t2.lienPersonnelid as lpId,t2.restsRemarks as restsRemarks,t3.daiHao as daiHao FROM t_lien_tanhua t1, t_nurse t2,t_lien_personnel t3 WHERE t1.`nurseId` = t2.id AND t2.lienPersonnelid = t3.id  AND t2.submitTime = #{submitTime} AND t1.`deleted` = FALSE AND t2.deleted = FALSE group by t1.nurseId")
    List<LienPersonnelTanHuaRelate> selectDistinctLienPersonnelTanHuaBySubmitTime(@Param("submitTime") String submitTime);

    /**
     * 根据上报时间submitTime
     * 查询看护列表
     *
     * @param submitTime
     * @return
     */
    @Select("	SELECT *,t2.daiHao AS daiHao FROM t_nurse t1 LEFT JOIN t_lien_personnel t2 ON t1.lienPersonnelid = t2.id WHERE t1.submitTime = #{submitTime} AND t1.deleted IS FALSE")
    List<Nurse> selectNurseBySubmitTime(String submitTime);

    @Select("select t5.daiHao as daiHao,1 as count,if(ROUND((UNIX_TIMESTAMP(t5.jieshushijian)-UNIX_TIMESTAMP(t5.kaishishijian))/60) is not null,ROUND((UNIX_TIMESTAMP(t5.jieshushijian)-UNIX_TIMESTAMP(t5.kaishishijian))/60),0) AS shichang,if (ROUND((UNIX_TIMESTAMP(t5.jieshushijian)-UNIX_TIMESTAMP(t5.kaishishijian))/60) is not null,ROUND((UNIX_TIMESTAMP(t5.jieshushijian)-UNIX_TIMESTAMP(t5.kaishishijian))/60),0) AS SUM,t5.noinquiry from (select t2.daiHao,min(if (date_format(t1.talkStartTime,'%Y%m%d') is not null, t1.talkStartTime, null)) as kaishishijian,max(if(date_format(t1.talkEndTime,'%Y%m%d') is not null, t1.talkEndTime, null)) as jieshushijian ,t1.ciShu,t2.noinquiry from t_lien_tanhua t1 left join (SELECT t3.*,t4.daiHao AS daiHao FROM t_nurse t3 LEFT JOIN t_lien_personnel t4 ON t3.lienPersonnelid = t4.id) t2 on t1.nurseId = t2.id where t1.deleted = false and t1.nurseId is not null and t2.submitTime = #{submitTime} group by t1.cishu ORDER BY t2.daiHao ASC) t5;")
    List<Nurse> selectNurseBySubmitTime1(String submitTime);

    /**
     * 查看留置人信息  （LienPersonnel）
     *
     * @param query
     * @return
     */
    List<LienPersonnel> selectLienPersonnel(@Param("query") QueryParam<LienPersonnel> query);

    // 导出在点或者撤离留置人员信息一览表
    @Select("SELECT t1.*, t2.`dicName` AS kanhu, t3.dicName AS bumen FROM t_lien_personnel t1 "
            + "LEFT JOIN t_dictionary t2 ON t1.kanhuLiLiang = t2.id "
            + "LEFT JOIN t_dictionary t3 ON t1.cbDepartment = t3.id "
            + "WHERE t1.deleted = FALSE and t1.outStatus = #{outStatus}")
    List<LienPersonnel> selectLienPersonnelStatus(String outStatus);

    // 导出全部留置人员信息一览表
    @Select("SELECT t1.*, t2.`dicName` AS kanhu, t3.dicName AS bumen FROM t_lien_personnel t1 "
            + "LEFT JOIN t_dictionary t2 ON t1.kanhuLiLiang = t2.id "
            + "LEFT JOIN t_dictionary t3 ON t1.cbDepartment = t3.id "
            + "WHERE t1.deleted = FALSE")
    List<LienPersonnel> selectLienPersonnelAll();

    /**
     * 进驻表关联看护表（nurse）
     *
     * @param queryParam
     * @return
     */
    List<LienPersonnel> selectLienPersonnelJoinNurse(@Param("query") QueryParam<LienPersonnel> queryParam);
    /**
     * 根据楼层查询楼层的留置人列表
     * @param floorTier
     * @return
     */
    List<LienPersonnel> selectLienPersonnelByFloorTier(@Param("floorTier") String floorTier);
    /**
     * 进驻表关联饮食表
     */
    List<LienPersonnelCaterDto> selectLienPersonnelJoinCater(@Param("query") QueryParam<LienPersonnelCaterDto> query);

    /**
     * 查找进驻体检列表
     *
     * @param query
     * @return
     */
    List<Health> selectHealth(@Param("query") QueryParam<Health> query);

    /**
     * 查找保障申请列表
     *
     * @param query
     * @return
     */
    List<Baozhangshenqing> selectBaozhangshenqing(@Param("query") QueryParam<Baozhangshenqing> query);

    /**
     * 查找谈话申请列表
     *
     * @param query
     * @return
     */
    List<Tanhuashenqing> selectTanhuashenqing(@Param("query") QueryParam<Tanhuashenqing> query);

    /**
     * 查找问题反馈信息列表
     *
     * @param query
     * @return
     */
    List<Feedback> selectFeedback(@Param("query") QueryParam<Feedback> query);

    /**
     * 在看护管理查看 谈话名单列表
     *
     * @param query
     * @return
     */
    List<Tanhuashenqing> talklist(@Param("query") QueryParam<Tanhuashenqing> query);

    /**
     * 进驻表关联谈话申请表
     */
    List<LienPersonnelTHDto> selectLienPersonnelJoinTh(@Param("query") QueryParam<LienPersonnelTHDto> query);

    /**
     * 进驻表关联保障申请表
     *
     * @param query
     * @return
     */
    List<LienPersonnelBzDto> selectLienPersonnelJoinBz(@Param("query") QueryParam<LienPersonnelBzDto> query);

    /**
     * 查看体检药品关联表
     *
     * @param query
     * @return
     */
    List<HealthDrugRelate> selectHealthDrugRelate(@Param("query") QueryParam<HealthDrugRelate> query);

    /**
     * 查看药品
     *
     * @param query
     * @return
     */
    List<Drug> selectDrug(@Param("query") QueryParam<Drug> query);

    /**
     * 进驻表关联体检表
     */
    List<LienPersonnel> selectLienPersonnelJoinHealth(@Param("query") QueryParam<LienPersonnel> query);

    @Select("SELECT * FROM (SELECT * FROM (" + "SELECT t1.*,t2.`daiHao` AS daiHao FROM t_health t1 "
            + "LEFT JOIN t_lien_personnel t2 ON t1.lpId = t2.id "
            + "WHERE t1.`deleted` = FALSE  AND t1.lpId = '${lpId}' "
            + "AND t1.`status`='2') t3, "
            + "(SELECT @x:=0,@y:=0,@z:=0) X ORDER BY CASE WHEN t3.shiDuan = '1' THEN @x:=@x+1 "
            + "WHEN t3.shiDuan='2' THEN @y:=@y+1 " + "WHEN t3.shiDuan='3' THEN @z:=@z+1 END, " + "t3.shiDuan ASC)t4 "
            + "GROUP BY t4.tiJianTime")
    List<Health> selectHealthStatus(@Param("lpId") String lpId);

    // 导出生命体征
    @Select("SELECT t.* FROM t_health t WHERE t.deleted =FALSE AND t.lpId = '${lpId}' and t.status = '2' order by t.tiJianTime ASC")
    List<Health> selectHealthStatusTwo(@Param("lpId") String lpId);
    // 导出特殊情况
    @Select("SELECT t.* FROM t_health t WHERE t.deleted =FALSE AND t.lpId = '${lpId}' and t.status = '3' order by t.tiJianTime ASC")
    List<Health> selectHealthStatusThree(@Param("lpId") String lpId);
    /**
     * 常规体检=》用药记录长期用药
     */

//	@Select("SELECT t2.`daiHao` AS daiHao,LEFT(t1.tiJianTime, 10) AS tiJianDate,t1.shiDuan,t1.doctor,t4.dicName AS dicName,t3.yongliang AS yaoliang, t3.`danwei` AS danwei, t3.`remark` AS remark,"
//		+" t3.kaishiTime AS kaishiTime, t3.pinci AS pinci, t3.jieshuTime AS jieshuTime"
//		+" FROM t_health t1 "
//		+" LEFT JOIN t_lien_personnel t2 ON t1.lpId = t2.id "
//		+" RIGHT JOIN t_health_drugs t3 ON t1.id = t3.`healthId`"
//		+" LEFT JOIN t_dictionary t4 ON t3.`dId` = t4.`id`"
//		+" WHERE t1.`deleted` = FALSE AND t2.id='${lpId}'  AND t3.yongyaoType = '0'  ORDER BY tiJianDate,shiDuan ASC")
//	List<Health> selectHealthYongYaoStatus(@Param("lpId") String lpId);
    @Select("SELECT t.*,t3.dicName AS guigeString,t4.dicName AS pinciString,t1.dicName AS yongfa,t2.dicName AS drugName,t5.dicName AS projectName FROM t_health_drugs t \n" +
            "LEFT JOIN t_dictionary t1 ON t.remark= t1.id\n" +
            "LEFT JOIN t_dictionary t2 ON t.dId= t2.id  "
            + "LEFT JOIN t_dictionary t3 ON t.danwei= t3.id "
            + "LEFT JOIN t_dictionary t4 ON t.pinci= t4.id " +
            "LEFT JOIN t_dictionary AS t5 ON t5.id = t.jianchaProject WHERE t.deleted =FALSE AND t.lpId = '${lpId}' AND t.yongyaoType= '${yongyaoType}' order by t.kaishiTime ASC")
    List<HealthDrugRelate> selectHealthYongYaoStatus(@Param("lpId") String lpId, @Param("yongyaoType") String yongyaoType);

    /**
     * 常规体检=》用药记录临时用药
     */

    @Select("SELECT t2.`daiHao` AS daiHao,LEFT(t1.tiJianTime, 10) AS tiJianDate,t1.shiDuan,t1.doctor,t4.dicName AS dicName,t3.yongliang AS yaoliang, t3.`danwei` AS danwei, t3.`remark` AS remark,"
            + " t3.kaishiTime AS kaishiTime, t3.pinci AS pinci, t3.jieshuTime AS jieshuTime"
            + " FROM t_health t1 "
            + " LEFT JOIN t_lien_personnel t2 ON t1.lpId = t2.id "
            + " RIGHT JOIN t_health_drugs t3 ON t1.id = t3.`healthId`"
            + " LEFT JOIN t_dictionary t4 ON t3.`dId` = t4.`id`"
            + " WHERE t1.`deleted` = FALSE AND t2.id='${lpId}'  AND t3.yongyaoType = '1'  ORDER BY tiJianDate,shiDuan ASC")
    List<Health> selectHealthYongYaoStatuls(@Param("lpId") String lpId);

    /**
     * 根据lpId 查询体检信息
     *
     * @param lpId
     * @return
     */
    @Select("SELECT t1.*,t2.daiHao FROM t_health t1 LEFT JOIN t_lien_personnel t2 ON t1.lpId = t2.id WHERE t1.status = '2' and "
            + "t1.lpId  = '${lpId}' and DATE_FORMAT(t1.tiJianTime,'%Y-%m-%d') = '${time}' ")
    List<Health> selectHealthSpecialCaseByLpIdAndTime(@Param("lpId") String lpId, @Param("time") String time);

    // 统计图 心率
    List<StatisticResultDto> selectlzXinLv(@Param("query") StatisticDto query);

    /**
     * 留置人员谈话情况统计
     *
     * @param statisticTanHuaDto
     * @return
     */
    List<StatisticTanHuaDto> selectStatisticTanHua(@Param("query") StatisticTanHuaDto statisticTanHuaDto);

    /**
     * 查询所有楼层房间列表
     * @param query
     * @return
     */
    List<Room> selectRoom(@Param("query") QueryParam<Room> query);

    /**
     * 查询所有房间里的床位列表
     * @param query
     * @return
     */
    List<Bed> selectBed(@Param("query") QueryParam<Bed> query);

    List<Drug> selectDrugFeiYong(@Param("start") String start, @Param("end") String end, @Param("drugNameString") String drugNameString);

    @Select("(SELECT  \"留置人员\" as type, COUNT(*) as\n" +
            "count\n" +
            "FROM t_lien_personnel WHERE t_lien_personnel.outStatus=0 AND t_lien_personnel.deleted=0)\n" +
            "UNION\n" +
            "(SELECT \"女留置人员\" as type, COUNT(*) as\n" +
            "count\n" +
            "FROM t_lien_personnel WHERE t_lien_personnel.outStatus=0 AND t_lien_personnel.deleted=0 AND t_lien_personnel.lzSex=1)\n" +
            "UNION\n" +
            "(SELECT \"男留置人员\" as type,\n" +
            "COUNT(*) as\n" +
            "count\n" +
            "FROM t_lien_personnel WHERE t_lien_personnel.outStatus=0 AND t_lien_personnel.deleted=0 AND t_lien_personnel.lzSex<>1)\n" +
            "UNION\n" +
            "(SELECT \"武警看护人员\" as type, COUNT(*) as\n" +
            "count\n" +
            "FROM t_lien_personnel WHERE t_lien_personnel.outStatus=0 AND t_lien_personnel.deleted=0 AND t_lien_personnel.kanhuLiLiang='40289287684f430c01684f7653b50006')\n" +
            "UNION\n" +
            "(SELECT \"女公安看护人员\" as type, COUNT(*) as\n" +
            "count\n" +
            "FROM t_lien_personnel WHERE t_lien_personnel.outStatus=0 AND t_lien_personnel.deleted=0 AND t_lien_personnel.kanhuLiLiang='40289287684f430c01684f7602c70005')\n" +
            "UNION\n" +
            "(SELECT \"男公安看护人员\" as type, COUNT(*) as\n" +
            "count\n" +
            "FROM t_lien_personnel WHERE t_lien_personnel.outStatus=0 AND t_lien_personnel.deleted=0 AND t_lien_personnel.kanhuLiLiang='40289287684f430c01684f755acb0004')")
    List<Map<String, Integer>> countLienPerson();

    @Select("( SELECT\n" +
            "\t\"留置人员\" AS type,\n" +
            "\tCOUNT(*) AS count \n" +
            "\tFROM\n" +
            "\t\tt_lien_personnel\n" +
            "\t\tLEFT JOIN t_room ON t_room.id = t_lien_personnel.roomNum \n" +
            "\tWHERE\n" +
            "\t\tt_lien_personnel.outStatus = 0 AND t_lien_personnel.deleted=0 \n" +
            "\t\tAND t_room.floorTier = '${floor}' \n" +
            "\t) UNION\n" +
            "\t(\n" +
            "\tSELECT\n" +
            "\t\t\"女留置人员\" AS type,\n" +
            "\t\tCOUNT(*) AS count \n" +
            "\tFROM\n" +
            "\t\tt_lien_personnel\n" +
            "\t\tLEFT JOIN t_room ON t_room.id = t_lien_personnel.roomNum \n" +
            "\tWHERE\n" +
            "\t\tt_lien_personnel.outStatus = 0 AND t_lien_personnel.deleted=0 \n" +
            "\t\tAND t_lien_personnel.lzSex = 1 \n" +
            "\t\tAND t_room.floorTier = '${floor}' \n" +
            "\t) UNION\n" +
            "\t(\n" +
            "\tSELECT\n" +
            "\t\t\"男留置人员\" AS type,\n" +
            "\t\tCOUNT(*) AS count \n" +
            "\tFROM\n" +
            "\t\tt_lien_personnel\n" +
            "\t\tLEFT JOIN t_room ON t_room.id = t_lien_personnel.roomNum \n" +
            "\tWHERE\n" +
            "\t\tt_lien_personnel.outStatus = 0 AND t_lien_personnel.deleted=0 \n" +
            "\t\tAND t_lien_personnel.lzSex <> 1 \n" +
            "\t\tAND t_room.floorTier = '${floor}' \n" +
            "\t) UNION\n" +
            "\t(\n" +
            "\tSELECT\n" +
            "\t\t\"武警看护人员\" AS type,\n" +
            "\t\tCOUNT(*) AS count \n" +
            "\tFROM\n" +
            "\t\tt_lien_personnel\n" +
            "\t\tLEFT JOIN t_room ON t_room.id = t_lien_personnel.roomNum \n" +
            "\tWHERE\n" +
            "\t\tt_lien_personnel.outStatus = 0 AND t_lien_personnel.deleted=0 \n" +
            "\t\tAND t_lien_personnel.kanhuLiLiang = '40289287684f430c01684f7653b50006' \n" +
            "\t\tAND t_room.floorTier = '${floor}' \n" +
            "\t) UNION\n" +
            "\t(\n" +
            "\tSELECT\n" +
            "\t\t\"女公安看护人员\" AS type,\n" +
            "\t\tCOUNT(*) AS count \n" +
            "\tFROM\n" +
            "\t\tt_lien_personnel\n" +
            "\t\tLEFT JOIN t_room ON t_room.id = t_lien_personnel.roomNum \n" +
            "\tWHERE\n" +
            "\t\tt_lien_personnel.outStatus = 0 AND t_lien_personnel.deleted=0 \n" +
            "\t\tAND t_lien_personnel.kanhuLiLiang = '40289287684f430c01684f7602c70005' \n" +
            "\t\tAND t_room.floorTier = '${floor}'\n" +
            "\t) UNION\n" +
            "\t(\n" +
            "\tSELECT\n" +
            "\t\t\"男公安看护人员\" AS type,\n" +
            "\t\tCOUNT(*) AS count \n" +
            "\tFROM\n" +
            "\t\tt_lien_personnel\n" +
            "\t\tLEFT JOIN t_room ON t_room.id = t_lien_personnel.roomNum \n" +
            "\tWHERE\n" +
            "\t\tt_lien_personnel.outStatus = 0 AND t_lien_personnel.deleted=0 \n" +
            "\tAND t_lien_personnel.kanhuLiLiang = '40289287684f430c01684f755acb0004' \n" +
            "\tAND t_room.floorTier = '${floor}')")
    List<Map<String, Integer>> countLienPersonByFloor(@Param("floor") String floor);

}