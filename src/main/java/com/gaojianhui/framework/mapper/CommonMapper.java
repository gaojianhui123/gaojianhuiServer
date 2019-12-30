package com.gaojianhui.framework.mapper;

import com.gaojianhui.framework.model.ProtectedResource;
import com.gaojianhui.framework.model.Dictionary;
import org.springframework.stereotype.Repository;
import com.gaojianhui.framework.page.QueryParam;
import org.apache.ibatis.annotations.Param;
import java.util.List;

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

}