package com.sanyi.framework.mybatisTypeHandler;


import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
public abstract class AbstractListJsonTypeHandler<T> extends BaseTypeHandler<List<T>> {

    private Class<T> clazz;
    private TypeReference<ArrayList<T>> typeRef;
//    public AbstractListJsonTypeHandler() {
//    		super();
//    }
    public AbstractListJsonTypeHandler(Class<T> clazz) {
        this.clazz = clazz;
        this.typeRef = new TypeReference<ArrayList<T>>(clazz){};
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<T> parameter, JdbcType jdbcType) throws SQLException {
        String json = JSON.toJSONString(parameter);
        ps.setString(i, json);
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return parseJson(rs.getString(columnName));
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return parseJson(rs.getString(columnIndex));
    }

    @Override
    public List<T> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return parseJson(cs.getString(columnIndex));
    }

    private List<T> parseJson(String json) {

    		return JSON.parseObject(json, this.typeRef);
//        return JSON.parseArray(json, clazz);
    }
    
}
