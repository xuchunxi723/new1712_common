package com.xcx.common.junit;

import java.util.Collection;

public class CollectionUtil {
	/**
	 * 
	 * @Title: isEmpty 
	 * @Description: 判断集合是否有值
	 * @param collection
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmpty(Collection<?> collection) {
		return collection==null || collection.isEmpty();
		//return collection==null || collection.size()==0;
		
	}
}
