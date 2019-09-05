package com.sanyi.framework.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sanyi.framework.dto.TreeNode;
import com.sanyi.framework.model.BaseTreeEntity;
 
/**
 * Created by Massive on 2016/12/26.
 */
public class TreeBuilder<T extends BaseTreeEntity> {

	 
	    /**
	     * 使用递归方法建树
	     * @param treeNodes
	     * @return
	     */
	    public   List<T> buildByRecursive(List<T> treeNodes) {
	        List<T> trees = new ArrayList<T>();
	        for (T treeNode : treeNodes) {
	            if (treeNode.getPid()==null||"0".equals(treeNode.getPid())) {
	                trees.add(findChildren(treeNode,treeNodes));
	            }
	        }
	        Collections.sort(trees, new Comparator<T>(){
	            /*
	             * int compare(TreeNode p1, TreeNode p2) 返回一个基本类型的整型，
	             * 返回负数表示：p1 小于p2，
	             * 返回0 表示：p1和p2相等，
	             * 返回正数表示：p1大于p2
	             */
	            public int compare(T p1, T p2) {
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
	        return trees;
	    }
	 
	    /**
	     * 递归查找子节点
	     * @param treeNodes
	     * @return
	     */
	    public  T findChildren(T treeNode,List<T> treeNodes) {
	        for (T it : treeNodes) {
	            if(treeNode.getId().equals(it.getPid())) {
	                if (treeNode.getChildren() == null) {
	                    treeNode.setChildren(new ArrayList<T>());
	                }
	                treeNode.getChildren().add(findChildren(it,treeNodes));
	            }
	        }
	        return treeNode;
	    }
 
}

