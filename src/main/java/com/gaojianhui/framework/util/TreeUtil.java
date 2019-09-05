package com.gaojianhui.framework.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cglib.beans.BeanMap;

import com.gaojianhui.framework.dto.TreeNode;

/**
 * 树形结构工具类
 *
 * 将一组list对象转成树形结构
 * 该list需符合设定的字段类型
 *
 */

public class TreeUtil {
	public static Map<String,Object> mapArray = new LinkedHashMap<String, Object>();
	 
    public List<TreeNode> menuCommon;
    public List<Object> list = new ArrayList<Object>();
 
    public List<Object> treeMenu(List<TreeNode> menu){
        this.menuCommon = menu;
        Collections.sort(this.menuCommon, new Comparator<TreeNode>(){
            /*
             * int compare(TreeNode p1, TreeNode p2) 返回一个基本类型的整型，
             * 返回负数表示：p1 小于p2，
             * 返回0 表示：p1和p2相等，
             * 返回正数表示：p1大于p2
             */
            public int compare(TreeNode p1, TreeNode p2) {
                //按照TreeNode的年龄进行升序排列
            	    int p1sort=0;
            	    int p2sort=0;
            	    if(p1.getSortindex()!=null) {
            	    		p1sort =p1.getSortindex().intValue();
            	    }
            	    if(p2.getSortindex()!=null) {
	        	    		p2sort =p2.getSortindex().intValue();
	        	    }
                if(p1sort > p2sort){
                    return 1;
                }
                if(p1sort== p2sort){
                    return 0;
                }
                return -1;
            }
        });
        for (TreeNode treeNode : menu) {
            Map<String,Object> mapArr = new LinkedHashMap<String, Object>();
            if(treeNode.getPid()==null||treeNode.getPid().equals("0")){
                setTreeMap(mapArr,treeNode);
                list.add(mapArr);
            }
        }
        return list;
    }
 
    public List<?> menuChild(String id){
        List<Object> lists = new ArrayList<Object>();
        for(TreeNode a:menuCommon){
            Map<String,Object> childArray = new LinkedHashMap<String, Object>();
            if(id.equals(a.getPid() )){
               setTreeMap(childArray,a);
               lists.add(childArray);
            }
        }
        return lists;
    }
 
    private void setTreeMap(Map<String,Object> mapArr,TreeNode treeNode){
    	
    		mapArr=beanToMap(treeNode,mapArr);
        mapArr.put("id", treeNode.getId());
        mapArr.put("pid", treeNode.getPid());
        mapArr.put("title", treeNode.getName());
//        mapArr.put("", value)
        List<?> childrens = menuChild(treeNode.getId());
        if(childrens.size()>0){
            mapArr.put("hasChild",true);
        }
        else{
            mapArr.put("hasChildren",false);
        }
        mapArr.put("children", menuChild(treeNode.getId()));
    }
    /**
     * 将javabean封装为map
     * @param bean
     * @param map
     * @return
     */
    public static <T> Map<String, Object> beanToMap(T bean,Map<String,Object> map) {
		if (bean != null) {
			BeanMap beanMap = BeanMap.create(bean);
			for (Object key : beanMap.keySet()) {
				map.put(key+"", beanMap.get(key));
			}			
		}
		return map;
	}
    
    /**
	 * 将map装换为javabean对象
	 * @param map
	 * @param bean
	 * @return
	 */
	public static <T> T mapToBean(Map<String, Object> map,T bean) {
		BeanMap beanMap = BeanMap.create(bean);
		beanMap.putAll(map);
		return bean;
	}

	
}
