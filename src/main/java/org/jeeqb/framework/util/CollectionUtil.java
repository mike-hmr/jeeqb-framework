package org.jeeqb.framework.util;

import org.apache.commons.collections.CollectionUtils;

import java.util.Collection;

/**
 * 集合操作工具类
 * Created by rocky on 2017/12/26.
 */
public class CollectionUtil {

    /**
     * 判断集合是否非空
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return CollectionUtils.isNotEmpty(collection);
    }

    /**
     * 判断集合是否为空
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }
}
